package com.sdpscanner.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ParcelUuid;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ProgressBar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.LinearLayout;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashSet;

public class SdpScannerActivity extends Activity {

	private final String TAG = "SdpScanner";
	public static final String PICKER_ACTION = "android.bluetooth.devicepicker.action.LAUNCH";
	public static final String PICKER_SELECTED = "android.bluetooth.devicepicker.action.DEVICE_SELECTED";

    private BluetoothDevice mDevice;
    private BluetoothAdapter mBluetoothAdapter;
    private boolean isSecondUUIDs;

    private ProfileAdapter mAdapter;
    private ArrayList<Integer> DiscoveredServices;
    private ArrayList<Parcelable> UnknowServices;
    private ListView ServicesListView;
    private ArrayList<Profile> DiscoveredProfiles;

    private TextView name_tv;
    private View name_line;
    private TextView bd_addr_tv;
    private View bd_addr_line;

    private Profile mA2DP;
	private Profile mAVRCP;
	private Profile mBIP;
	private Profile mBPP;
	//private Profile mDI;
	private Profile mDUN;
	private Profile mFTP;
	//private Profile mGAVDP;
	//private Profile mGOEP;
	private Profile mHFP;
	//private Profile mHCRP;
	//private Profile mHDP;
	private Profile mHSP;
	//private Profile mHID;
	private Profile mMAP;
	//private Profile mMPS;
	private Profile mOPP;
	private Profile mPBAP;
	private Profile mPAN;
	private Profile mSAP;
	//private Profile mSDAP;
	private Profile mSPP;
	private Profile mSYNCP;
	private Profile mVDP;
	private Profile mOTHERS;


	private final BroadcastReceiver mPickerReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            Log.d(TAG, "mPickerReceiver get " + action);

