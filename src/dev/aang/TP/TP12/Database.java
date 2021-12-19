/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.aang.TP.TP12;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author milha
 */
public class Database {
    
    static final String DB_URL = "jdbc:mysql://localhost/test";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() throws SQLException {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    public void query(String SQLString) {
        try {
            stmt.executeQuery(SQLString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
