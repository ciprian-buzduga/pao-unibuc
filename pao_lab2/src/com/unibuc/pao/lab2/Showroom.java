package com.unibuc.pao.lab2;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    public List<Car> cars = new ArrayList<>();

    public Showroom() {
        Car car = new BMW();
        cars.add(car);
        //cars.add(new BMW());
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
