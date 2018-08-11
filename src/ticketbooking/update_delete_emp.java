/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import static ticketbooking.parent.jDesktopPane1;


/**
 *
 * @author gurpreet9001
 */
public class update_delete_emp extends javax.swing.JInternalFrame implements myvariables {

   File myfile;
String oldfilename;
    
    public update_delete_emp() {
        initComponents();
        
//        java.util.Date obj=new java.util.Date();
//SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
//try 
//{ 
//datebox.setDate(myformat.parse(myformat.format(obj)));
//} 
//catch (Exception ex) 
//{
//}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        Movies = new javax.swing.JButton();
        usernamebox = new javax.swing.JTextField();
        agebox = new javax.swing.JTextField();
        emailbox = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        malebox = new javax.swing.JRadioButton();
        femalebox = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        phonebox = new javax.swing.JFormattedTextField();
        Movies1 = new javax.swing.JButton();
        upload1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update/Delete Employee");
        setName("New"); // NOI18N
        setVisible(true);

        jPanel1.setName("Book Movie Tickets"); // NOI18N

        name.setText("Employee Name");

        age.setText("Age");

        email.setText("Email");

        phone.setText("Phone no.");

        Movies.setText("Delete");
        Movies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoviesActionPerformed(evt);
            }
        });

        gender.setText("Gender");

        buttonGroup1.add(malebox);
        malebox.setText("Male");

        buttonGroup1.add(femalebox);
        femalebox.setText("Female");

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        upload.setText("Update");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        try {
            phonebox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Movies1.setText("Search");
        Movies1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movies1ActionPerformed(evt);
            }
        });

        upload1.setText("Upload Image");
        upload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Movies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(usernamebox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agebox)
                                    .addComponent(emailbox)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(malebox)
                                        .addGap(18, 18, 18)
                                        .addComponent(femalebox)
                                        .addGap(0, 60, Short.MAX_VALUE))
                                    .addComponent(phonebox))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Movies1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upload1)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Movies1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(malebox)
                            .addComponent(femalebox))
                        .addGap(96, 96, 96)
                        .addComponent(Movies)
                        .addGap(18, 18, 18)
                        .addComponent(upload))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upload1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoviesActionPerformed
try
{
Connection myconnection;
myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASS);
try
{

String q="delete from details"
+ " where phone_no=?";
PreparedStatement mystatement=myconnection.prepareStatement(q);
mystatement.setString(1, phonebox.getText());

if(mystatement.executeUpdate()>0)
{
JOptionPane.showMessageDialog(rootPane, "Deleted successfully");
usernamebox.setText("");
agebox.setText("");
emailbox.setText("");
phonebox.setText("");
jLabel7.setText("");

}

else
{
JOptionPane.showMessageDialog(rootPane, "Fill all values");
}

}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in Query due to " + e.getMessage());
}
finally
{
myconnection.close();
}

}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in Connection due to " + e.getMessage());
}     }//GEN-LAST:event_MoviesActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
String filename;
if(myfile!=null)
{
filename = new java.util.Date().getTime() + myfile.getName();//Date.getTime() added for unique file name.
int i;
FileInputStream rd = null;
FileOutputStream outs = null;

try {


rd = new FileInputStream(myfile);
outs = new FileOutputStream("empimages\\"+filename);//writing the new file in 'Images' folder, in the project

byte[] b = new byte[2048];
while ((i = rd.read(b)) !=-1) {
outs.write(b, 0, i); //copying from pictures to empimages byte by byte

}

} 
catch (Exception e) 
{
JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
} 
finally {
try {
rd.close();
outs.close();
} catch (Exception e) {
JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
}
}
File oldimage=new File("empimages\\" + oldfilename);
if(!oldimage.getName().equals("default.png"))
{
oldimage.delete();
}




}
else
{
filename=oldfilename;

}




try
{
Connection myconnection;
myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASS);
try
{

String q="update details set name=?, gender=?,email=?,age=?,image=?"
+ " where phone_no=?";
PreparedStatement mystatement=myconnection.prepareStatement(q);
mystatement.setString(1, usernamebox.getText());

if(malebox.isSelected())
{
mystatement.setString(2, "Male");
}
else if(femalebox.isSelected())
{
mystatement.setString(2, "Female"); 
}
mystatement.setString(3, emailbox.getText());
mystatement.setString(4, agebox.getText());
mystatement.setString(5, filename);
mystatement.setString(6, phonebox.getText());

if(mystatement.executeUpdate()>0)
{
JOptionPane.showMessageDialog(rootPane, "Data updated successfully");
usernamebox.setText("");
agebox.setText("");
emailbox.setText("");
phonebox.setText("");
jLabel7.setText("");

}

else
{
JOptionPane.showMessageDialog(rootPane, "Fill all values");
}

}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in Query due to " + e.getMessage());
}
finally
{
myconnection.close();
}

}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in Connection due to " + e.getMessage());
} 
    }//GEN-LAST:event_uploadActionPerformed

    private void Movies1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movies1ActionPerformed
Connection myconnection;
try
{
myconnection=DriverManager.getConnection(PATH+PLACE,USERNAME,PASS);
try
{
String a="select * from details where phone_no=?";
PreparedStatement mystatement=myconnection.prepareStatement(a); 
mystatement.setString(1, phonebox.getText());

ResultSet myresult=mystatement.executeQuery(); 
if(myresult.next())
{
agebox.setText(myresult.getString("age"));
emailbox.setText(myresult.getString("email"));
usernamebox.setText(myresult.getString("name"));



String myfile=myresult.getString("image");
oldfilename=myfile;
Image simg = ImageIO.read( new File("empimages//" + myfile)).getScaledInstance( jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT);
jLabel7.setIcon(new ImageIcon(simg));
}
else
{
JOptionPane.showMessageDialog(rootPane, "Wrong phone number");
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, "Error in query " + e.getMessage());
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

    }//GEN-LAST:event_Movies1ActionPerformed

    private void upload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload1ActionPerformed
        JFileChooser myfilechooser=new JFileChooser();

        myfilechooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                return true;

                String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
                String allowed[]={"jpg","png","gif","jpeg","bmp"};
                for(String a:allowed)
                {
                    if(a.equals(extension))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return false;

            }

            @Override
            public String getDescription() {
                return "All Picture Files";

            }
        });

        if(myfilechooser.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
        {
            myfile=myfilechooser.getSelectedFile();
            try
            {
                Image simg = ImageIO.read( new File(myfile.getAbsolutePath())).getScaledInstance( jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_AREA_AVERAGING);
                jLabel7.setIcon(new ImageIcon(simg));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
        }

    }//GEN-LAST:event_upload1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Movies;
    private javax.swing.JButton Movies1;
    private javax.swing.JLabel age;
    private javax.swing.JTextField agebox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailbox;
    private javax.swing.JRadioButton femalebox;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton malebox;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JFormattedTextField phonebox;
    private javax.swing.JButton upload;
    private javax.swing.JButton upload1;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables
}
