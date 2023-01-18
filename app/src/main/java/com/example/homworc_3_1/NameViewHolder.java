package com.example.homworc_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private TextView TvNAme;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        TvNAme = itemView.findViewById(R.id.tv_name);
    }
    public void bind(String name){
        TvNAme.setText(name);
    }

}
