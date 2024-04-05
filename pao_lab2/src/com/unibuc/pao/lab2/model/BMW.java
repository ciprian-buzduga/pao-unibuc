package com.unibuc.pao.lab2.model;

public class BMW implements Car {

    private CarMark mark;

    private String serialNumber;

    @Override
    public void setMark(CarMark mark) {
        this.mark = mark;
    }

    @Override
    public CarMark getMark() {
        return mark;
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
