/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class DBSearch {
    Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String jTextField1) {
 try {
 stmt = DBConnection.getStatementConnection();
 String email = jTextField1;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where email='"+ email + "'");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 return rs;
 }


public ResultSet searchCustomer(){
 try{
 stmt = DBConnection.getStatementConnection();
 rs = stmt.executeQuery("SELECT * FROM customer");
 }
 catch(SQLException e){

 }
 return rs;
 }


public ResultSet searchStaff(){
 try{
 stmt = DBConnection.getStatementConnection();
 rs = stmt.executeQuery("SELECT * FROM staff");
 }
 catch(SQLException e){

 }
 return rs;
 }
}
