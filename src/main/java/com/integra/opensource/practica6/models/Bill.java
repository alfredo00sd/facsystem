package com.integra.opensource.practica6.models;

public class Bill {
    private int id;
    private int idEmployee;
    private String creationDate;
    private int total;

    public Bill() {
    }

    public Bill(int id, int idEmployee, String creationDate, int total) {
        this.id = id;
        this.idEmployee = idEmployee;
        this.creationDate = creationDate;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
