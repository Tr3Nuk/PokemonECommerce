/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jeff
 */
public class OracleSql {
   private static final String URL = "jdbc:oracle:thin:@localhost:1523:PE";
   private static final String DRIVER = "oracle.jdbc.OracleDriver";
   private static final String USER = "SYSTEM";
   private static final String PASSWORD = "password";
   private Connection conn;
   private Statement stmt;
   private ResultSet rs;

    public OracleSql() {
        connect();
        //connect to database
    }
    
    public void connect()    
    {
        try {
             System.out.println("Registering Driver...");
            Class.forName(DRIVER).newInstance();
            System.out.println("Driver Registered");
            System.out.println("Connecting To Database...");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
             
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        catch(InstantiationException ie)
        {
        ie.printStackTrace();
        }  
        catch(IllegalAccessException iae)
        {
        iae.printStackTrace();
        }
        catch(SQLException sql)
        {
        sql.printStackTrace();
        }
        
    }
    public void createStatement()
    {
        try {
            stmt = conn.createStatement();
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }
    public void executeQuery(String sql)
    {
        try {
            stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void executeUpdate(String sql)
    {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getResultSet()
    {
        try {
            rs = stmt.getResultSet();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public void closConn()
    {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   
}
