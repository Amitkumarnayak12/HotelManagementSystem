package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {
    Connection connection;
    Statement statement;
    public con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms11","root","Amit@123");
            statement=connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
//            jdbc:mysql:///universitymanagementsystem1

        }
    }
}
