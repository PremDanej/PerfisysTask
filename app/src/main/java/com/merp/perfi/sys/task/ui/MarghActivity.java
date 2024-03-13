package com.merp.perfi.sys.task.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.merp.perfi.sys.task.R;

public class MarghActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_margh);

        bottomNavView = findViewById(R.id.bottomNavView);
        bottomNavView.setOnItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }


    void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.viewPager, fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuSave) {
            loadFragment(new SaveFragment());
        } else if (item.getItemId() == R.id.menuProfile) {
            loadFragment(new ProfileFragment());
        } else {
            loadFragment(new HomeFragment());
        }
        return true;
    }
}