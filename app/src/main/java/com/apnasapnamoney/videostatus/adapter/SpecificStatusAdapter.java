package com.apnasapnamoney.videostatus.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.apnasapnamoney.videostatus.R;

public class SpecificStatusAdapter extends RecyclerView.Adapter<SpecificStatusAdapter.MyViewHolder>  {

    Context con;

    public SpecificStatusAdapter(Context con){
        this.con=con;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(con).inflate(R.layout.specific_status_lay,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_profile_user;
        RelativeLayout main_rel_lay;
        Button letsmeet;
        TextView user_details_name,where_me;
        public MyViewHolder(View itemView) {
            super(itemView);

        }
    }
}

