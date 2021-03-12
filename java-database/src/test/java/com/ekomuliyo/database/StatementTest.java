package com.ekomuliyo.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

    @Test
    void testExecuteInsert() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sqlInsert = """
                    INSERT INTO customers(id, name, email) VALUES
                    ('eko', 'Eko Muliyo', 'ekomuliyo@gmail.com')
                """;

        int insert = statement.executeUpdate(sqlInsert);
        System.out.println(insert);

        statement.close();
        connection.close();

    }

    @Test
    void testExecuteDelete() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sqlDelete = """
                    DELETE FROM customers
                    WHERE id = 'eko'
                """;

        int insert = statement.executeUpdate(sqlDelete);
        System.out.println(insert);

        statement.close();
        connection.close();

    }

}
