package config;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/users";
    private static final String JDBC_NAME = "user";
    private static final String JDBC_PASSWORD = "password";
    private java.sql.Connection connection;

    public java.sql.Connection getConnection() throws ClassNotFoundException {
        if (connection == null) {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);
                connection = DriverManager.getConnection(JDBC_URL, JDBC_NAME, JDBC_PASSWORD);
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return connection;
    }
}
