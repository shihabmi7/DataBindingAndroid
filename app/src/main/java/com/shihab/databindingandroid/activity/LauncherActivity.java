package com.shihab.databindingandroid.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ActivityLauncherBinding;


public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLauncherBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_launcher);

    }

    public void onSimple(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onList(View view){
        startActivity(new Intent(this, ListActivity.class));
    }

    public void onRecycler(View view){
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }
}
