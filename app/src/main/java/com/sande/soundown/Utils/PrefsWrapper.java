package com.sande.soundown.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Sandeep on 20-05-2016.
 */
public class PrefsWrapper {
    public final String SHARED_PRES="SNDWN";
    SharedPreferences mSharedPrefs;
    Context context;


    public PrefsWrapper(Context context){
        this.context=context;
        mSharedPrefs=context.getSharedPreferences(SHARED_PRES,Context.MODE_PRIVATE);
    }



    //getters

    public boolean isLoggedIn(){
        return mSharedPrefs.getBoolean(ProjectConstants.IS_LOGGED_IN,false);
    }

    public String getAccessToken(){
        return mSharedPrefs.getString(ProjectConstants.ACCESS_TOKEN,"");
    }


    public long getUserID(){
        return mSharedPrefs.getLong(ProjectConstants.USER_ID,-1);
    }




    //setters

    public PrefsWrapper setUserID(long userID){
        SharedPreferences.Editor mShareEdit=mSharedPrefs.edit();
        mShareEdit.putLong(ProjectConstants.USER_ID,userID);
        mShareEdit.apply();
        return this;
    }

    public PrefsWrapper setAccessToken(String accesstoken){
        SharedPreferences.Editor mShareEdit=mSharedPrefs.edit();
        mShareEdit.putString(ProjectConstants.ACCESS_TOKEN,accesstoken);
        mShareEdit.apply();
        return this;
    }

    public PrefsWrapper setIsLoggedIn(boolean isli){
        SharedPreferences.Editor mShareEdit=mSharedPrefs.edit();
        mShareEdit.putBoolean(ProjectConstants.IS_LOGGED_IN,isli);
        mShareEdit.apply();
        return this;
    }


}