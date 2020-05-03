package com.example.fooddishhero.Imp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeadLine {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("imgUrl")
    @Expose
    private String imgUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("instant")
    @Expose
    private String instant;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("shop")
    @Expose
    private String shop;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("day")
    @Expose
    private String day;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstant() {
        return instant;
    }

    public void setInstant(String instant) {
        this.instant = instant;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

}