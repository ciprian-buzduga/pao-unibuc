package com.unibuc.pao.lab2.model;

import com.unibuc.pao.lab2.listener.ShowroomListener;

import java.util.List;

public class Client extends Person {

    @Override
    public void onCarsListener(List<Car> cars) {
        System.out.println("Notified client about cars " + cars);
        cars.forEach(c -> {
            if(c.getMark() == CarMark.BMW_X6) {
                System.out.println("Yupiiiiii a venit masina. Sa fac credit la banca!!");
            }
        });
    }
}
