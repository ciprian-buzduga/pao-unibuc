package com.unibuc.pao.lab2;

public class BMW implements Car {

    @Override
    public String getMark() {
        return "BMW";
    }

    @Override
    public float getKm() {
        return 1000f;
    }

    @Override
    public float getPrice() {
        return 20000;
    }
}
