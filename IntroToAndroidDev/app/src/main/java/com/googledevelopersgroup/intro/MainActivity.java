package com.googledevelopersgroup.intro;

import android.Manifest;
import android.app.Fragment;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //The tag we use to filter the logcat, for life-cycles
    private final String LIFECYCLE_TAG = "LifeCycle";
    //The number of pages that the ViewPager is going to display
    private final int NUM_PAGES = 2;
    //The adapter of the ViewPager
    private ExampleViewPagerAdapter viewPagerAdapter;
    //This is the InternetPermission request
    private final int INT_PERMISSION = 123;

    private Fragment exampleFragment;
    private ViewPager viewPager;

    //TODO fix android studio view.
    //TODO btn sub explain

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LIFECYCLE_TAG, "onCreate() called -Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO I have to make the app look good.

        //first ew are going to request the user for the permission to use the flashlight
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[] {Manifest.permission.CAMERA}, INT_PERMISSION);

        //initializing View Pager
        viewPager = findViewById(R.id.ViewPager);
        viewPagerAdapter = new ExampleViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //we are going to receive the permission result here!
        if(requestCode == INT_PERMISSION){
            if (grantResults.length > 0  &&  grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Permission granted
                Toast.makeText(MainActivity.this, "Permission was granted :)",
                        Toast.LENGTH_SHORT).show();
            } else {
//                Toast.makeText(MainActivity.this, "Permission Denied for the Camera :(",
//                        Toast.LENGTH_SHORT).show();
                //Permission denied
            }
        }
    }

    /**
     * This is the adapter that the ViewPager is going to use.
     */
    private class ExampleViewPagerAdapter extends FragmentStatePagerAdapter{

        ExampleViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            if(position == 0) {
                //If the user is in the first page we are going to display the calculator Fragment
                return new CalFragment();
            }else {
                //If the user is in the second page we are going to return the BTC Fragment
                return new BTCFragment();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
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
