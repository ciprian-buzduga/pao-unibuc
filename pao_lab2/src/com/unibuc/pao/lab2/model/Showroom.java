package com.unibuc.pao.lab2.model;

import com.unibuc.pao.lab2.listener.ShowroomListener;

import java.util.*;

public class Showroom extends AbstractShowroom {

    private List<ShowroomListener> listeners = new ArrayList<>();

    private Map<String, List<Car>> agentPortfolio = new HashMap<>();

    public Showroom() {
        Car car = new BMW();
        cars.add(car);
        //cars.add(new BMW());
    }

    @Override
    public void addCar(Car car) {
        super.addCar(car);
        listeners.forEach(l -> l.onCarsListener(Arrays.asList(car)));
    }

    public void addClient(Client client) {
        listeners.add(client);
    }

    public void addAgent(Agent agent) {
        listeners.add(agent);
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
