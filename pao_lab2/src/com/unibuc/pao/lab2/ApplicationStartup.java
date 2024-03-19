package com.unibuc.pao.lab2;

import java.util.List;

public class ApplicationStartup {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        List<Car> cars = showroom.getCars();

        for(int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);

            System.out.println(car.getPrice());
        }
    }
}
