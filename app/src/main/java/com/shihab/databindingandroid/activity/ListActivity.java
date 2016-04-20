package com.shihab.databindingandroid.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ActivityListBinding;
import com.shihab.databindingandroid.model.Person;
import com.shihab.databindingandroid.adapter.ListAdapter;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        ArrayList<Person> users = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            users.add(new Person("Shihab", "Uddin"));
        }

        ListAdapter adapter = new ListAdapter(this, users);
        binding.setAdapter(adapter);
    }


}
