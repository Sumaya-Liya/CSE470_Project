
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.**/
 
package Model;



/**
 *
 * @author LENOVO*/
import java.sql.*;
public class ConnectionProvider {
    
    /**
     *
     * @return
     */
    public static Connection getCon(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
            return con;
            
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
        
      }
   
    
}
