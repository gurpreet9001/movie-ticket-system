/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author gurpreet9001
 */
public class mymain implements myvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        try {
 for (javax.swing.UIManager.LookAndFeelInfo info : 
 javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Windows".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (Exception ex) {
 JOptionPane.showMessageDialog(null, "Cannot apply theme");
 }
 
        
 
 try
 {
 Connection myconnection;
 
 myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASS);
 
 try
 {
 String a="select * from usertable ";
 PreparedStatement mystatement=myconnection.prepareStatement(a);
 ResultSet myresult=mystatement.executeQuery();

 if(myresult.next())
 {
 Login obj=new Login();
 obj.setVisible(true);
 }
 else
 {
 JOptionPane.showMessageDialog(null, "Running Software for first time, create Admin Account first");
 createadmin obj=new createadmin();
 obj.setVisible(true);
 }
 
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error in Query " + e.getMessage());
 }
 finally
 {
 myconnection.close();
 }
 
 
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error in Connection " + e.getMessage());
 }
        
        
    }
}
    

