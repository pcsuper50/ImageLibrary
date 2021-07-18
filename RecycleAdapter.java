package com.example.putatoetechnology.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.putatoetechnology.R;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {



    Integer []img= {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7,
            R.drawable.image8, R.drawable.img9};


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.
            NotNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_myadapter,null);

        ViewHolder viewHolder=new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.
            NotNull RecycleAdapter.ViewHolder holder, int position) {


        holder.imgage.setImageResource(img[position]);


    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

              ImageView imgage;

        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            imgage=itemView.findViewById(R.id.myimg);


        }
    }
}
