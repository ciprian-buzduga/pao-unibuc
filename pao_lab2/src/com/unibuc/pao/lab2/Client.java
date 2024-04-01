package com.unibuc.pao.lab2;

import java.util.List;

public class Client implements ShowroomListener {

    private String name;
    private String phone;
    private String email;

    @Override
    public void onCarsListener(List<Car> cars) {
        System.out.println("Notified client about cars " + cars);
        cars.forEach(c -> {
            if(c.getMark() == CarMark.BMW_X6) {
                System.out.println("Yupiiiiii a venit masina. Sa fac credit la banca!!");
            }
        });
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
