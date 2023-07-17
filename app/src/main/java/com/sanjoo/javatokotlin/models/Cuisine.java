package com.sanjoo.javatokotlin.models;

import java.util.List;

public class Cuisine {

    private String cuisineName;
    private String cuisineImageUrl;
    private List<Dish> dishes;

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    public String getCuisineImageUrl() {
        return cuisineImageUrl;
    }

    public void setCuisineImageUrl(String cuisineImageUrl) {
        this.cuisineImageUrl = cuisineImageUrl;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

}
