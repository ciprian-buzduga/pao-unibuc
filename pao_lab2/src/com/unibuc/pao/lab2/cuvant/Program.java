package com.unibuc.pao.lab2.cuvant;

import java.util.Scanner;

/**
 * Scrieti o clasa Java care sa calculeze de câte ori apare un cuvânt dat într-un fisier text,
 * folosind un fir de executare. Scrieti un program care cite.te de la tastatura un cuvânt si,
 * utilizând clasa definita anterior, afiseaza numarul total al apari.iilor cuvântului respectiv
 * în fisierele text exemplu_1.txt, exemplu_2.txt si exemplu_3.txt. Cuvintele din fisierele
 * text de intrare sunt despar.ite între ele prin spatii si semnele de punctuatie uzuale.
 */
public class Program {

    private static final String FILE_1 = "exemplu_1.txt";
    private static final String FILE_2 = "exemplu_2.txt";
    private static final String FILE_3 = "exemplu_3.txt";

    private static int counter = 1;

    public static void main(String[] args) throws Exception {
        String cuvant = getCuvantDeCautat();
        FrecventaCuvant firExecutie1 = new FrecventaCuvant(FILE_1, cuvant);
        FrecventaCuvant firExecutie2 = new FrecventaCuvant(FILE_2, cuvant);
        FrecventaCuvant firExecutie3 = new FrecventaCuvant(FILE_3, cuvant);

        firExecutie1.start();
        firExecutie2.start();
        firExecutie3.start();

        firExecutie1.join();
        firExecutie2.join();
        firExecutie3.join();

        int frecventa = firExecutie1.getFrecventa() + firExecutie2.getFrecventa()
                + firExecutie3.getFrecventa();
        System.out.println("Frecventa cuvant " + frecventa);

    }

    private static String getCuvantDeCautat() {
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.nextLine();
        while(cuvant != null) {
            if(cuvant != null && cuvant.isEmpty()) {
                System.out.println("Cauta cuvantul: " + cuvant);
                break;
            }

            if (cuvant.isEmpty()) {
                System.out.println("Read Enter Key.");
            }

            if (scanner.hasNextLine()) {
                cuvant = scanner.nextLine();
            } else {
                cuvant = null;
            }
        }
        return cuvant;
    }
}
