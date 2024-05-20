package com.unibuc.pao.lab2.factory;

import com.unibuc.pao.lab2.model.BMW;

public class BMWFactory implements CarFactory<BMW> {

    private static final Object LOCK = new Object();

    private Integer numberOfCars = 0;

    private String attribut;
    private static BMWFactory instance;

    private BMWFactory() {
        System.out.println("Initializing BWMFactory...");
    }

    public synchronized static BMWFactory getInstance() {
        if(instance == null) {
            instance = new BMWFactory();
        }
        return instance;
    }

    @Override
    public BMW makeCar() {
        return null;
    }

    public synchronized void incrementCars() {
        synchronized (LOCK) {
            numberOfCars = numberOfCars + 1;
        }
    }

    public Integer getNumberOfCars() {
        return numberOfCars;
    }
}
