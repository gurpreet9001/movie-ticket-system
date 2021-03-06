/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.SystemColor.desktop;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class bookticket extends javax.swing.JInternalFrame implements myvariables ,Printable {

    /**
     * Creates new form bookticket
     */
    public bookticket() {
        initComponents();
        
        java.util.Date obj=new java.util.Date();
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
        datebox.setText(myformat.format(obj));
        
         try
 {
 Connection myconnection;
 myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);
 
 try
 {
    String myquery="select audi from hall_list";
    PreparedStatement mystatement=myconnection.prepareStatement(myquery);
    ResultSet myresult=mystatement.executeQuery();
    
    if(myresult.next()){
    do{
    audibox.addItem(myresult.getString("audi"));
    }while(myresult.next());
    }
            
            
   
    audibox.setSelectedIndex(0);
   
 
 }
 catch(Exception e)
 {
    JOptionPane.showMessageDialog(rootPane, "Error in Query 1 " + e.getMessage());
 }
 finally
 {
    myconnection.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
 }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        city = new javax.swing.JLabel();
        movie = new javax.swing.JLabel();
        audibox = new javax.swing.JComboBox<>();
        moviebox = new javax.swing.JComboBox<>();
        userID = new javax.swing.JLabel();
        useridbox = new javax.swing.JTextField();
        tickets1 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        pricebox = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        totalbox = new javax.swing.JLabel();
        ticketbox = new javax.swing.JTextField();
        datebox = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        timebox = new javax.swing.JLabel();
        showdatebox = new javax.swing.JLabel();
        movie1 = new javax.swing.JLabel();
        luxurybox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        city1 = new javax.swing.JLabel();
        city4 = new javax.swing.JLabel();
        city2 = new javax.swing.JLabel();
        city3 = new javax.swing.JLabel();
        city5 = new javax.swing.JLabel();
        goldbox = new javax.swing.JLabel();
        platinumbox = new javax.swing.JLabel();
        silverbox = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Book Ticket");

        city.setText("Audi");

        movie.setText("Movie");

        audibox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Audi" }));
        audibox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiboxActionPerformed(evt);
            }
        });

        moviebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose movie" }));
        moviebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieboxActionPerformed(evt);
            }
        });

        userID.setText("Unique UserID");

        useridbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridboxActionPerformed(evt);
            }
        });

        tickets1.setText("No. of Tickets");

        price.setText("Price");

        pricebox.setText("...");

        date.setText("Booking Date");

        total.setText("Total");

        totalbox.setText("...");

        ticketbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketboxActionPerformed(evt);
            }
        });
        ticketbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ticketboxKeyTyped(evt);
            }
        });

        datebox.setText("...");

        date1.setText("Show Timing");

        date2.setText("Show Date");

        timebox.setText("...");

        showdatebox.setText("...");

        movie1.setText("Luxury");

        luxurybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILVER", "GOLD", "PLATINUM" }));
        luxurybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luxuryboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city)
                            .addComponent(movie)
                            .addComponent(tickets1)
                            .addComponent(date)
                            .addComponent(total)
                            .addComponent(movie1)
                            .addComponent(date1)
                            .addComponent(date2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price)
                            .addComponent(userID))))
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timebox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(moviebox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(audibox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(useridbox)
                        .addComponent(totalbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ticketbox, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(datebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pricebox, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(luxurybox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(showdatebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(audibox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(city)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movie)
                            .addComponent(moviebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie1)
                    .addComponent(luxurybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(pricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(useridbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userID))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticketbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tickets1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total)
                            .addComponent(totalbox))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(datebox))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1)
                    .addComponent(timebox))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2)
                    .addComponent(showdatebox)))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticketbooking/ticket (1).png"))); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Get Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        city1.setText("Remaining Tickets :-");

        city4.setText("Silver");

        city2.setText("Gold");

        city3.setText("Platinum");

        goldbox.setText("...");

        platinumbox.setText("...");

        silverbox.setText("...");

        jButton4.setText("Remaining Tickets");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(city2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goldbox))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(city4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(city5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(silverbox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(city3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                        .addComponent(platinumbox)))))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(city1)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(city1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(city5)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city4)
                            .addComponent(silverbox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city2)
                            .addComponent(goldbox)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city3)
                            .addComponent(platinumbox))
                        .addGap(131, 131, 131)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void audiboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiboxActionPerformed
                      try
 {
 Connection myconnection;
 myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);
 
 try
 {
    String myquery="select moviename from movies where audi=?";
    PreparedStatement mystatement=myconnection.prepareStatement(myquery);
    mystatement.setString(1,audibox.getSelectedItem().toString());
    ResultSet myresult=mystatement.executeQuery();
    
    
    
    
    
    if(myresult.next()){
        moviebox.removeAllItems();
        moviebox.addItem("Choose movie now");
    do{
    moviebox.addItem(myresult.getString("moviename"));
    }while(myresult.next());
    
    }
           
    moviebox.setSelectedIndex(0);
 }
 catch(Exception e)
 {
    JOptionPane.showMessageDialog(rootPane, "Error in Query 2 " + e.getMessage());
 }
 finally
 {
    myconnection.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
 }
    }//GEN-LAST:event_audiboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);

            try
            {
                String a="insert into ticket_booked values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement mystatement=myconnection.prepareStatement(a);
                mystatement.setString(3, luxurybox.getSelectedItem().toString());
                mystatement.setString(1, audibox.getSelectedItem().toString());
                mystatement.setString(2, moviebox.getSelectedItem().toString());
                mystatement.setString(5, useridbox.getText());
                mystatement.setString(6, ticketbox.getText());
                mystatement.setString(8, datebox.getText());
                mystatement.setString(4, pricebox.getText());
                mystatement.setString(7, totalbox.getText());
                mystatement.setString(10, showdatebox.getText());
                mystatement.setString(9, timebox.getText());
                
                
                if(mystatement.executeUpdate()>0)
                {
                      if(luxurybox.getSelectedItem().toString()=="SILVER"){try
 {
 Connection myconnection1 = DriverManager.getConnection(PATH+PLACE, USERNAME,PASS); 
 
 try
 { String myquery1="update hall_list set silver=silver-?"
 + " where audi=?";
 PreparedStatement mystatement1 = myconnection1.prepareStatement(myquery1);
 
 mystatement1.setString(1, ticketbox.getText());
  mystatement1.setString(2, audibox.getSelectedItem().toString());
  
 
 if(mystatement1.executeUpdate()>0)
 {
 //JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane,"Sorry, some problem occured");
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "1 Error in Query due to " + e.getMessage());
 }
 finally
 {
 myconnection1.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection due to " + e.getMessage());
 }}
                      if(luxurybox.getSelectedItem().toString()=="GOLD"){try
 {
 Connection myconnection1 = DriverManager.getConnection(PATH+PLACE, USERNAME,PASS); 
 
 try
 {
  String myquery1="update hall_list set gold=gold-?"
 + " where audi=?";
 PreparedStatement mystatement1 = myconnection1.prepareStatement(myquery1);
 
 mystatement1.setString(1, ticketbox.getText());
  mystatement1.setString(2, audibox.getSelectedItem().toString());
  
 if(mystatement1.executeUpdate()>0)
 {
 JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane,"Sorry, some problem occured");
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "1 Error in Query due to " + e.getMessage());
 }
 finally
 {
 myconnection1.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection due to " + e.getMessage());
 }}
                      else if(luxurybox.getSelectedItem().toString()=="PLATINUM"){try
 {
 Connection myconnection1 = DriverManager.getConnection(PATH+PLACE, USERNAME,PASS); 
 
 try
 {
 String myquery1="update hall_list set platinum=platinum-?"
 + " where audi=?";
 PreparedStatement mystatement1 = myconnection1.prepareStatement(myquery1);
 
 mystatement1.setString(1, ticketbox.getText());
  mystatement1.setString(2, audibox.getSelectedItem().toString());
  
 if(mystatement1.executeUpdate()>0)
 {
 JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane,"Sorry, some problem occured");
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "1 Error in Query due to " + e.getMessage());
 }
 finally
 {
 myconnection1.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection due to " + e.getMessage());
 }}
                    print_ticket.userid=useridbox.getText();
                    print_ticket obj=new print_ticket();
                    parent.jDesktopPane1.add(obj);
                    obj.setVisible(true);
    
                    useridbox.setText("");
                    moviebox.setSelectedIndex(0);
                    luxurybox.setSelectedIndex(0);
                    audibox.setSelectedIndex(0);
                    moviebox.setSelectedIndex(0);
                    pricebox.setText("");
                    totalbox.setText("");
                    showdatebox.setText("");
                    timebox.setText("");
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        } 
  
   
 
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void movieboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieboxActionPerformed
                     try
 {
 Connection myconnection;
 myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);
 
 try
 {
    String myquery="select * from movies where moviename=?";
    PreparedStatement mystatement=myconnection.prepareStatement(myquery);
    mystatement.setString(1,moviebox.getSelectedItem().toString());
    ResultSet myresult=mystatement.executeQuery();
    
    
    
    
    
    if(myresult.next()){
       pricebox.setText(myresult.getString("price"));
       timebox.setText(myresult.getString("Show_Timing"));
       showdatebox.setText(myresult.getString("Date"));
       //useridbox.setText("moviename"+String.valueOf(ticketleft));
    }
       
 
 }
 catch(Exception e)
 {
    //JOptionPane.showMessageDialog(rootPane, "Error in Query 2 " + e.getMessage());
 }
 finally
 {
    myconnection.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
 } 
    }//GEN-LAST:event_movieboxActionPerformed

    private void ticketboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketboxActionPerformed
        
    }//GEN-LAST:event_ticketboxActionPerformed

    private void ticketboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ticketboxKeyTyped
      
    }//GEN-LAST:event_ticketboxKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try
        {
            Connection myconnection;
            myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);

            try
            {
                String myquery="select price from movies where movie=?";
                PreparedStatement mystatement=myconnection.prepareStatement(myquery);
                mystatement.setString(1,moviebox.getSelectedItem().toString());
                ResultSet myresult=mystatement.executeQuery();

                if(myresult.next()){

                    String myprice=(String) pricebox.getText();
                    String myticket=(String) ticketbox.getText();
                    int mytotal=Integer.parseInt(myprice)*Integer.parseInt(myticket);
                    totalbox.setText(String.valueOf(mytotal));
                }

            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(rootPane, "Error in Query 2 " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }

        int myticket=Integer.parseInt(ticketbox.getText());
        int myprice=Integer.parseInt(pricebox.getText());
        int mytotal=myticket*myprice;
        totalbox.setText(String.valueOf(mytotal));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void useridboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridboxActionPerformed

    private void luxuryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luxuryboxActionPerformed

        if(luxurybox.getSelectedItem()=="GOLD")
       pricebox.setText(String.valueOf(Integer.parseInt(pricebox.getText()) + 40));
       else if(luxurybox.getSelectedItem()=="PLATINUM")
        pricebox.setText(String.valueOf(Integer.parseInt(pricebox.getText()) + 70));
   
    }//GEN-LAST:event_luxuryboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                    try
 {
 Connection myconnection;
 myconnection=DriverManager.getConnection(PATH+PLACE, USERNAME, PASS);
 
 try
 {
    String myquery="select * from hall_list where audi=?";
    PreparedStatement mystatement=myconnection.prepareStatement(myquery);
    mystatement.setString(1,audibox.getSelectedItem().toString());
    ResultSet myresult=mystatement.executeQuery();
    
    
    
    
    
    if(myresult.next()){
       goldbox.setText(myresult.getString("gold"));
       silverbox.setText(myresult.getString("silver"));
       platinumbox.setText(myresult.getString("platinum"));
       //useridbox.setText("moviename"+String.valueOf(ticketleft));
    }
       
 
 }
 catch(Exception e)
 {
    //JOptionPane.showMessageDialog(rootPane, "Error in Query 2 " + e.getMessage());
 }
 finally
 {
    myconnection.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
 }         
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> audibox;
    private javax.swing.JLabel city;
    private javax.swing.JLabel city1;
    private javax.swing.JLabel city2;
    private javax.swing.JLabel city3;
    private javax.swing.JLabel city4;
    private javax.swing.JLabel city5;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel datebox;
    private javax.swing.JLabel goldbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> luxurybox;
    private javax.swing.JLabel movie;
    private javax.swing.JLabel movie1;
    private javax.swing.JComboBox<String> moviebox;
    private javax.swing.JLabel platinumbox;
    private javax.swing.JLabel price;
    private javax.swing.JLabel pricebox;
    private javax.swing.JLabel showdatebox;
    private javax.swing.JLabel silverbox;
    private javax.swing.JTextField ticketbox;
    private javax.swing.JLabel tickets1;
    private javax.swing.JLabel timebox;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalbox;
    private javax.swing.JLabel userID;
    private javax.swing.JTextField useridbox;
    // End of variables declaration//GEN-END:variables

    @Override
   public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
return NO_SUCH_PAGE;
}

// get the bounds of the component
Dimension dim = jPanel1.getSize();
double cHeight = dim.getHeight();
double cWidth = dim.getWidth();

// get the bounds of the printable area
double pHeight = pageFormat.getImageableHeight();
double pWidth = pageFormat.getImageableWidth();

double pXStart = pageFormat.getImageableX();
double pYStart = pageFormat.getImageableY();

double xRatio = pWidth / cWidth;
double yRatio = pHeight / cHeight;


Graphics2D g2 = (Graphics2D) graphics;
g2.translate(pXStart, pYStart);
g2.scale(xRatio, yRatio);
jPanel1.paint(g2);

return Printable.PAGE_EXISTS;
}
}
