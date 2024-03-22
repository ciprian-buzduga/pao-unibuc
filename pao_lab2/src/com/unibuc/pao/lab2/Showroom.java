package com.unibuc.pao.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Showroom extends AbstractShowroom {

    private Map<String, List<Car>> agentPortfolio = new HashMap<>();

    public Showroom() {
        Car car = new BMW();
        cars.add(car);
        //cars.add(new BMW());
    }

    @Override
    public void addCar(Car car) {
        super.addCar(car);
    }

    public void addCar(String agentName, Car car) {
        //Map<String, List<Car>> agentPortfolio = new HashMap<>();
        List<Car> agentCars = agentPortfolio.get(agentName);
        if(agentCars != null && !agentCars.isEmpty()) {
            if(!agentCars.contains(car)) {
                agentCars.add(car);
            } else {
                System.out.println("Agent " + agentName + " has already the car " + car);
            }
        } else {
            agentCars = new ArrayList<>();
            agentCars.add(car);
            agentPortfolio.put(agentName, agentCars);
        }
    }

    public List<Car> getCars(String agentName) {
        return agentPortfolio.get(agentName);
    }
}
