package busSystem;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deepa
 */
public class CRUD_Operations {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con=DbConnect.getConnection();
//        createConductorTable(con);
//        createPassengerTable(con);
//        createParentTable(con);
//        createAdminTable(con);

//            createDriverTable(con);

//        createTicketIssueTable(con);
        
    }
    
    public static void createConductorTable(Connection con){
        String query="create table Conductor (CId varchar(20) PRIMARY KEY, name varchar(20),phoneNumber varchar(20),password varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createPassengerTable(Connection con){
        String query="create table PASSENGER (USERNAME varchar(20) PRIMARY KEY, PASSWORD varchar(20),NAME varchar(20),phoneNumber varchar(20),age int,EMAIL varchar(40),FROMWHERE varchar(20),TOWHERE varchar(20),DISTANCE varchar(20),PRICE varchar(20),CONID varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createParentTable(Connection con){
        String query="create table PASSENGER (chid varchar(20) PRIMARY KEY, name varchar(20),phone varchar(20),password varchar(20),EMAIL varchar(40))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createAdminTable(Connection con){
        String query="create table Admin (username varchar(20) PRIMARY KEY,password varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createDriverTable(Connection con){
        String query="create table Driver (DID varchar(20) PRIMARY KEY,name varchar(20),mobile varchar(20),password varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createTicketIssueTable(Connection con){
        String query="create table TICKET_ISSUE (FromWhere varchar(20),ToWhere varchar(20),price varchar(20),Distance varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
}
