/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class CustomerController {

    public static void Form(String First_Name, String Last_Name, String Address, String Phone_Number, String Email) {
        new Model.AddCustomer().Form(First_Name,Last_Name,Address,Phone_Number,Email);
        JOptionPane.showMessageDialog(null,"New Record has been inserted" ,"successful",
                JOptionPane.INFORMATION_MESSAGE);
        
       
    }
    
}
