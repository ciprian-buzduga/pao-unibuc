package com.unibuc.pao.lab2;

import com.unibuc.pao.lab2.factory.BMWFactory;
import com.unibuc.pao.lab2.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ApplicationStartup {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        BMWFactory bmwFactory = BMWFactory.getInstance();
        for(int i = 0; i < 100; i++) {
            executor.submit(() -> {
                bmwFactory.incrementCars();
            });
        }

        executor.shutdown();

        try {
            System.out.println("awaitTermination.....");
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Executor is finished? " + executor.isTerminated() + " " + executor.isShutdown());
        System.out.println("Number of cars: " + bmwFactory.getNumberOfCars());
    }
}
