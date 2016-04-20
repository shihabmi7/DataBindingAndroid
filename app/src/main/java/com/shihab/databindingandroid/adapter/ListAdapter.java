package com.shihab.databindingandroid.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ListItemBinding;
import com.shihab.databindingandroid.model.Person;


import java.util.List;

/**
 * Created by Shihab
 */
public class ListAdapter extends ArrayAdapter<Person> {

    private Context context;
    private List<Person> users;

    public ListAdapter(Context context, List<Person> users){
        super(context, android.R.layout.simple_dropdown_item_1line, users);
        this.context = context;
        this.users = users;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.list_item, parent, false);
        Person person = users.get(position);
        binding.setPerson(person);
        return binding.getRoot();
    }
}
