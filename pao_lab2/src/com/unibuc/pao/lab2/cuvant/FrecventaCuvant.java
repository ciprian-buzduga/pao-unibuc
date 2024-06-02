package com.unibuc.pao.lab2.cuvant;

import java.io.File;
import java.util.Scanner;

public class FrecventaCuvant extends Thread {

    private String path;
    private String cuvant;
    private int frecventa;

    public FrecventaCuvant(String path, String cuvant) {
        this.path = path;
        this.cuvant = cuvant;
    }

    @Override
    public void run() {
        Scanner scanner = getScanner();
        String linie;
        while(scanner.hasNextLine())
        {
            linie = scanner.nextLine();
            String cuv[] = linie.split("[ ,.!’;]+");
            for(String item : cuv)
                if(this.cuvant.equals(item))
                    this.frecventa++;
        }
    }

    private Scanner getScanner() {
        try {
            return new Scanner(new File(this.path));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int getFrecventa() {
        return frecventa;
    }
}
