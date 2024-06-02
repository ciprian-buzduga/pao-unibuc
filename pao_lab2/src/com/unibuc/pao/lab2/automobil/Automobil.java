package com.unibuc.pao.lab2.automobil;

import java.util.Objects;

public class Automobil {

    private String marca;
    private String model;
    private Integer capacitate;
    private Double pret;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(Integer capacitate) {
        this.capacitate = capacitate;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return Objects.equals(marca, automobil.marca) && Objects.equals(model, automobil.model) && Objects.equals(capacitate, automobil.capacitate) && Objects.equals(pret, automobil.pret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, model, capacitate, pret);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }
}
