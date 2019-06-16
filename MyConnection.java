*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempaccount.java;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TinotendaMatsika
 */
public class MyConnection {
    
    public static Connection getConnection(){
        Connection myConn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Temp_Manage","root","tino2208");  
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return myConn;
    }
    
}
