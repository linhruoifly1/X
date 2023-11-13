package com.example.x.model;

public class Room {
    private int id,idType,number,status,price;

    public Room(int idType, int number, int status, int price) {
        this.idType = idType;
        this.number = number;
        this.status = status;
        this.price = price;
    }

    public Room(int id, int idType, int number, int status, int price) {
        this.id = id;
        this.idType = idType;
        this.number = number;
        this.status = status;
        this.price = price;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
