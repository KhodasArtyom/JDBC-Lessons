package com.dmdev.jdbc.starter;

import com.dmdev.jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcRunner {

    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        String username = "postgres";
        String password = "1279";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
        }
    }
}
