package com.unibuc.pao.lab2.service;

import com.unibuc.pao.lab2.model.Car;
import com.unibuc.pao.lab2.model.Client;

public interface ShowroomService {

    void testDrive(Client client, Car car);

    Car buyCar(Client client, String serialNumber);
}
