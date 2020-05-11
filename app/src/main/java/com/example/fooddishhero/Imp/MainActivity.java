package com.example.fooddishhero.Imp;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddishhero.Food;
import com.example.fooddishhero.GeneralFood;
import com.example.fooddishhero.R;
import com.example.fooddishhero.VerticalAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewHorizontal;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    public static TextView tv;

    public Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     toolbar = findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);

      /*  getSupportActionBar().setTitle("Foodish");
        toolbar.setTitleTextColor(0xFFFFFFFF);*/

     //   mLayoutManager=new GridLayoutManager(getApplicationContext(),2);

      /*  recyclerViewHorizontal = findViewById(R.id.horizontal_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewHorizontal.setLayoutManager(linearLayoutManager);*/

        recyclerView = findViewById(R.id.mRecyclerViewOfr);
        recyclerView.setLayoutManager(mLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager2);
        RetrofitInterface retrofitService = RetrofitClient.getClient().create(RetrofitInterface.class);

        Call<Food> call = retrofitService.getFoods();
        call.enqueue(new Callback<Food>() {
            @Override
            public void onResponse(Call<Food> call, retrofit2.Response<Food> response) {
            /*    List<GeneralFood> popularFoods = response.body().getPopularFood();
                recyclerViewHorizontal.setAdapter(new HorizontalAdapter(popularFoods, R.layout.recyclerview_horizontal, MainActivity.this));
*/
                List<GeneralFood> regularFoods = response.body().getVegetables();
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setAdapter(new VerticalAdapter(regularFoods, R.layout.data_content, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Food> call, Throwable t) {

            }
        });
    }

   /* public static void cartUpdate() {
        if (tv != null && cartFoods != null)
            tv.setText(Integer.toString(cartFoods.size()));
    }

    @Override
    protected void onResume() {
        invalidateOptionsMenu();
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        finish();
}*/
}

