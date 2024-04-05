package com.unibuc.pao.lab2.factory;

import com.unibuc.pao.lab2.model.BMW;

public class BMWFactory implements CarFactory<BMW> {

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
}
