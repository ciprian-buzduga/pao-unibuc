package com.unibuc.pao.lab2.model;

public class BMW extends AbstractCar {

    @Override
    public float getKm() {
        return 1000f;
    }

    @Override
    public float getPrice() {
        return 20000;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car) {
            Car car = (Car) obj;
            if(this.getSerialNumber().equals(car.getSerialNumber())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getSerialNumber().hashCode();
    }
}
