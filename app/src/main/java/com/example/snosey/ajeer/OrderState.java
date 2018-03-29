package com.example.snosey.ajeer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.snosey.ajeer.MainActivity.title;

/**
 * Created by Snosey on 2/12/2018.
 */

public class OrderState extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.order_state, container, false);
        title.setText("متابعة الطلب");
        return view;

    }
}
