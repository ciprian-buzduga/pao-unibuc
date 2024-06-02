package com.unibuc.pao.lab2;

import com.unibuc.pao.lab2.factory.BMWFactory;
import com.unibuc.pao.lab2.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ApplicationStartup {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/pao";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

        String selectQuery = "";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);

        while (resultSet.next()) {
            resultSet.getString("columnName");
        }

        statement.close();
        connection.close();
    }













    private static void executeThreads() {
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
