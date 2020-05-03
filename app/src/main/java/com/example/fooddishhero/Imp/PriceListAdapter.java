
package com.example.fooddishhero.Imp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fooddishhero.R;

import java.util.List;

public class PriceListAdapter extends RecyclerView.Adapter<PriceListAdapter.VerticalViewHolder> {

    private List<HeadLine> regularFoods;
    private Context context;


    public static class VerticalViewHolder extends RecyclerView.ViewHolder{

        LinearLayout verticalLayout;
        TextView regularTitle;
        TextView regularPrice;
        ImageView regularImage1;
        Button regularPlus;

        public VerticalViewHolder(View itemView) {
            super(itemView);

            verticalLayout = itemView.findViewById(R.id.vertical_parent_layout);
            regularTitle = itemView.findViewById(R.id.id_title_sbi);
            regularImage1 = itemView.findViewById(R.id.img);
            regularPrice = itemView.findViewById(R.id.sbi_dis);

            //   regularPlus = itemView.findViewById(R.id.cd_sbi);

        }
    }

    public PriceListAdapter(List<HeadLine> regularFoods, int vertical_recyclerview, Context context){
        this.context = context;
        this.regularFoods = regularFoods;
    }

    @NonNull
    @Override
    public PriceListAdapter.VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_offer, parent, false);
        return new PriceListAdapter.VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PriceListAdapter.VerticalViewHolder holder, final int position) {
        holder.regularTitle.setText(regularFoods.get(position).getInstant());
        holder.regularPrice.setText((((regularFoods.get(position).getDiscount()))) + " Taka");
        Glide.with(context)
                .load(regularFoods.get(position).getImgUrl())
                .fitCenter()
                .into(holder.regularImage1);



    }

/*    @Override
    public int getItemCount() {
        return 0;
    }*/

    @Override
    public int getItemCount() {
        return regularFoods.size();
    }
}
