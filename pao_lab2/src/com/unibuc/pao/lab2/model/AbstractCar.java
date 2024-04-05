package com.unibuc.pao.lab2.model;

public abstract class AbstractCar implements Car {

    private CarMark mark;
    private String serialNumber;

    @Override
    public CarMark getMark() {
        return mark;
    }

    @Override
    public void setMark(CarMark mark) {
        this.mark = mark;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
