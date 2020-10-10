/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eh5i0
 */
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.BufferedInputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class information extends javax.swing.JFrame  {
                        int i=-1;

    public information()
    {
        initComponents() ;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(674,550);
       this.setLocationRelativeTo(null);
       this.setBackground(Color.yellow);
    }
   
   public  void in(Saveclass m)
    {
       this.jl.setIcon(m.img);
        this.Account.setText(" "+m.accounttext);
         this.name.setText(" "+m.nametext);
          this.Birth.setText(" "+m.birth);
          this.FatherName.setText(" "+m.fathernametext);
          this.Calender.setText(" "+m.date);
          this.Mothername.setText(" "+m.mothernametext);
          this.Mobilenumber.setText(" "+m.mobile);
          this.Gender.setText(" "+m.gender);
          this.Marital.setText(" "+m.merital);
          this.address.setText(" "+m.Address);
          this.balance.setText(" "+m.balance);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Calender = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        Mothername = new javax.swing.JLabel();
        Birth = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Marital = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        Mobilenumber = new javax.swing.JLabel();
        Calender12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accountnotextbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Account No:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 147, -1, -1));

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 179, -1, 28));

        jLabel4.setText("Father's name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 221, -1, -1));

        jLabel5.setText("Mother's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 262, -1, -1));

        jLabel6.setText("Date of Birth :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 350, -1, -1));

        jLabel8.setText("Mobile No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 308, -1, -1));

        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 348, -1, 20));

        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 398, -1, -1));

        jLabel10.setText("Marital Status:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 449, -1, -1));

        jLabel11.setText("Balance:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 433, 51, 20));

        jLabel12.setText("Date:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 115, -1, -1));

        Calender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 110, 109, 24));

        jl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 118, 140, 137));

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 189, 153, 24));

        Account.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 145, 153, 24));

        FatherName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 262, 153, 24));

        Mothername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 221, 153, 24));

        Birth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 350, 153, 24));

        Gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 398, 153, 24));

        Marital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Marital, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 439, 153, 24));

        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 337, 191, 53));

        balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 424, 191, 33));

        Mobilenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Mobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 308, 153, 24));

        Calender12.setForeground(new java.awt.Color(0, 0, 204));
        Calender12.setText("          Image");
        Calender12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender12, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 266, 100, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("       Customer Information ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 20, 273, -1));

        jLabel14.setText("Enter account no:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 64, -1, -1));

        accountnotextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnotextboxActionPerformed(evt);
            }
        });
        getContentPane().add(accountnotextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 61, 172, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountnotextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnotextboxActionPerformed
       
    }//GEN-LAST:event_accountnotextboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ObjectInputStream oos1=null;
         ArrayList<Saveclass>am=new ArrayList<>();  
        
        
            FileInputStream fis=null;
            try {
                fis = new FileInputStream(("F:\\New folder (2)\\input.txt"));
                                 oos1=new ObjectInputStream(fis);
                                                 am=(ArrayList<Saveclass>)oos1.readObject();
                                          oos1.close();

            } catch (Exception ex) {
                Logger.getLogger(information.class.getName()).log(Level.SEVERE, null, ex);
            }

             for( Saveclass m : am)
               {
                   System.out.println (m.date+ m.accounttext+m.fathernametext+m.nametext+m.mothernametext+m.birth+m.gender+m.merital);
                 System.out.println();
               }
             
                System.out.println(am.size()+" elements are stored.");
                      //  System.out.println(" Enter the number of element's serial number:");
                         for( Saveclass m : am){
                         
                  System.out.println(m.accounttext+" "+accountnotextbox.getText());

               if(m.accounttext.equals(accountnotextbox.getText()))
                { 
                    i=1; 
                  in(am.get(am.indexOf(m)));
                  break;
                }
               else
                   i=0;
                         }
                         
                         
                if (i!=1)
                { 
                    JOptionPane.showMessageDialog(this,"not found");
                   
                }

                         
      
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
           new information().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Birth;
    private javax.swing.JLabel Calender;
    private javax.swing.JLabel Calender12;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Marital;
    private javax.swing.JLabel Mobilenumber;
    private javax.swing.JLabel Mothername;
    private javax.swing.JTextField accountnotextbox;
    private javax.swing.JLabel address;
    private javax.swing.JLabel balance;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

   
}
