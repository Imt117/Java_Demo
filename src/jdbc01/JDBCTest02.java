package jdbc01;

import java.sql.*;

public class JDBCTest02 {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlw","root","root");
                System.out.println(connection);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }


        }
}


