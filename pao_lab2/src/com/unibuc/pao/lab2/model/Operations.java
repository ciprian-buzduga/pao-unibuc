package com.unibuc.pao.lab2.model;

public class Operations {

    public static void throwNPE() {
        /*try {
            throw new RuntimeException();
        } catch (RuntimeException e) {

        }*/
        Client c = new Client();
        c.getName();
    }

    public static void throwCheckedException() throws Exception {
        throw new Exception();
    }

    public static void catchCheckedException() {
        try {
            throw new Exception("Custom exception");
        } catch (Exception e) {
            System.out.println("Catch ex " + e);
        }
    }

    public static void withdraw() throws CustomException {
        throw new CustomException();
    }
}
