/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    public static Connection conn(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("pos"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection c = m.getConnection();
            System.out.println("Sukses terhubung");
            
            return c;
            
        } catch (SQLException e) {
            System.err.println("GAGAL terhubung\n"+e.getMessage());
        }
        
        return null;        
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Connection Go() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
