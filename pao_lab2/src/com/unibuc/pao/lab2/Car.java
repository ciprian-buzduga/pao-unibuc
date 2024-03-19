package com.unibuc.pao.lab2;

public interface Car {

    /**
     * @return Car mark. Eg: BMW, Mercedes
     */
    String getMark();

    /**
     * @return The running kilometers
     */
    float getKm();

    default float getPrice() {
        return 10000F;
    }

}
