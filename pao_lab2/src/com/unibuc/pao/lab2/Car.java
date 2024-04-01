package com.unibuc.pao.lab2;

public interface Car {

    /**
     * @return Car mark. Eg: BMW, Mercedes
     */
    CarMark getMark();

    void setMark(CarMark mark);

    /**
     * @return The running kilometers
     */
    float getKm();

    default float getPrice() {
        return 10000F;
    }

    void setSerialNumber(String number);

    String getSerialNumber();

}
