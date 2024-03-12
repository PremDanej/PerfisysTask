package com.merp.perfi.sys.task.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.merp.perfi.sys.task.R;
import com.merp.perfi.sys.task.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFirst.setOnClickListener(view ->{
            startActivity(new Intent(this, SplitifyHomeActivity.class));
        });

        binding.btnSecond.setOnClickListener(view ->{
            startActivity(new Intent(this, SplitifyHomeActivity.class));
        });
    }
}