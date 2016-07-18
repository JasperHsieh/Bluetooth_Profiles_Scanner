package com.sdpscanner.android;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import android.os.ParcelUuid;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.graphics.Color;

import java.util.ArrayList;


public class ProfileAdapter extends BaseAdapter {

    private ArrayList<Profile> listProfiles;
	private ArrayList<Parcelable> listUnknowServices;
	private final Context mContext;
	private String TAG ="SdpScanner";
	private int hasUnknowService;

	public ProfileAdapter(Context context, ArrayList<Profile> profiles, ArrayList<Parcelable> unknowServices){
	    mContext = context;
		listProfiles = profiles;
		listUnknowServices = unknowServices;
	}
	
	@Override
	public int getCount(){
        if(listUnknowServices.size() > 0){
            hasUnknowService = 1;
        } else{
            hasUnknowService = 0;
        }
        return listProfiles.size() + hasUnknowService; // all profiles + unknow services
	}

	@Override
	public Object getItem(int position){
	    // Let last item be unknow Services, others are profiles
		Log.d(TAG, "getItem");
		if(position < getCount() - hasUnknowService){
		    dumpProfile(listProfiles.get(position));
			return listProfiles.get(position);
		} else if (position == getCount() - hasUnknowService){
		    return listUnknowServices;
		} else{
		    return null;
		}
	}

	@Override public long getItemId(int position){
	    return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent){
	    
		class Holder{
		    LinearLayout linearLayout;
			TextView profile_tv;
			Holder(TextView p, LinearLayout l){
				linearLayout = l;
			    profile_tv = p;
			}
		}
	    Log.d(TAG, "getView, position: " + position + " ----------");	
		LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		Holder holder;
        
		if(convertView == null){
		    Log.d(TAG, "convertView is null");
            // handle view is null
			convertView = mInflater.inflate(R.layout.profileview, null);
			LinearLayout ll = (LinearLayout)convertView.findViewById(R.id.service_item);
		    TextView profile_textview = (TextView)convertView.findViewById(R.id.supported_profile);
			holder = new Holder(profile_textview, ll);
            convertView.setTag(holder);

        } else {
            Log.d(TAG, "convertView is not null");
            // use the old view
            holder = (Holder) convertView.getTag();
        }

        // Remove services view every time at first when getView is called
        Log.d(TAG, "layout children count before: " + ((ViewGroup)holder.linearLayout).getChildCount());
        ((ViewGroup)holder.linearLayout).removeAllViews();
        Log.d(TAG, "layout children count after: " + ((ViewGroup)holder.linearLayout).getChildCount());

        Profile profile;
		ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		Log.d(TAG, "jasper getCount: " + getCount());
		if(position < getCount() - hasUnknowService){
		    Log.d(TAG, "Know Services");
            // handle Know profile and unknow profile(but know services)
            profile = (Profile)getItem(position);
            holder.profile_tv.setText(profile.getReadableProfileName());
            ArrayList<Integer> services = profile.getServices();

		    for(int i=0; i<services.size(); i++){
			    TextView service_tv = new TextView(mContext);
		   	    TextView service_uuid_tv = new TextView(mContext);

                Log.d(TAG, "Adding service to row");
                service_tv.setText(profile.getReadableServiceName(services.get(i)));
                service_tv.setTextColor(Color.parseColor("#7e7c7c"));
                service_uuid_tv.setText(profile.getUuid(services.get(i)));
                service_uuid_tv.setTextColor(Color.parseColor("#7e7c7c"));

				holder.linearLayout.addView(service_tv, params);
				holder.linearLayout.addView(service_uuid_tv, params);
		    }
			
		} else if(position == getCount() - hasUnknowService){
		    Log.d(TAG, "Unknow services");
			// handle unknow services
            
			ArrayList<ParcelUuid> unknowServices = (ArrayList<ParcelUuid>)getItem(position);
            if(unknowServices.size() != 0){
                holder.profile_tv.setText("Unknow Services");
                for(ParcelUuid uuid: unknowServices){
                    TextView unknowService_tv = new TextView(mContext);
                    unknowService_tv.setText(uuid.toString());
                    unknowService_tv.setTextColor(Color.parseColor("#7e7c7c"));
                    holder.linearLayout.addView(unknowService_tv,params);
                }
            }

        }
		Log.d(TAG, "layout children count: " + ((ViewGroup)holder.linearLayout).getChildCount());
		return convertView;
	}

    private void dumpProfile(Profile p){
	    Log.d(TAG, "dumpProfile: " + p.getReadableProfileName());
		ArrayList<Integer> s = p.getServices();
		for(int i=0; i<s.size(); i++){
		    Log.d(TAG, "dumpService: " + p.getReadableServiceName(s.get(i)));
		}
	}


}
