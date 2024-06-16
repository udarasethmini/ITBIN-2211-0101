/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.Home;
import View.login;
import java.util.logging.Level;
//import com.sun.glass.ui.Window.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class loginController {
    public static void login(String jTextField1, String jPasswordField1) {
 try {
 String email= "usethmini@gmail.com"; // initial value of the username
 String password = "1234"; // initial value of the password
 ResultSet rs = new DBSearch().searchLogin(jTextField1);
//Process the Query
 while (rs.next()) {
email = rs.getString("email"); //assign database login name to the variable

password = rs.getString("password"); //assign database password to the variable
 }
 if (email != null && password != null) {
 if (password.equals(jPasswordField1)) {
 System.out.println("Login Successfull");
 login.getFrames()[0].dispose();
 new Home().setVisible(true);
 } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 DBConnection.closeCon();
 } catch (SQLException ex) {
     
     Logger log;
     Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, "Failed to login due to unexpected error", ex);
     //Logger.log(Level.SEVERE, "Failed to login due to unexpected error", ex);
     

 }
 }
}
