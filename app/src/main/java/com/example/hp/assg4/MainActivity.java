package com.example.hp.assg4;

import android.app.FragmentManager;


import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements MainFragment.OnFragmentInteractionListener,
        MapFragment.OnFragmentInteractionListener, PICFragment.OnFragmentInteractionListener {
    static FragmentManager fm;static FragmentTransaction ft;

    private static final String TAG = "MainActivity";


    Button  button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment Main= new MainFragment();

        // get fragment manager
        fm = getFragmentManager();

// add
        ft = fm.beginTransaction();
        ft.add(R.id.container, Main);

        ft.commit();

    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public static void startMapFragment(){
        MapFragment  mapFragment= new MapFragment();

        ft = fm.beginTransaction();
        ft.replace(R.id.container, mapFragment);
        ft.commit();
    }

    public static void startPICFragment(){
        PICFragment   picFragment= new PICFragment();

        ft = fm.beginTransaction();
        ft.replace(R.id.container, picFragment);
        ft.commit();
    }


    public static void startmainFragment(){
        MainFragment    mainFragment= new MainFragment();

        ft = fm.beginTransaction();
        ft.replace(R.id.container, mainFragment);
        ft.commit();
    }
}