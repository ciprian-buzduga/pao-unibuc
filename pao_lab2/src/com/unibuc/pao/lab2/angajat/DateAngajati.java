package com.unibuc.pao.lab2.angajat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clasa Imutabila, conditii:
 * 1. Sa nu aiba seteri
 * 2. Clasa finala, nu mai poate fi extinsa
 * 3. Atributele finale, nu se mai pot modifica
 * 4. Getter collectii nemodificate
 */
public final class DateAngajati {

    private final String cnp;
    private final String nume;
    private final int varsta;
    private final Double salariu;

    public DateAngajati(String cnp, String nume, int varsta, Double salariu) {
        this.cnp = cnp;
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Double getSalariu() {
        return salariu;
    }

    @Override
    public String toString() {
        return "DateAngajati{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", salariu=" + salariu +
                '}';
    }
}
