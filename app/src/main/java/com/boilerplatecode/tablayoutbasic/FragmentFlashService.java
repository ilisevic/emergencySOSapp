package com.boilerplatecode.tablayoutbasic;


import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFlashService extends Fragment {
    View view;
    Button btnFlashServiceOn, btnFlashServiceOff;


    public FragmentFlashService() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__flash_service, container, false);


        btnFlashServiceOn = view.findViewById(R.id.btn_flash_start_service);
        btnFlashServiceOff = view.findViewById(R.id.btn_flash_stop_service);


        btnFlashServiceOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().startService(new Intent(getActivity(), FlashService.class));


            }
        });

        btnFlashServiceOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getActivity(), FlashService.class));
            }
        });


        return view;
    }


}
