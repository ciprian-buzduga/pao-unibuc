package com.unibuc.pao.lab2.model;

import com.unibuc.pao.lab2.listener.ShowroomListener;

import java.util.List;

public class Agent extends Person implements ShowroomListener {

    @Override
    public void onCarsListener(List<Car> cars) {
        System.out.println("Notified agent about cars " + cars);
    }

}
