package com.unibuc.pao.lab2.model;

public enum CarMark {

    BMW_X6("BMW", "X6"),
    BMW_X1("BMW", "X1"),
    MERCEDES_SCLASS("Mercedes", "SClass"),
    MERCEDES_GCLASS("Mercedes", "GClass");

    private String mark;
    private String model;

    private CarMark(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

}
