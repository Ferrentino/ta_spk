/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta.spk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class Database {
    public static Connection setKoneksi(){
        String connString = "jdbc:mysql://localhost/spk";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //make connection
            conn = DriverManager.getConnection(connString, "root", "");
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Failed");
        }
        return conn;
    }
    
    public static int execute(String SQL){
        int status = 0;
        Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            status = st.executeUpdate(SQL);
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }
    
    public static ResultSet executeQuery(String SQL){
        ResultSet rs = null;
        Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            rs = st.executeQuery(SQL);
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }   
        return rs;
    }

    public static ResultSet executeQuery(PreparedStatement ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
