package com.googledevelopersgroup.intro;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * This fragment is going to display the price of the Btc
 */
public class BTCFragment extends Fragment {

    private final String TAG = "BTCFragment";
    private TextView btcPrice;
    private Button btcBtn;
    private String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
    private RequestQueue queue;

    @Override
    public void onAttach(Context context) {
        queue = Volley.newRequestQueue(context);
        super.onAttach(context);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.btc_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btcPrice = view.findViewById(R.id.btcPrice);
        btcBtn = view.findViewById(R.id.btcBtn);
//        btcBtn.setOnClickListener(v -> {
//            Log.i(TAG, "Getting the price");
//
//
//            @SuppressLint("SetTextI18n") JsonObjectRequest btcRequest = new JsonObjectRequest //we are going going to request the price here
//                    (Request.Method.GET, url, null, response -> {
//                        try {
//                            JSONObject usdPrice = (response.getJSONObject("bpi")).getJSONObject("USD");
//
//                            btcPrice.setText("$"+String.valueOf(usdPrice.getString("rate")));
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                    }, error -> {
//                        try {
//                            throw new Exception(error);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    });
//            queue.add(btcRequest);
//        });
        super.onViewCreated(view, savedInstanceState);
    }

}
