package com.mo_zarara.save_values;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class  SaveValues {

    static SharedPreferences pref;
    static SharedPreferences.Editor editor;
    static Context mContext;

    public static void init(Context context) {
        mContext = context;
        pref = context. getSharedPreferences("myPref", MODE_PRIVATE);
        editor = pref.edit();
    }


    public static void setSring(String key, String value){
        editor.putString(key, value);  // Saving string
        editor.apply(); // commit changes
    }

    public static String getSring(String key){
        return pref.getString(key, null);
    }


/////////////////////////////////////////////////////

    public static void setInt(String key, int value){
        editor.putInt(key, value);  // Saving int
        editor.apply(); // commit changes
    }

    public static int getInt(String key, int defaultValue){
        return pref.getInt(key, defaultValue);
    }


///////////////////////////////////////////////////////////////


    public static void setFloat(String key, float value){
        editor.putFloat(key, value);  // Saving float
        editor.apply(); // commit changes
    }


    public static float getFloat(String key, float defaultValue){
        return pref.getFloat(key, defaultValue);
    }

//////////////////////////////////////////////////////


    public static void setBoolean(String key, boolean value){
        editor.putBoolean(key, value);  // Saving bool
        editor.apply(); // commit changes
    }

    public static boolean getBoolean(String key, boolean defaultValue){
        return pref.getBoolean(key, defaultValue);
    }

    //////////////////////////////////////////////////////////////

    public static void deleteAll(){
        editor.clear();
        editor.apply();
    }


    /////////////////////////////////////////////

    public static void remove(String key){
        editor.remove(key); // will delete key
        editor.apply(); // commit changes
    }


}
