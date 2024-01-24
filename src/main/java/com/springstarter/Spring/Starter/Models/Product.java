package com.springstarter.Spring.Starter.Models;

public class Product {
    private int id;
    private String name;
    private String modelNumber;
    private String brand;
    
    public Product() {

    }

    public Product(int id, String name, String modelNumber, String brand) {
        super();
        this.id = id;
        this.name = name;
        this.modelNumber = modelNumber;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", modelNumber=" + modelNumber + ", brand=" + brand + "]";
    }
}