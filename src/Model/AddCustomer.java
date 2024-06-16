/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class AddCustomer {
    Statement stmt;
    public void Form(String First_Name,String Last_Name,String Address,String Phone_Number,String Email){
        try{
            stmt=DBConnection.getStatementConnection();
            stmt.executeUpdate
                    ("INSERT INTO customer VALUES('"+First_Name+"','"+Last_Name+"','"+Address+"','"+Phone_Number+"','"+Email+"')");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
