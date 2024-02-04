package com.example.recipes;

public class FoodData {

    private String itemName;
    private String itemDescription;
    private String price;
    private String itemImage;

    public FoodData(String itemName, String itemDescription, String price, String itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.itemImage = itemImage;
    }

    public FoodData(String dish, String random, String price, int image) {
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getPrice() {
        return price;
    }

    public String getItemImage() {
        return itemImage;
    }
}
