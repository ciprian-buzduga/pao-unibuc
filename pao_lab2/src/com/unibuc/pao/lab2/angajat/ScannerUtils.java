package com.unibuc.pao.lab2.angajat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clasa utilitara cu constructor privat
 */
public class ScannerUtils {

    private ScannerUtils() {}

    /**
     * Intoarce o valoare introdusa de la tastatura ce reprezinta valoarea minima de salariu
     * @return
     */
    public static Double getSalariuMin() {
        Scanner scanner = new Scanner(System.in);
        Double valMin = scanner.nextDouble();
        while(valMin != null) {
            if(valMin != null) {
                System.out.println("Cauta dupa salariu min: " + valMin);
                break;
            }

            if (scanner.hasNextLine()) {
                valMin = scanner.nextDouble();
            }
        }
        return valMin;
    }
}
