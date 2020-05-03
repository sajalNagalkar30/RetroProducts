package com.example.fooddishhero.Imp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferList {

    @SerializedName("headlines")
    @Expose
    private List<HeadLine> headlines = null;

    public List<HeadLine> getHeadlines() {
        return headlines;
    }

    public void setHeadlines(List<HeadLine> headlines) {
        this.headlines = headlines;
    }

}