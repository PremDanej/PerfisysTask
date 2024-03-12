package com.merp.perfi.sys.task.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.merp.perfi.sys.task.databinding.ItemViewHistoryBinding;
import com.merp.perfi.sys.task.model.ExpenseHistory;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    private final List<ExpenseHistory> list;

    public HistoryAdapter(List<ExpenseHistory> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemViewHistoryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ExpenseHistory item = list.get(position);
        holder.binding.txtDate.setText(item.getTimeAndDate());
        holder.binding.txtName.setText(item.getItemName());
        holder.binding.txtPrice.setText(item.getItemPrice());
        holder.binding.txtPaidBy.setText(item.getPaidBy());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ItemViewHistoryBinding binding;
        public MyViewHolder(@NonNull ItemViewHistoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
