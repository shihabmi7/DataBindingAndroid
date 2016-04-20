package com.shihab.databindingandroid.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ActivityHomeBinding;
import com.shihab.databindingandroid.model.User;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        User user = new User("Test", "User");
        binding.setUser(user);

    }
}
