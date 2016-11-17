package com.example.aviyay.ex2javaworkshoplifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    final String ACTIVITY_LIFE_TAG = "activity lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(ACTIVITY_LIFE_TAG, "onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ACTIVITY_LIFE_TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ACTIVITY_LIFE_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ACTIVITY_LIFE_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ACTIVITY_LIFE_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ACTIVITY_LIFE_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ACTIVITY_LIFE_TAG, "onDestroy");
    }
}
