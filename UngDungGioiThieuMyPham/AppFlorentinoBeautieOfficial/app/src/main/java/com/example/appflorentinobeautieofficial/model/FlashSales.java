package com.example.appflorentinobeautieofficial.model;

public class FlashSales {
    String name;
    String price;
    String saleoff;
    String description;
    Integer imageUrl;

    public FlashSales(String name, String price, String saleoff, Integer imageUrl, String description) {
        this.name = name;
        this.price = price;
        this.saleoff = saleoff;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleoff() {
        return saleoff;
    }

    public void setSaleoff(String saleoff) {
        this.saleoff = saleoff;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
