package com.integra.opensource.practica6.models;

public class Products {
    private int id;
    private String title;
    private String description;
    private int quantity;
    private int cost;
    private String creationDate;

    public Products() {
    }

    public Products(int id, String title, String description, int quantity, int cost, String creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.cost = cost;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
