package com.integra.opensource.practica6.models;

public class BillDetails {
    private int id;
    private int idBill;
    private int idProduct;
    private int quantity;
    private int price;

    public BillDetails() {
    }

    public BillDetails(int id, int idBill, int idProduct, int quantity, int price) {
        this.id = id;
        this.idBill = idBill;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
