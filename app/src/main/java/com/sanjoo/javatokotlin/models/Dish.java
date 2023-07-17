package com.sanjoo.javatokotlin.models;
public class Dish {

    private String dishName;
    private String dishImageUrl;
    private Double price;
    private String dishType;
    private String mealType;
    private Integer rating;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishImageUrl() {
        return dishImageUrl;
    }

    public void setDishImageUrl(String dishImageUrl) {
        this.dishImageUrl = dishImageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}