package com.example.appflorentinobeautieofficial.model;

public class NewProduct {
    String name;
    String price;
    String rating;
    String description;


    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    Integer imageUrl;

    public NewProduct(String name, String price, String rating, Integer imageUrl,String description) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

