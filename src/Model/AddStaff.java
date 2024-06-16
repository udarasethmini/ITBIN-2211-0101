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
public class AddStaff {
    Statement stmt;
    public void Form(String ID_Number,String First_Name,String Last_Name,String Phone_Number,String NIC_Number) {
        try{
            stmt=DBConnection.getStatementConnection();
            stmt.executeUpdate
                    ("INSERT INTO staff VALUES('"+ID_Number+"','"+First_Name+"','"+Last_Name+"','"+Phone_Number+"','"+NIC_Number+"')");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
