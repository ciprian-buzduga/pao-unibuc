package com.unibuc.pao.lab2.model;

public class ModelCar {

    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;

    /*public ModelCar(String attribute1, String attribute2, String attribute3,
                    String attribute4, String attribute5, String attribute6,
                    String attribute7) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
    }*/

    public static class ModelCarBuilder {

        private ModelCar car;

        private static ModelCarBuilder instance;
        private ModelCarBuilder() {
            car = new ModelCar();
        }

        public static ModelCarBuilder getInstance() {
            if(instance == null) {
                instance = new ModelCarBuilder();
            }
            return instance;
        }

        public ModelCarBuilder setAttribute1(String attr1) {
            car.setAttribute1(attr1);
            return this;
        }

        public ModelCarBuilder setAttribute2(String attr2) {
            car.setAttribute2(attr2);
            return this;
        }

        public ModelCarBuilder setAttribute3(String attr3) {
            car.setAttribute3(attr3);
            return this;
        }

        public ModelCar build() {
            return car;
        }

    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }
}
