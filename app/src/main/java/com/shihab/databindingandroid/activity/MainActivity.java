package com.shihab.databindingandroid.activity;

import android.databinding.DataBindingUtil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ActivityMainBinding;
import com.shihab.databindingandroid.model.User;

//

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("First Name: Shihab", "Last Name: Uddin");
        binding.setUser(user);


    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();


    }
}
