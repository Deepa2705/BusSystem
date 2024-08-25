/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busSystem;
import java.sql.*;
/**
 *
 * @author ELCOT
 */
public class DbConnect {
    public static Connection getConnection()  throws SQLException, ClassNotFoundException{
        Connection con;
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/safemate","root","");
        
        String URL="jdbc:derby://localhost:1527/bussystem;user=root;password=root";
        con = DriverManager.getConnection(URL);

        return con;
        
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Connection con=DbConnect.getConnection();
        if(con!=null){
            System.err.println("Connected to Database!!!");
        }else{
            System.out.println("Failed to connect");
        }
    }
}
