package com.merp.perfi.sys.task.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.merp.perfi.sys.task.R;
import com.merp.perfi.sys.task.databinding.ActivitySplitifyHomeBinding;

public class SplitifyHomeActivity extends AppCompatActivity {

    private MaterialButton btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splitify_home);

        btnHistory = findViewById(R.id.btnHistory);
        btnHistory.setOnClickListener(view -> startActivity(new Intent(this, SpilitifyExpenseActivity.class)));
    }
}