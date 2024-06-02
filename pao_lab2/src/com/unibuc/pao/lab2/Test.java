package com.unibuc.pao.lab2;

import com.unibuc.pao.lab2.model.BMW;
import com.unibuc.pao.lab2.model.Car;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Persoana implements Serializable {
    String nume;
    int varsta;
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("persoana.ser"));
        Persoana p = new Persoana("Popescu Ion", 40), q = p;
        oos.writeObject(q);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("persoana.ser"));
        Persoana r = (Persoana)ois.readObject();
        ois.close();
    }
}

