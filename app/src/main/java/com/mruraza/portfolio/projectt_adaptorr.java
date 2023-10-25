package com.mruraza.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class projectt_adaptorr extends RecyclerView.Adapter<projectt_adaptorr.Myviewholder> {
    ArrayList<project_modal>list;

    public projectt_adaptorr(ArrayList<project_modal> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public projectt_adaptorr.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.projects_layout_recycler,parent,false);

        return new Myviewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull projectt_adaptorr.Myviewholder holder, int position) {
            holder.ing1.setImageResource(list.get(position).img1);
            holder.img2.setImageResource(list.get(position).img2);
            holder.title.setText(list.get(position).proj_name);
            holder.info.setText(list.get(position).proj_info);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        ImageView ing1,img2;
        TextView title,info;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            ing1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            title = itemView.findViewById(R.id.project_title_TV);
            info = itemView.findViewById(R.id.project_info);
        }
    }
}
