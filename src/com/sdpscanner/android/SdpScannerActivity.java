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

import java.util.ArrayList;
import java.util.HashSet;

public class SdpScannerActivity extends Activity {

	private final String TAG = "SdpScanner";
	public static final String PICKER_ACTION = "android.bluetooth.devicepicker.action.LAUNCH";
	public static final String PICKER_SELECTED = "android.bluetooth.devicepicker.action.DEVICE_SELECTED";

    private BluetoothDevice mDevice;
    private BluetoothAdapter mBluetoothAdapter;

    private ArrayAdapter mArrayAdapter;
    private ArrayList<String> DiscoveredServices;
    private ListView ServicesListView;

    private Profile mA2DP;
	private Profile mAVRCCP;
	private Profile mDUN;
	private Profile mFTP;
	private Profile mHFP;
	private Profile mHSP;
	private Profile mHID;
	private Profile mMAP;
	private Profile mOPP;
	private Profile mSAP;

    public class Profile{
		public String Name;
		public ArrayList<String> Services;

	}

	private final BroadcastReceiver mPickerReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            Log.d(TAG, "mPickerReceiver get " + action);

            if (PICKER_SELECTED.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
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
				Parcelable uuids[] = intent.getParcelableArrayExtra(BluetoothDevice.EXTRA_UUID);

				//stopUuidProgressBar();

				if (uuids != null) {
					for (Parcelable uuid : uuids) {
						Log.d(TAG, "uuid:" + uuid);
						if(BluetoothAllUuid.AudioSource.equals(uuid)){
							AddService("AudioSource");
						}
						else if(BluetoothAllUuid.AudioSink.equals(uuid)){
							AddService("AudioSink");
						}
						else if(BluetoothAllUuid.AdvancedAudioDistribution.equals(uuid)){
							AddService("AdvAudioDist");
						}
						else if(BluetoothAllUuid.AvrcpTarget.equals(uuid)){
							AddService("AvrcpTarget");
						}
						else if(BluetoothAllUuid.AvrcpController.equals(uuid)){
							AddService("AvrcpController");
						}
						else if(BluetoothAllUuid.Handsfree.equals(uuid)){
							AddService("Handsfree");
						}
						else if(BluetoothAllUuid.HandsfreeAudioGateway.equals(uuid)){
							AddService("Handsfree_AG");
						}
						else if(BluetoothAllUuid.Headset.equals(uuid)){
							AddService("HSP");
						}
						else if(BluetoothAllUuid.HeadsetAudioGateway.equals(uuid)){
							AddService("HSP_AG");
						}
						else if(BluetoothAllUuid.HumanInterfaceDeviceService.equals(uuid)){
							AddService("Hid");
						}
						else if(BluetoothAllUuid.MAS.equals(uuid)){
							AddService("MAS");
						}
						else if(BluetoothAllUuid.MNS.equals(uuid)){
							AddService("MNS");
						}
						else if(BluetoothAllUuid.MAP.equals(uuid)){
							AddService("MAP");
						}
						else if(BluetoothAllUuid.OBEXObjectPush.equals(uuid)){
							AddService("ObexObjectPush");
						}
						else if(BluetoothAllUuid.OBEXFileTransfer.equals(uuid)){
							AddService("OBEXFileTransfer");
						}
						else if(BluetoothAllUuid.PANU.equals(uuid)){
							AddService("PANU");
						}
						else if(BluetoothAllUuid.NAP.equals(uuid)){
							AddService("NAP");
						}
						else if(BluetoothAllUuid.PBAP_PSE.equals(uuid)){
							AddService("PBAP_PSE");
						}
						else if(BluetoothAllUuid.PBAP_PCE.equals(uuid)){
							AddService("PBAP_PCE");
						}
						else if(BluetoothAllUuid.BNEP.equals(uuid)){
							AddService("BNEP");
						}
						else if(BluetoothAllUuid.BASE_UUID.equals(uuid)){
							AddService("BASE_UUID");
						}
						else{
							Log.d(TAG, "no match service");
						}
					}
				}
			}
		}
	};

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

		ServicesListView = (ListView)findViewById(R.id.service_list);

		DiscoveredServices = new ArrayList<String>();
        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, DiscoveredServices);
		ServicesListView.setAdapter(mArrayAdapter);

		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
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
			    mArrayAdapter.notifyDataSetChanged();
			}

			//startUuidProgressBar();
			if(mDevice != null){
			    mDevice.fetchUuidsWithSdp();
			}
		}
    }

	private void updateDevice(BluetoothDevice device){

		mDevice = device;
		TextView name = (TextView)findViewById(R.id.device_name);
		TextView bd_addr = (TextView)findViewById(R.id.device_addr);

		if(device != null){
		    name.setText(mDevice.getName());
			bd_addr.setText(mDevice.getAddress());
		}
		DiscoveredServices.clear();
	}

    private void AddService(String service){

		if(!DiscoveredServices.contains(service)){
		    DiscoveredServices.add(service);
            mArrayAdapter.notifyDataSetChanged();
		}
	}

    private void enableBluetooth(){

        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivity(enableBtIntent);
    }

	private void dump_arraylist(ArrayList<String> al){

		for(int i=0; i<al.size(); i++){
		    Log.d(TAG, "al[" + i + "]:" + al.get(i));
		}
	}

}
