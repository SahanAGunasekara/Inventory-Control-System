package model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.Statement;

public class MySQL {

    private static Connection connection;

    public static void createConnection() throws Exception {
        //try {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopapp", "root", "password");
        }

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static ResultSet executeSearch(String query) throws Exception {

        createConnection();
        return connection.createStatement().executeQuery(query);

    }

    public static Integer executeIUD(String query) throws Exception {

        createConnection();
        return connection.createStatement().executeUpdate(query);

    }

}
