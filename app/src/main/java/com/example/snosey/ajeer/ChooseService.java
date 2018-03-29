package com.example.snosey.ajeer;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Snosey on 3/13/2018.
 */

public class ChooseService extends android.support.v4.app.Fragment {


    private RecyclerView serviceRv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_service, container, false);

        serviceRv = (RecyclerView) view.findViewById(R.id.serviceRv);
        GridLayoutManager layoutManager
                = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        serviceRv.setLayoutManager(layoutManager);
        serviceRv.setAdapter(new ServiceAdapter());
        return view;
    }


    private class ServiceAdapter extends RecyclerView.Adapter<MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, final int position) {
            // create a new view
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_row, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {

        }


        @Override
        public int getItemCount() {
            return 13;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View v) {
            super(v);
        }

    }

}

