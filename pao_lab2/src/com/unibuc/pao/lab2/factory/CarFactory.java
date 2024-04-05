package com.unibuc.pao.lab2.factory;

import com.unibuc.pao.lab2.model.Car;

public interface CarFactory<T extends Car> {

    T makeCar();

}
