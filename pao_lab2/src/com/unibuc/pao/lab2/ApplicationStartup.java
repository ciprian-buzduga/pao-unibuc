package com.unibuc.pao.lab2;

import java.util.List;

public class ApplicationStartup {

    public static void main(String[] args) {
        BWMFactory factory = BWMFactory.getInstance();

        BWMFactory factory1 = BWMFactory.getInstance();

        System.out.println("Is singleton? " + (factory == factory1));
    }
}
