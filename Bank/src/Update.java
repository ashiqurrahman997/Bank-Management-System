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
import javax.swing.ImageIcon;
import java.awt.Image;
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

public class Update extends javax.swing.JFrame implements Serializable {

    public String birth = "";
    public String date = "";
    public String month = "";
    public String year = "";
    public String gender = "";
    public String merital = "";
   int i=-1,pk=0,sk=-1;
   private ArrayList<Saveclass>am=null;
    public Update() {
        super();

        initComponents();
       this.setSize(600,660);
       // currentdate();
        this.setLocationRelativeTo(null);

    }

    public String im() {
        return Calender.getText();
    }

    public void uc(String d) {
        Calender.setText(d);
    }
    
    public ImageIcon reimage(String ImagePath) {
        ImageIcon image = new ImageIcon(ImagePath);
        Image img = image.getImage();
        Image newlmage = img.getScaledInstance(jl.getWidth(), jl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newl = new ImageIcon(newlmage);
        return newl;
    }

      public  void in(Saveclass m)
    {
       this.jl.setIcon(m.img);
        this.AccountText.setText(m.accounttext);
        this.NameTextbox.setText(m.nametext);
        //  this..setText(" "+m.birth);
          this.FatherTextBox.setText(m.fathernametext);
          this.Calender.setText(" "+m.date);
          this.MobileTextBox.setText(m.mothernametext);
          this.MobileTextBox.setText(m.mobile);
          if(m.gender.equals("male"))
          {
              this.Male.setSelected(true);
          }
          else
              this.Female.setSelected(true);
           if(m.merital.equals("maride"))
          {
              this.Maried.setSelected(true);
          }
          else
             this.Unmaried.setSelected(true);
          this.Addresstextbox.setText(m.Address);
          this.Balancetextbox.setText(m.balance);
          
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
        accountnotextbox = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("        Update Information");

        jLabel2.setText("Account No:");

        AccountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTextActionPerformed(evt);
            }
        });

        NameTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        FatherTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherTextBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Father's name:");

        jLabel5.setText("Mother's Name:");

        jLabel6.setText("Date of Birth :");

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

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month.setBorder(null);
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1995", "1996", "1996", "1997", "1998", "1999", "2000" }));
        Year.setBorder(null);
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        MotherTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherTextBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Mobile No:");

        MobileTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileTextBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Address:");

        jLabel9.setText("Gender:");

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        jLabel10.setText("Marital Status:");

        Maried.setText("Maried");
        Maried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MariedActionPerformed(evt);
            }
        });

        Unmaried.setText("Unmaried");
        Unmaried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnmariedActionPerformed(evt);
            }
        });

        jLabel11.setText("Balance:");

        Balancetextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalancetextboxActionPerformed(evt);
            }
        });

        uploadimage.setText("Upload Image");
        uploadimage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadimageActionPerformed(evt);
            }
        });

        Save.setText("Update");
        Save.setBorder(null);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel12.setText("Date:");

        Calender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(Addresstextbox);

        jLabel13.setText("jLabel13");

        accountnotextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnotextboxActionPerformed(evt);
            }
        });

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Calender, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountText)
                    .addComponent(NameTextbox)
                    .addComponent(FatherTextBox)
                    .addComponent(accountnotextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search)
                        .addGap(88, 88, 88))))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(MotherTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(uploadimage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(MobileTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addGap(71, 71, 71)
                .addComponent(Male)
                .addGap(43, 43, 43)
                .addComponent(Female))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addComponent(Maried)
                .addGap(33, 33, 33)
                .addComponent(Unmaried))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Balancetextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(accountnotextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Calender, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(AccountText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(NameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(FatherTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(MotherTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(uploadimage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addComponent(MobileTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Male)
                    .addComponent(Female))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(Maried)
                    .addComponent(Unmaried))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Balancetextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

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
             
      if(pk==1)
        {
                    int k= JOptionPane.showConfirmDialog(this,"Update Sucessfully ??");
                    if(k==0)
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
        am.set(sk,a);
          
              // am=new ArrayList<Saveclass>();
            
            try (
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\New folder (2)\\input.txt"))) {
                oos.writeObject(am);
            
            System.out.println( "  sucessfully update !!  ");
        } catch (IOException ex) {
        }
          // System.exit(0);
        }
      else if(k==2)
          System.exit(0);
        }
       
          
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

    private void accountnotextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnotextboxActionPerformed
        
    }//GEN-LAST:event_accountnotextboxActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
      ObjectInputStream oos1=null;
        am=new ArrayList<>();  

        
            FileInputStream fis=null;
            try {
                fis = new FileInputStream(("F:\\New folder (2)\\input.txt"));
                                 oos1=new ObjectInputStream(fis);
                 am=(ArrayList<Saveclass>)oos1.readObject();
               oos1.close();

            } catch (Exception ex) {
                Logger.getLogger(information.class.getName()).log(Level.SEVERE, null, ex);
            }
            String st="";
             for( Saveclass m : am)
               {
                 //  System.out.println (m.date+ m.accounttext+m.fathernametext+m.nametext+m.mothernametext+m.birth+m.gender+m.merital);
                // System.out.println();
                   st=st+"\n->"+m.accounttext;
               }

                System.out.println(am.size()+" elements are stored.");
                      //  System.out.println(" Enter the number of element's serial number:");
                         for( Saveclass m : am){
                         
                  System.out.println(m.accounttext+" "+accountnotextbox.getText());

               if(m.accounttext.equals(accountnotextbox.getText()))
                { 
                    i=1;
                    pk=1;
                    sk=am.indexOf(m);
                  in(am.get(am.indexOf(m)));
                  break;
                }
               else
                   i=0;
                         }      
                if (i!=1)
                { 
                    JOptionPane.showMessageDialog(this,"not found");
     JOptionPane.showMessageDialog(this,"There are total account number : "+"\n"+st);

                }

    }//GEN-LAST:event_searchActionPerformed

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
            new Update().setVisible(true);
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
    private javax.swing.JTextField accountnotextbox;
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
    private javax.swing.JButton search;
    private javax.swing.JButton uploadimage;
    // End of variables declaration//GEN-END:variables
}
