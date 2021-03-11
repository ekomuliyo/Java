package com.ekomuliyo.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    @BeforeAll
    static void berforeAll() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    void testConnection() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "root";

        try {

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            System.out.println("Sukses konek ke database");

        }catch (SQLException e) {
            Assertions.fail(e);
        }

    }

    @Test
    void testConnectionClose() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {

            System.out.println("Sukses konek ke database");
        }catch (SQLException e) {
            Assertions.fail(e);
        }
    }


}
