package com.apnasapnamoney.videostatus.adapter;

import android.content.Context;
import android.content.Intent;
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
import com.apnasapnamoney.videostatus.views.videos.UnderCategory;
import com.apnasapnamoney.videostatus.views.videos.UnderStatus;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.MyViewHolder>  {

    Context con;

    public StatusAdapter(Context con){
        this.con=con;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(con).inflate(R.layout.videos_adapter_lay,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.main_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(con, UnderStatus.class);
                con.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 12;
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_profile_user;
        RelativeLayout main_lay;
        Button letsmeet;
        TextView user_details_name,where_me;
        public MyViewHolder(View itemView) {
            super(itemView);
            main_lay=itemView.findViewById(R.id.main_lay);

        }
    }
}
