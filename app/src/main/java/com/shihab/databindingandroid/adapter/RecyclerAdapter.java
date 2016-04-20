package com.shihab.databindingandroid.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.RecyclerItemBinding;
import com.shihab.databindingandroid.model.Employee;
import java.util.ArrayList;

/**
 * Created by Shihab
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {

    ArrayList<Employee> employees;
    Context context;

    public RecyclerAdapter(Context context, ArrayList<Employee> employees) {
        this.context = context;
        this.employees = employees;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerItemBinding dataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.recycler_item, viewGroup, false);
        return new Holder(dataBinding);
    }

    @Override
    public void onBindViewHolder(Holder holder, int i) {
        holder.getDataBinding().setEmployee(employees.get(i));
        holder.getDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        RecyclerItemBinding dataBinding;

        public Holder(RecyclerItemBinding itemView) {
            super(itemView.getRoot());
            dataBinding = itemView;
        }

        public RecyclerItemBinding getDataBinding() {
            return dataBinding;
        }
    }
}
