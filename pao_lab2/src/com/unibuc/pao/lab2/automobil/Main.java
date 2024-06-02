package com.unibuc.pao.lab2.automobil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Automobil> automobilList = new ArrayList<>();

        for(int i = 1; i < 11; i++) {
            Automobil auto = new Automobil();
            auto.setCapacitate(500 * i);
            //daca restul lui i impartirii la 2 este mai mare ca zero pune Marca1
            if((i % 2) > 0) {
                auto.setMarca("Marca1");
            } else {
                auto.setMarca("Marca0");
            }

            auto.setModel("Model" + i);
            auto.setPret(4995d + i);
            automobilList.add(auto);
        }

        System.out.println("Toata lista de automobile");
        automobilList.forEach(System.out::println);

        System.out.println("afisati automobilele care costa cel putin 5000€,\n" +
                "în ordinea descrescatoare a preturilor");
        automobilList.stream()
                .filter(a -> a.getPret() >= 5000d) //filtreaza auto care costa cel putin 5000
                .sorted(Comparator.comparing(Automobil::getPret).reversed())//sorteaza lista filtrata descendent
                .forEach(System.out::println);//afiseaza fiecare element sortat

        System.out.println("afisati marcile distincte de automobile");
        automobilList.stream()
                .map(Automobil::getMarca)//acceseaza marca pentru fiecare auto
                .collect(Collectors.toSet())//colecteaza marcile intr-o colectie Set, pentru a fi unice/disctince
                .forEach(System.out::println);//afiseaza fiecare element din set


        System.out.println("Creati o lista formata din automobilele care au " +
                "capacitatea cilindrica cuprinsa între 2000 si 3000 cm3");
        List<Automobil> list = automobilList.stream()
                .filter(a -> a.getCapacitate() > 2000)
                .filter(a -> a.getCapacitate() < 3000)
                .collect(Collectors.toList());

        list.forEach(System.out::println);


        System.out.println("afisati pentru fiecare marca modelele existente");
        automobilList.stream()
                .collect(Collectors.groupingBy(
                        Automobil::getMarca,
                            Collectors.mapping(
                                    Automobil::getModel,
                                    Collectors.toList())
                        )
                ).forEach((k, v) -> {
                    System.out.println("Marca " + k + " are modelele: " + v);
                });
    }
}
