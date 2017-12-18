/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.IndexSlider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Slider;

/**
 *
 * @author IKA
 */
public class DbConnection {
    
    private static Connection conn;
    
    public static void getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            conn = DriverManager.getConnection("jdbc:mysql://136.243.5.37:33063/brzevesti_test", "root", "cubesqa");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
        public static void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public static IndexSlider getSlider(String query){
            IndexSlider c = new IndexSlider();
        try {
            
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            System.out.println(query);
            
            while(rs.next()){
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString ("description"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
        }
    
}
