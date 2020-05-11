package com.example.fooddishhero.Imp;

import com.example.fooddishhero.Food;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("Vegetables.php")
    abstract public Call<Food> getFoods();

}