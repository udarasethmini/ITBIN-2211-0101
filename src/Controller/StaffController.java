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
public class StaffController {
    public static void Form(String ID_Number, String First_Name, String Last_Name, String Phone_Number, String NIC_Number) {
        new Model.AddStaff().Form(ID_Number,First_Name,Last_Name,Phone_Number,NIC_Number);
        JOptionPane.showMessageDialog(null,"New Record has been inserted" ,"successful",
                JOptionPane.INFORMATION_MESSAGE);
        
       
    }
    
    
}
