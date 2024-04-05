package com.unibuc.pao.lab2.service;

import com.unibuc.pao.lab2.model.Car;
import com.unibuc.pao.lab2.model.Client;
import com.unibuc.pao.lab2.model.Showroom;

public class ShowroomServiceImpl implements ShowroomService {

    private final Showroom showroom;

    public ShowroomServiceImpl(Showroom showroom) {
        this.showroom = showroom;
    }

    @Override
    public void testDrive(Client client, Car car) {

    }

    @Override
    public Car buyCar(Client client, String serialNumber) {
        return null;
    }
}
