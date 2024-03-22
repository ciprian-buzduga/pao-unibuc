package com.unibuc.pao.lab2;

import java.util.List;

public class ApplicationStartup {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        Car car = new BMW();
        car.setSerialNumber("12345");

        String agentName = "John Smith";
        showroom.addCar(agentName, car);


        Car car2 = new BMW();
        //Car car2 = car;
        car2.setSerialNumber("12345");
        showroom.addCar(agentName, car2);

        List<Car> agentCars = showroom.getCars(agentName);
        System.out.println("Agent " + agentName + " has cars with Sno: ");
        agentCars.forEach(carItem ->{
            System.out.println(carItem.getSerialNumber());
        });



    }
}
