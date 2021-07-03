package database;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author Deshan
 */
public class dbConnect {

    private static Connection con = null;

    private static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lms";
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("" + ex);
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }

    public static Statement getStatement() throws SQLException {
        Statement stmt = null;
        if (con == null) {
            connect();
        }
        stmt=con.createStatement();
        
        return stmt;
    }
}
