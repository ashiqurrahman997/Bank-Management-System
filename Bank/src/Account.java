/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eh5i0
 */
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JFrame implements Serializable {

    public String birth = "";
    public String date = "";
    public String month = "";
    public String year = "";
    public String gender = "";
    public String merital = "";

    public Account() {
        super();

        initComponents();
        this.setSize(600,640);
        currentdate();
        this.setLocationRelativeTo(null);
       Balancetextbox.setText("0");
    }

    public String im() {
        return Calender.getText();
    }

    public void uc(String d) {
        Calender.setText(d);
    }

    public void currentdate() {
        Calendar c = new GregorianCalendar();
        int date = c.get(c.DAY_OF_MONTH);
        int month = c.get(c.MONTH);
        int year = c.get(c.YEAR);
        Calender.setText("     " + date + " / " + (month + 1) + " / " + year);
    }

    public ImageIcon reimage(String ImagePath) {
        ImageIcon image = new ImageIcon(ImagePath);
        Image img = image.getImage();
        Image newlmage = img.getScaledInstance(jl.getWidth(), jl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newl = new ImageIcon(newlmage);
        return newl;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AccountText = new javax.swing.JTextField();
        NameTextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FatherTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        MotherTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MobileTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Maried = new javax.swing.JRadioButton();
        Unmaried = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        Balancetextbox = new javax.swing.JTextField();
        uploadimage = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Calender = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Addresstextbox = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Registration Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, 347, 53));

        jLabel2.setText("Account No:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 123, -1, -1));

        AccountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTextActionPerformed(evt);
            }
        });
        getContentPane().add(AccountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 112, 178, 28));

        NameTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextboxActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 151, 178, 28));

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 151, -1, 28));

        FatherTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherTextBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FatherTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 190, 178, 28));

        jLabel4.setText("Father's name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 197, -1, -1));

        jLabel5.setText("Mother's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 238, -1, -1));

        jLabel6.setText("Date of Birth :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 336, -1, -1));

        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Date.setToolTipText("");
        Date.setBorder(null);
        Date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Date.setName(""); // NOI18N
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 331, -1, -1));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month.setBorder(null);
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });
        getContentPane().add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 331, -1, -1));

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1995", "1996", "1996", "1997", "1998", "1999", "2000" }));
        Year.setBorder(null);
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        getContentPane().add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        MotherTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherTextBoxActionPerformed(evt);
            }
        });
        getContentPane().add(MotherTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 234, 178, 28));

        jLabel8.setText("Mobile No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 277, -1, -1));

        MobileTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileTextBoxActionPerformed(evt);
            }
        });
        getContentPane().add(MobileTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 270, 178, 28));

        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 441, -1, 20));

        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 366, -1, -1));

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 366, -1, -1));

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 366, -1, -1));

        jLabel10.setText("Marital Status:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 400, -1, -1));

        Maried.setText("Maried");
        Maried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MariedActionPerformed(evt);
            }
        });
        getContentPane().add(Maried, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 396, -1, -1));

        Unmaried.setText("Unmaried");
        Unmaried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnmariedActionPerformed(evt);
            }
        });
        getContentPane().add(Unmaried, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 396, -1, -1));

        jLabel11.setText("Balance:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 496, 80, 20));

        Balancetextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalancetextboxActionPerformed(evt);
            }
        });
        getContentPane().add(Balancetextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 491, 200, 30));

        uploadimage.setText("Upload Image");
        uploadimage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadimageActionPerformed(evt);
            }
        });
        getContentPane().add(uploadimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 235, 104, 27));

        Save.setText("Save");
        Save.setBorder(null);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 130, 40));

        jLabel12.setText("Date:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 86, -1, -1));

        Calender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 82, 109, 24));

        jl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 92, 140, 137));

        jScrollPane1.setViewportView(Addresstextbox);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 425, 213, 55));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\eh5i0\\Desktop\\abstract_colours_wallpaper_21ef8.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTextActionPerformed

    }//GEN-LAST:event_AccountTextActionPerformed

    private void NameTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextboxActionPerformed

    }//GEN-LAST:event_NameTextboxActionPerformed

    private void FatherTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherTextBoxActionPerformed

    }//GEN-LAST:event_FatherTextBoxActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        month=(String) this.Month.getSelectedItem();
    }//GEN-LAST:event_MonthActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        date= (String) this.Date.getSelectedItem();
    }//GEN-LAST:event_DateActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        year= (String) this.Year.getSelectedItem();
        birth=date+" "+month+" "+year;
    }//GEN-LAST:event_YearActionPerformed

    private void MotherTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotherTextBoxActionPerformed

    }//GEN-LAST:event_MotherTextBoxActionPerformed

    private void MobileTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileTextBoxActionPerformed

    }//GEN-LAST:event_MobileTextBoxActionPerformed

    private void UnmariedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnmariedActionPerformed
        this.merital = this.Unmaried.getText();
       this.Maried.setSelected(false);
    }//GEN-LAST:event_UnmariedActionPerformed

    private void BalancetextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalancetextboxActionPerformed
                 
    }//GEN-LAST:event_BalancetextboxActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        gender = Female.getText();
        this.Male.setSelected(false);
    }//GEN-LAST:event_FemaleActionPerformed
         public void ac(String p)
         {
             this.AccountText.setText(p);
         }
          public void bc(ImageIcon p)
         {
             this.jl.setIcon(p);
         }
   
    private void uploadimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadimageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image", "jpg", "gif", "bmp");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File Selectedfile = file.getSelectedFile();
            String path = Selectedfile.getAbsolutePath();
            jl.setIcon(reimage(path));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Image is not Selected");
        }
    }//GEN-LAST:event_uploadimageActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
      int k= JOptionPane.showConfirmDialog(this,"Save Sucessfully ??");
      if(k==0)
        {
           if(Integer.parseInt(Balancetextbox.getText())<500&&Balancetextbox.getText()!="")
             {
                JOptionPane.showMessageDialog(null,"Balance is less than 500");
             }
            else if(Balancetextbox.getText().equals("[0-9]+"))
            {
                JOptionPane.showMessageDialog(null,"Balance is Empty !!");
            }
            else
            {   
            String fm = this.FatherTextBox.getText();
        String mn = this.MobileTextBox.getText();
        String mo = this.MobileTextBox.getText();
        String da = this.Calender.getText();
        String ac = this.AccountText.getText();
        String nm = this.NameTextbox.getText();
        String adrs=this.Addresstextbox.getText();
        String blnce =this.Balancetextbox.getText();
        Saveclass a = new Saveclass(da, ac, nm, fm, mn, mo, birth, gender, merital,adrs,blnce, (ImageIcon) jl.getIcon());
                   ArrayList<Saveclass> am=null;
     //   ObjectOutputStream oos=null;
               BufferedInputStream oos2 = null;
       // ObjectInputStream oos1=null;
          File fis=new File(("F:\\New folder (2)\\input.txt"));
        // File fis = null;

        try {

            if(fis.exists())
            {
          
                
          ObjectInputStream  oos1 = new ObjectInputStream(new FileInputStream(fis));
         
            am=(ArrayList<Saveclass>)oos1.readObject();
            am.add(a);
                        System.out.println();
             oos1.close();
            }
            else
               am=new ArrayList<Saveclass>();
            
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\New folder (2)\\input.txt"))) {
                oos.writeObject(am);
                // oos.reset();
            }
          //  oos1.close();
            // Fille f= new File("F:\\New folder (2)\\input1.txt");
            System.out.println( "  sucessfully write !!  ");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }

           System.exit(0);
        }
        }
      else if(k==2)
          System.exit(0);
    }//GEN-LAST:event_SaveActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
         this.Female.setSelected(false);
        gender = Male.getText();

    }//GEN-LAST:event_MaleActionPerformed

    private void MariedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MariedActionPerformed
        this.Unmaried.setSelected(false);
        this.merital = this.Maried.getText();
    }//GEN-LAST:event_MariedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
            new Account().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountText;
    private javax.swing.JTextPane Addresstextbox;
    private javax.swing.JTextField Balancetextbox;
    private javax.swing.JLabel Calender;
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JTextField FatherTextBox;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton Maried;
    private javax.swing.JTextField MobileTextBox;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JTextField MotherTextBox;
    private javax.swing.JTextField NameTextbox;
    private javax.swing.JButton Save;
    private javax.swing.JRadioButton Unmaried;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl;
    private javax.swing.JButton uploadimage;
    // End of variables declaration//GEN-END:variables
}
