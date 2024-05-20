package com.unibuc.pao.lab2.model;

import java.util.List;

public class Agent extends Person {

    private static int count = 0;
    private int instanceCount = 0;

    @Override
    public void onCarsListener(List<Car> cars) {
        System.out.println("Notified agent about cars " + cars);
    }

    public static void incrementStaticCounter() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void incrementInstCounter() {
        instanceCount = instanceCount + 1;
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}
