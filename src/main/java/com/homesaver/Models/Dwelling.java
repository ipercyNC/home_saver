package com.homesaver.Models;

import java.util.List;

public class Dwelling {
    private int id;
    private String dwellingType;
    private String address;
    private int userId;
    private User user;
    private List<Product> products;

    public Dwelling(){}
    public Dwelling(int id, String dwellingType, String address, int userId, User user, List<Product> products){
        super();
        this.id = id;
        this.dwellingType = dwellingType;
        this.address = address;
        this.userId = userId;
        this.user = user;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDwellingType() {
        return dwellingType;
    }

    public void setDwellingType(String dwellingType) {
        this.dwellingType = dwellingType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    
    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
    
    public List<Product> getProducts(){
        return this.products;
    }

    public void setProducts(List<Product> products){
        this.products = products;
    }

    @Override
    public String toString() {
        return "Dwelling [id=" + id + ", dwellingType=" + dwellingType + ", address=" + 
        address + ", userId=" + userId + ", user=" + user + ", products=" + products + "]";
    }
}

