package com.unibuc.pao.lab2.model;

import com.unibuc.pao.lab2.listener.ShowroomListener;

import java.util.List;

public abstract class Person implements ShowroomListener, Comparable<Person> {

    private String name;
    private String phone;
    private String email;

    @Override
    public void onCarsListener(List<Car> cars) {
        System.out.println("No implementation yet!");
    }

    @Override
    public int compareTo(Person o) {
        return -1;
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
}
