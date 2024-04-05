package com.unibuc.pao.lab2;

import com.unibuc.pao.lab2.factory.BMWFactory;
import com.unibuc.pao.lab2.model.*;

import java.util.ArrayList;
import java.util.List;

public class ApplicationStartup {

    public static void main(String[] args) {
        //ModelCar modelCar = new ModelCar(null, null, null, null, "value", null, null);

        ModelCar car = ModelCar.ModelCarBuilder.getInstance()
                .setAttribute1("attr1")
                .setAttribute3("attr3")
                .build();

        ModelCar car2 = new ModelCar();
        car2.setAttribute2("");
    }
}
