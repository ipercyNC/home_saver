package com.springstarter.Spring.Starter.Models;

public class Dwelling {
    private int id;
    private String dwellingType;
    private String address;
    private int userId;

    public Dwelling(){}
    public Dwelling(int id, String dwellingType, String address, int userId){
        super();
        this.id = id;
        this.dwellingType = dwellingType;
        this.address = address;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String dwellingType() {
        return dwellingType;
    }

    public void setDwellingType(String dwellingType) {
        this.dwellingType = dwellingType;
    }

    public String address() {
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
    @Override
    public String toString() {
        return "Dwelling [id=" + id + ", dwellingType=" + dwellingType + ", address=" + address + ", userId=" + userId + "]";
    }
}