            if (PICKER_SELECTED.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                Log.d(TAG, "select device: " + device.getName());
                updateDevice(device);
                unregisterReceiver(mPickerReceiver);
            }
        }
    };

    private final BroadcastReceiver mUuidReceiver = new BroadcastReceiver() {
		@Override
        public void onReceive(Context context, Intent intent) {

			String action = intent.getAction();
			Log.d(TAG, "mUuidReceiver get " + action);
			if (BluetoothDevice.ACTION_UUID.equals(action)) {
				BluetoothDevice dev = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
				if (!dev.equals(mDevice)) {
					return;
				}
                if(isSecondUUIDs){
                    Log.d(TAG, "Return second intent of UUID");
                    return;
                }
				Parcelable uuids[] = intent.getParcelableArrayExtra(BluetoothDevice.EXTRA_UUID);

				//stopUuidProgressBar();

				if (uuids != null) {
					for (Parcelable uuid : uuids) {
						Log.d(TAG, "uuid:" + uuid);
                        int service = BluetoothAllUuid.getServiceFromUuid(uuid);
                        if(service != Profile.UnknowService){
                            if(!DiscoveredServices.contains(service)){
                                DiscoveredServices.add(service);
                            }
                        } else{
                            if(!UnknowServices.contains(uuid)){
                                UnknowServices.add(uuid);
                                //TODO
                                //mAdapter.notifyDataSetChanged();
                            }
                        }
                    }
                    //dumpDiscoveredServices();
                    handleDiscoveredServics();
                    isSecondUUIDs = true;
				}
			}
		}
	};

    public void initial(){

        DiscoveredProfiles = new ArrayList();
        DiscoveredServices = new ArrayList<Integer>();
        UnknowServices = new ArrayList();
        mAdapter = new ProfileAdapter(this, DiscoveredProfiles, UnknowServices);

        mA2DP = new Profile(Profile.A2dpProfile);
        mAVRCP = new Profile(Profile.AvrcpProfile);
        mBIP = new Profile(Profile.BipProfile);
        mBPP = new Profile(Profile.BppProfile);
        mDUN = new Profile(Profile.DunProfile);
        mFTP = new Profile(Profile.FtpProfile);
        mHFP = new Profile(Profile.HfpProfile);
        mHSP = new Profile(Profile.HspProfile);
        mMAP = new Profile(Profile.MapProfile);
        mOPP = new Profile(Profile.OppProfile);
        mPBAP = new Profile(Profile.PbapProfile);
        mPAN = new Profile(Profile.PanProfile);
        mSAP = new Profile(Profile.SapProfile);
        mSPP = new Profile(Profile.SppProfile);
        mSYNCP = new Profile(Profile.SyncProfile);
        mVDP = new Profile(Profile.VdpProfile);
        mOTHERS = new Profile(Profile.UnknowProfile);

	}

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

		ServicesListView = (ListView)findViewById(R.id.service_list);
        name_tv = (TextView)findViewById(R.id.device_name);
        name_line = (View)findViewById(R.id.device_underLine);
        bd_addr_tv = (TextView)findViewById(R.id.device_addr);
        bd_addr_line = (View) findViewById(R.id.addr_underLine);

		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        adjustTextUnderline();
        isSecondUUIDs = false;
        initial();
        ServicesListView.setAdapter(mAdapter);


    }

    @Override
	protected void onStart(){
	    super.onStart();

        Log.d(TAG, "onStart");

		IntentFilter filter1 = new IntentFilter();
		filter1.addAction(PICKER_SELECTED);
		registerReceiver(mPickerReceiver, filter1);

		IntentFilter filter2 = new IntentFilter();
        filter2.addAction(BluetoothDevice.ACTION_UUID);
        registerReceiver(mUuidReceiver, filter2);

	}

    @Override
	protected void onStop(){
	    super.onStop();

		Log.d(TAG, "onStop");

		unregisterReceiver(mUuidReceiver);
	}

	public void onButtonClick(View v){

		Log.d(TAG,"onButtonClick");

		if(mBluetoothAdapter == null){
		    Log.d(TAG, "Device not support Bluetooth");
		}
		else {
		    if(!mBluetoothAdapter.isEnabled()){
		        enableBluetooth();
		        return;
		    }
		}

		if (v.getId() == R.id.select_device) {
			Log.d(TAG, "select device");

			Intent intent = new Intent(PICKER_ACTION);
			intent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			startActivity(intent);
		}
		else if (v.getId() == R.id.discovery_device_services) {
			//Toast.makeText(this, "discovery" , Toast.LENGTH_SHORT).show();
			Log.d(TAG, "discovery start");
			if(DiscoveredServices.size() != 0){
				DiscoveredServices.clear();
			}

			//startUuidProgressBar();
			if(mDevice != null){
			    mDevice.fetchUuidsWithSdp();
			}
		}
    }

	private void updateDevice(BluetoothDevice device){

		mDevice = device;
		if(device != null){
		    name_tv.setText(mDevice.getName());
            bd_addr_tv.setText(mDevice.getAddress());
		}
		isSecondUUIDs = false;
        adjustTextUnderline();
		cleanUp();
		mAdapter.notifyDataSetChanged();
	}
