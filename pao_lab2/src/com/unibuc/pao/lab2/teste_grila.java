package com.unibuc.pao.lab2;

class C { public static int a=1; }
public class teste_grila {
    public static void main(String[] args) {
        C ob1 = new C();
        C ob2 = new C();
        ob1.a++;
        System.out.println(++ob2.a);
    }
}
