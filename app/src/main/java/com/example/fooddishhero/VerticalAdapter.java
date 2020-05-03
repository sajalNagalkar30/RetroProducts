package com.example.fooddishhero;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;



public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {

    private List<Category> regularFoods;
    private Context context;



    public static class VerticalViewHolder extends RecyclerView.ViewHolder{

        ConstraintLayout verticalLayout;
        TextView regularTitle;
        TextView regularPrice;
        ImageView regularImage;
        Button regularPlus;

        public VerticalViewHolder(View itemView) {
            super(itemView);

            verticalLayout = itemView.findViewById(R.id.categoryjk);
            regularTitle = itemView.findViewById(R.id.textcategory);
            regularImage = itemView.findViewById(R.id.imgcate);

         //   regularPlus = itemView.findViewById(R.id.cd_sbi);

        }
    }

    public VerticalAdapter(List<Category> regularFoods, int vertical_recyclerview, Context context){
        this.context = context;
        this.regularFoods = regularFoods;
    }

    @NonNull
    @Override
    public VerticalAdapter.VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_content, parent, false);



        return new VerticalAdapter.VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final VerticalAdapter.VerticalViewHolder holder, final int position) {
        holder.regularTitle.setText(regularFoods.get(position).getTitle());
      Picasso.get().load(regularFoods.get(position).getImgUrl()).fit().into(holder.regularImage);


    }

  /*  @Override
    public int getItemCount() {
        return 0;
    }*/

    @Override
    public int getItemCount() {
        return regularFoods.size();
    }
}
