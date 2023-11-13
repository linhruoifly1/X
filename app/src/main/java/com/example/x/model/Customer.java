package com.example.x.model;

public class Customer {
    private int id;
    private String name, phone, email;
    private int birth;

    public Customer(String name, String phone, String email, int birth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
    }

    public Customer(int id, String name, String phone, String email, int birth) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
    }

    public Customer() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
