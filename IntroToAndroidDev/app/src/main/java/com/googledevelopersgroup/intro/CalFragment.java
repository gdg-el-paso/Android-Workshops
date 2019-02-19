package com.googledevelopersgroup.intro;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

/**
 * This fragment is going to contain the simple addition calculator
 */
public class CalFragment extends Fragment {

    private final String TAG = "CalFragment";

    //These are the views that we are going to use for this simple app
    private Button additionBtn, subBtn, divBtn, multBtn;
    private EditText num0, num1;
    private TextView result;


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
        return inflater.inflate(R.layout.cal_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onViewCreated() -Fragment");
        //Here we are going to get the views from the XML
        additionBtn = view.findViewById(R.id.addBtn);
        subBtn = view.findViewById(R.id.SubBtn);
        divBtn = view.findViewById(R.id.DivBtn);
        multBtn = view.findViewById(R.id.MultBtn);
        num1 = view.findViewById(R.id.num1);
        num0 = view.findViewById(R.id.num0);
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



        additionBtn.setOnClickListener(v -> {
            //we are going to add the numbers here
            //now we are going to add the
            int nums[] = getNums();
            result.setText(String.valueOf((nums[0]+nums[1])));
        });

        subBtn.setOnClickListener(v -> {
            int nums [] = getNums();
            result.setText(String.valueOf((nums[0] - nums[1])));
        });
        divBtn.setOnClickListener(v -> {
            int nums [] = getNums();
            result.setText(String.valueOf((nums[0]/nums[1])));
        });
        multBtn.setOnClickListener(v -> {
            int nums[] = getNums();
            result.setText(String.valueOf((nums[0]*nums[1])));
        });

        super.onStart();
    }

    //We are going to get the numbers here.
    int[] getNums(){
        //first we are going retrieve the numbers from the textViews
        int n0 = !num0.getText().toString().matches("^(0|[1-9][0-9]*)$")
                ? 0 : Integer.parseInt(num0.getText().toString());
        int n1 = !num1.getText().toString().matches("^(0|[1-9][0-9]*)$")
                ? 0 : Integer.parseInt(num1.getText().toString());
        return new int[]{n0, n1};
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
