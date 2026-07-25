package com.rehman.jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//  How to install the package for MySQL
//  1 --> We have to install the Driver for this jdbc connectivity ,
//  1.1 --> For this go to google and search for "Driver for MySQL" , And Install it

//  2 --> On our IDE ,
//  Go to --> File --> Project Structure --> Libraries --> Click on + icon to add --> Click on Java --> Then Select The Package From File Explorer
//  Note : The added package is temporary , to that project , deleting them from the file explorer will affect the IDE

public class database_connectivity {

    public static void main(String[] args) throws Exception {

        String mySqlQuery = "SELECT * FROM USERS WHERE id=1";

//        1.1
//        Create Variable For Passing

        String url = "jdbc:mysql://localhost:3306/rehman_DB";
        String username = "root";
        String password = "";

//        1
//        Create Connection
//        Establish a connection with JavaCode - to - DataBase

        Connection conn = DriverManager.getConnection(url, username, password);
//        conn is a Connection object representing an active connection to the database.

//        2
//        Create a Statement -
//        A Statement sends an SQL query over an already established (live) database connection.

        Statement state = conn.createStatement();

//        3
//        Execute -
//        Execute the SQL query using statement-object
//        4
//        Result -
//        Catch the result in preferred reference datatype

        ResultSet result = state.executeQuery(mySqlQuery);

//        5.1
//        Move the result pointer from headers to actual result row
        result.next();

        String name = result.getString(1);

//        5.2
//        Print the data
        System.out.println(name);


/*
        5
        Print the entire row

        while (result.next()) {
            System.out.print(result.getString(1) + " ");
            System.out.print(result.getString(2) + " ");
            System.out.print(result.getString(3));
        }
*/


    }


}