/*
    private void AddService(int service){

		if(!DiscoveredServices.contains(service)){
		    DiscoveredServices.add(service);
		}
	}
*/
    private void enableBluetooth(){

        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivity(enableBtIntent);
    }

	private void dumpDiscoveredProfiles(){

        if(DiscoveredProfiles == null)return;

        Log.d(TAG, "dump DiscoveredProfiles");
        for(int i=0; i<DiscoveredProfiles.size(); i++){

            ArrayList<Integer> s = DiscoveredProfiles.get(i).getServices();
            Log.d(TAG, "----- " + i + " -----");
            Log.d(TAG,"Profile: " + DiscoveredProfiles.get(i).getReadableProfileName());
            for(int j=0; j<s.size(); j++){
                Log.d(TAG, "Service: " + DiscoveredProfiles.get(i).getReadableServiceName(s.get(j)));
            }
        }
    }

	private void dumpDiscoveredServices(){
        if(DiscoveredServices == null)return;

        Log.d(TAG, "dump DiscoveredServices");
        for(int i=0; i<DiscoveredServices.size(); i++){
            Log.d(TAG, "Service: " + DiscoveredServices.get(i));
        }
    }

    private void handleDiscoveredServics(){
        Log.d(TAG, "handleDiscoveredService");

        for(int service: DiscoveredServices){

            if(Profile.A2dpProfileServices.contains(service)){
                if(!mA2DP.containService(service)){
                    mA2DP.AddService(service);
                }
            } else if(Profile.AvrcpProfileServices.contains(service)){
                if(!mAVRCP.containService(service)){
                    mAVRCP.AddService(service);
                }
            } else if(Profile.BipProfileServices.contains(service)){
                if(!mBIP.containService(service)){
                    mBIP.AddService(service);
                }
            } else if(Profile.BppProfileServices.contains(service)){
                if(!mBPP.containService(service)){
                    mBPP.AddService(service);
                }
            } else if(Profile.DunProfileServices.contains(service)){
                if(!mDUN.containService(service)){
                    mDUN.AddService(service);
                }
            } else if(Profile.FtpProfileServices.contains(service)){
                if(!mFTP.containService(service)){
                    mFTP.AddService(service);
                }
            } else if(Profile.HfpProfileServices.contains(service)){
                if(!mHFP.containService(service)){
                    mHFP.AddService(service);
                }
            } else if(Profile.HspProfileServices.contains(service)){
                if(!mHSP.containService(service)){
                    mHSP.AddService(service);
                }
            } else if(Profile.MapProfileServices.contains(service)){
                if(!mMAP.containService(service)){
                    mMAP.AddService(service);
                }
            } else if(Profile.OppProfileServices.contains(service)){
                if(!mOPP.containService(service)){
                    mOPP.AddService(service);
                }
            } else if(Profile.PbapProfileServices.contains(service)){
                if(!mPBAP.containService(service)){
                    mPBAP.AddService(service);
                }
            } else if(Profile.PanProfileServices.contains(service)){
                if(!mPAN.containService(service)){
                    mPAN.AddService(service);
                }
            } else if(Profile.SapProfileServices.contains(service)){
                if(!mSAP.containService(service)){
                    mSAP.AddService(service);
                }
            } else if(Profile.SppProfileServices.contains(service)){
                if(!mSPP.containService(service)){
                    mSPP.AddService(service);
                }
            } else if(Profile.SyncProfileServices.contains(service)){
                if(!mSYNCP.containService(service)){
                    mSYNCP.AddService(service);
                }
            } else if(Profile.VdpProfileServices.contains(service)){
                if(!mVDP.containService(service)){
                    mVDP.AddService(service);
                }
            } else {
                // handle servie where its profile is unknow
                if(!mOTHERS.containService(service)){
                    mOTHERS.AddService(service);
                }
            }
        }
        Profile[] tmp = {mA2DP, mAVRCP, mBIP, mBPP, mDUN, mFTP, mHFP, mHSP, mMAP,
		        mOPP, mPBAP, mPAN, mSAP, mSPP,mSYNCP, mVDP, mOTHERS};
        for(Profile profile: tmp){
            if(profile.getServicesCount() != 0){
                DiscoveredProfiles.add(profile);
            }
        }
        mAdapter.notifyDataSetChanged();
        dumpDiscoveredProfiles();
    }
    private void cleanUp(){

        DiscoveredServices.clear();
        UnknowServices.clear();
        DiscoveredProfiles.clear();

        mA2DP.cleanUpServices();
        mAVRCP.cleanUpServices();
        mBIP.cleanUpServices();
        mBPP.cleanUpServices();
        mDUN.cleanUpServices();
        mFTP.cleanUpServices();
        mHFP.cleanUpServices();
        mHSP.cleanUpServices();
        mMAP.cleanUpServices();
        mOPP.cleanUpServices();
        mPBAP.cleanUpServices();
        mPAN.cleanUpServices();
        mSAP.cleanUpServices();
        mSPP.cleanUpServices();
        mSYNCP.cleanUpServices();
        mVDP.cleanUpServices();
        mOTHERS.cleanUpServices();
	}

	private void adjustTextUnderline(){

        // Handle under lines
        LinearLayout ll_dp = (LinearLayout)findViewById(R.id.device_parent);
        ll_dp.measure(0, 0);
        ViewGroup.LayoutParams name_params = name_line.getLayoutParams();
        name_params.width = ll_dp.getMeasuredWidth();
        name_line.setLayoutParams(name_params);

        LinearLayout ll_ap = (LinearLayout)findViewById(R.id.addr_parent);
        ll_ap.measure(0, 0);
        ViewGroup.LayoutParams bd_addr_params = bd_addr_line.getLayoutParams();
        bd_addr_params.width = ll_ap.getMeasuredWidth();
        bd_addr_line.setLayoutParams(bd_addr_params);
	}
}
