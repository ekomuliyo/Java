package com.ekomuliyo.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlInjectionTest {

    @Test
    void testSqlInjection() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String username = "admin'; #"; // tanda # di mysql dianggap komentar
        String password = "salah";

        String sql = "SELECT * FROM admin WHERE username = '"+username+"' AND password = '"+password+"'";
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("Sukses Login : " + resultSet.getString("username"));
        } else {
            System.out.println("Gagal Login");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
