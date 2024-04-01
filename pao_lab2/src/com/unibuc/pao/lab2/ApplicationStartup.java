package com.unibuc.pao.lab2;

import java.util.List;

public class ApplicationStartup {

    public static void main(String[] args) {
       Showroom showroom = new Showroom();

       Client client = new Client();
       client.setName("Popescu Ion");

       Agent agent = new Agent();
       agent.setName("Georgescu Marian");

       showroom.addAgent(agent);
       showroom.addClient(client);

       Car car = new BMW();
       car.setMark(CarMark.BMW_X6);
       showroom.addCar(car);
    }
}
