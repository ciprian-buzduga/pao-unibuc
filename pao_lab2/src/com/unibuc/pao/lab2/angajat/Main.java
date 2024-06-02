package com.unibuc.pao.lab2.angajat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Double salariuMin = ScannerUtils.getSalariuMin();

        //Obtinem conexiunea la DB
        String dbUrl = "jdbc:derby://localhost:1527/Angajati";
        Connection conn = DriverManager.getConnection(dbUrl, "username", "password");

        //Construim query nostru
        String query = "SELECT * FROM DateAngajati WHERE salariu <= ?";
        //Construim un PreparedStatemen pentru a folosi parametri
        PreparedStatement statement = conn.prepareStatement(query);

        //Setam parametrul
        statement.setDouble(1, salariuMin);

        //Rulam query-ul
        ResultSet resultSet = statement.executeQuery();

        List<DateAngajati> dateAngajatiList = new ArrayList<>();
        //Iteram ResultSet-ul si extragem o lista de angajati
        while (resultSet.next()) {
            String cnp = resultSet.getString("CNP");
            String nume = resultSet.getString("NUME");
            Integer varsta = resultSet.getInt("VARSTA");
            Double salariu = resultSet.getDouble("SALARIU");

            DateAngajati da = new DateAngajati(cnp, nume, varsta, salariu);
            dateAngajatiList.add(da);
        }

        //Afisam datele despre angajati
        dateAngajatiList.forEach(System.out::println);
    }
}
