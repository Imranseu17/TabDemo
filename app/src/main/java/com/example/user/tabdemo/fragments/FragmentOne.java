package com.example.user.tabdemo.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
EditText E1,E2;
    Button B1;

    public FragmentOne() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        E1 = (EditText) v.findViewById(R.id.e1);
        E1 = (EditText) v.findViewById(R.id.e2);
        B1 = (Button)v.findViewById(R.id.b1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragment = new FragmentTwo();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(E1.getText().equals("imran") && (E2.getText().equals("1234")))
                {

                    fragmentTransaction.replace(R.id.framelayout, fragment);
                    fragmentTransaction.commit();
                }


            }
        });
        return v;



    }


}
