package com.mruraza.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class skills_adaptor extends RecyclerView.Adapter<skills_adaptor.MYViewholder> {
ArrayList<mmodal> list ;
    skills_adaptor(ArrayList<mmodal>lsit){
    this.list=lsit;
    }
    @NonNull
    @Override
    public skills_adaptor.MYViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.skills,parent,false);

        return new MYViewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull skills_adaptor.MYViewholder holder, int position) {
        holder.imgl.setImageResource(list.get(position).img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MYViewholder extends RecyclerView.ViewHolder {
        ImageView imgl;
        public MYViewholder(@NonNull View itemView) {
            super(itemView);
            imgl = itemView.findViewById(R.id.img_for_skills);
        }
    }
}
