package com.example.snosey.ajeer;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    static TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);

        FragmentManager fm = getSupportFragmentManager();
        ChooseLocation fragment = new ChooseLocation();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, fragment, "ChooseLocation");
        ft.commit();
    }

    public void info(View view) {


        android.support.v4.app.Fragment myFragment = (android.support.v4.app.Fragment) getSupportFragmentManager().findFragmentByTag("OrderState");

        try {
            if (myFragment == null || !myFragment.isVisible()) {
                FragmentManager fm = getSupportFragmentManager();
                OrderState fragment = new OrderState();
                FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack("OrderState");
                ft.replace(R.id.fragment, fragment, "OrderState");
                ft.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

    public void back(View view) {
        onBackPressed();
    }
}
