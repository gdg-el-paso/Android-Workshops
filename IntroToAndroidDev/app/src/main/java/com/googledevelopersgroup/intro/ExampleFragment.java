package com.googledevelopersgroup.intro;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * The fragment that is going to contain the flashlight
 */
public class ExampleFragment extends Fragment {

    private final String TAG = "ExampleFragment";

    //These are the views that we are going to use for this simple app
    private Button additionBtn, flashBtn, btcBtn;
    private EditText num0, num1;
    private TextView flashUpdate, btcPrice, result;



    @Override
    public void onAttach(Context context) {
        Log.i(TAG, "onAttach() -Fragment");
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onAttach() -Fragment");
        //going to inflate the view of the fragment
        return inflater.inflate(R.layout.example_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onViewCreated() -Fragment");
        //Here we are going to get the views from the XML
        additionBtn = view.findViewById(R.id.addBtn);
        flashBtn = view.findViewById(R.id.flashBtn);
        btcBtn = view.findViewById(R.id.btcBtn);
        num1 = view.findViewById(R.id.num1);
        num0 = view.findViewById(R.id.num0);
        flashUpdate = view.findViewById(R.id.flashUpdate);
        btcPrice = view.findViewById(R.id.btcPrice);
        result = view.findViewById(R.id.result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onActivityCreated() -Fragment");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i(TAG, "onStart() -Fragment");


        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume() -Fragment");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause() -Fragment");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onStop() -Fragment");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "onDestroyView() -Fragment");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy() -Fragment");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, "onDetach() -Fragment");
        super.onDetach();
    }
}
