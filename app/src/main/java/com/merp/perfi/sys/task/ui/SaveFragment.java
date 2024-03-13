package com.merp.perfi.sys.task.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.merp.perfi.sys.task.R;

public class SaveFragment extends Fragment {

    public SaveFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout forthis fragment
        return inflater.inflate(R.layout.fragment_save, container, false);
    }
}