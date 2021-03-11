package com.ekomuliyo.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolTest {

    @Test
    void testHikariCP() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            connection.close();
            ConnectionUtil.getDataSource().close();
        }catch (SQLException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void testUtil() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
    }

}
