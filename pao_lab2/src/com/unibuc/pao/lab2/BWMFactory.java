package com.unibuc.pao.lab2;

public class BWMFactory implements CarFactory {

    private String attribut;

    private static BWMFactory instance;

    private BWMFactory() {
        System.out.println("Initializing BWMFactory...");
    }

    public synchronized static BWMFactory getInstance() {
        if(instance == null) {
            instance = new BWMFactory();
        }
        return instance;
    }
}
