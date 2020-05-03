package com.example.fooddishhero.Imp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {



    @GET("offercomplate.json")
    abstract public Call<OfferList> getOfferList();

}