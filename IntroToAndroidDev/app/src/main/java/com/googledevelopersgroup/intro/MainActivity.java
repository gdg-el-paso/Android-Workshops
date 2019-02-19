package com.googledevelopersgroup.intro;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //The tag we use to filter the logcat, for life-cycles
    private final String LIFECYCLE_TAG = "LifeCycle";
    //The request id we are going to use for the camera permission
    private final int CAM_REQUEST = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LIFECYCLE_TAG, "onCreate() called -Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first ew are going to request the user for the permission to use the flashlight
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[] {Manifest.permission.CAMERA}, CAM_REQUEST);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //we are going to receive the permission result here!
        if(requestCode == CAM_REQUEST){
            if (grantResults.length > 0  &&  grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Permission granted
                Toast.makeText(MainActivity.this, "Permission was granted :)",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Permission Denied for the Camera :(",
                        Toast.LENGTH_SHORT).show();
                //Permission denied
            }
        }
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
