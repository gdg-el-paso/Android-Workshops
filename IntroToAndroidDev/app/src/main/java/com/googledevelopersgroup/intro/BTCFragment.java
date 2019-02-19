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
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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
        btcBtn.setOnClickListener(v -> {
            Log.i(TAG,"Getting the price");
            //we are going going to request the price here
            JsonObjectRequest btcRequest = new JsonObjectRequest
                    (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            String price;
                            Log.i(TAG,"Response!");
                            try {
                                price = response.getString("rate");
                                btcPrice.setText(price);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // TODO: Handle error
                            Log.i(TAG,"Error");
                            try {
                                throw new Exception(error);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
            queue.add(btcRequest);
        });
        super.onViewCreated(view, savedInstanceState);
    }
}
