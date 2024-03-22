package com.unibuc.pao.lab2;

public class BMW implements Car {

    private String serialNumber;

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

    @Override
    public void setSerialNumber(String number) {
        this.serialNumber = number;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car) {
            Car car = (Car) obj;
            if(this.serialNumber.equals(car.getSerialNumber())) {
                return true;
            }
        }
        return false;
    }
}
