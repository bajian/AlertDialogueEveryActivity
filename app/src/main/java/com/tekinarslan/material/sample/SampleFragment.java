package com.tekinarslan.material.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;
    private View btn_activity2;
    private View btn_activity3;

    public static SampleFragment newInstance(int position) {
        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.page, container, false);

        btn_activity2= rootView.findViewById(R.id.btn_activity2);
        btn_activity3=rootView.findViewById(R.id.btn_activity3);

        btn_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Activity2.class));
            }
        });
        btn_activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Activity3.class));
            }
        });
        return rootView;
    }
}