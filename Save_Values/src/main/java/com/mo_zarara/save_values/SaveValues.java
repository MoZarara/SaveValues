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

    


    public static void write(String key, String value){
        editor.putString(key, value);  // Saving string
        editor.apply(); // commit changes
    }

    public static String read(String key){
        return pref.getString(key, null);
    }


/////////////////////////////////////////////////////

    public static void write(String key, int value){
        editor.putInt(key, value);  // Saving int
        editor.apply(); // commit changes
    }

    public static int read(String key, int defaultValue){
        return pref.getInt(key, defaultValue);
    }


///////////////////////////////////////////////////////////////


    public static void write(String key, float value){
        editor.putFloat(key, value);  // Saving float
        editor.apply(); // commit changes
    }


    public static float read(String key, float defaultValue){
        return pref.getFloat(key, defaultValue);
    }

//////////////////////////////////////////////////////


    public static void write(String key, boolean value){
        editor.putBoolean(key, value);  // Saving bool
        editor.apply(); // commit changes
    }

    public static boolean read(String key, boolean defaultValue){
        return pref.getBoolean(key, defaultValue);
    }

    //////////////////////////////////////////////////////////////


    public static void deleteAll(){
        editor.clear();
        editor.apply();
    }


    /////////////////////////////////////////////

    public static void delete(String key){
        editor.remove(key); // will delete key
        editor.apply(); // commit changes
    }


}
