package com.googledevelopersgroup.intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String LIFECYCLE_TAG = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LIFECYCLE_TAG, "onCreate() called -Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        Log.d(LIFECYCLE_TAG, "onResume() called -Activity");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d(LIFECYCLE_TAG, "onStop() called -Activity");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d(LIFECYCLE_TAG, "onDestroy() called -Activity");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(LIFECYCLE_TAG, "onRestart() called -Activity");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d(LIFECYCLE_TAG, "onPause() called -Activity");
        super.onPause();

    }

    @Override
    protected void onStart() {
        Log.d(LIFECYCLE_TAG, "onStart() called -Activity");
        super.onStart();

    }
}
