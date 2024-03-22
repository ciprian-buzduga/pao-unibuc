package com.unibuc.pao.lab2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractShowroom {

    protected List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        System.out.println("Get cars....");
        return cars;
    }
}
