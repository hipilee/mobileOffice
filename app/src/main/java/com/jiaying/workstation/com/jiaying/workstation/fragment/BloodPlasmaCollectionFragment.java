package com.jiaying.workstation.com.jiaying.workstation.fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jiaying.workstation.R;
import com.jiaying.workstation.activity.BloodPlasmaMachineForNurseActivity;

/**
 * 采浆
 */
public class BloodPlasmaCollectionFragment extends Fragment {
    private Button nurse_login_btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plasma_collection, container, false);
        nurse_login_btn = (Button) view.findViewById(R.id.nurse_login_btn);
        nurse_login_btn.setOnClickListener(new gotoNurseLoginListener());
        return view;
    }

    //护士登录浆机
    private class gotoNurseLoginListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            gotoBloodPlasmaMachineForNurseActivity();
        }

        private void gotoBloodPlasmaMachineForNurseActivity() {
            Intent it = new Intent(getActivity(), BloodPlasmaMachineForNurseActivity.class);
            startActivity(it);
        }
    }
}
