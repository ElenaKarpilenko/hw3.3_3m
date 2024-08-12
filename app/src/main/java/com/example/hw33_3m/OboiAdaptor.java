package com.example.hw33_3m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw33_3m.databinding.ItemOboiBinding;

import java.util.ArrayList;

public class OboiAdaptor extends RecyclerView.Adapter<OboiViwHolder> {

    private ArrayList<Oboi>oboiList;
    public OboiAdaptor(ArrayList<Oboi>oboiList){
        this.oboiList=oboiList;
    }

    @NonNull
    @Override
    public OboiViwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OboiViwHolder(ItemOboiBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OboiViwHolder holder, int position) {
        holder.onBind(oboiList.get(position));
    }

    @Override
    public int getItemCount() {
        return oboiList.size();
    }
}

class OboiViwHolder extends RecyclerView.ViewHolder {

    ItemOboiBinding binding;

    public OboiViwHolder(ItemOboiBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Oboi oboi) {
        Glide.with(binding.imgOboi).load(oboi.getImage()).into(binding.imgOboi);
    }
}



