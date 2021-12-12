package com.mo_zarara.savevalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mo_zarara.save_values.SaveValues;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SaveValues.init(this);

        SaveValues.setInt("one", 100);

        SaveValues.remove("one");

        Log.d(TAG, "mymy onCreate: " + SaveValues.getInt("one", 0));


    }
}