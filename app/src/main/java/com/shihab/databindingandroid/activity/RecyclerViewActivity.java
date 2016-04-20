package com.shihab.databindingandroid.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;


import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.adapter.RecyclerAdapter;
import com.shihab.databindingandroid.databinding.ActivityRecyclerViewBinding;
import com.shihab.databindingandroid.model.Employee;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            employees.add(new Employee("John", "Smith"));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this, employees);
        binding.setAdapter(adapter);
    }


}
