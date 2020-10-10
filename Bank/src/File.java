/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eh5i0
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;


public class File extends JFrame {

 
    public static void pm()
    {
     JOptionPane.showMessageDialog(null," Found");
 
    }
    public static void main(String args[]) throws Exception   
    {
  
        ObjectInputStream oos1=null;
         ArrayList<Saveclass>am=new ArrayList<>();  
        
        {        FileInputStream fis=new FileInputStream(("F:\\New folder (2)\\input.txt"));

         oos1=new ObjectInputStream(fis);
        
       {
                     

            am=(ArrayList<Saveclass>)oos1.readObject();
                          oos1.close();

             for( Saveclass m : am)
               {
                   System.out.println (m.date+ m.accounttext+m.fathernametext+m.nametext+m.mothernametext+m.birth+m.gender+m.merital);
                System.out.println();
               }
                Scanner sc =new Scanner(System.in);
                                 System.out.println(am.size()+" elements are stored.");
                        System.out.println(" Enter the number of element's serial number:");
                            // for( Saveclass m : am)
               // if( sc.nextLine().equals(m.accounttext))
                {
                 {
                 information im =new information();
                          
               //  im.in(am.get(sc.nextInt()-1));
                                im.setVisible(true);
                   
                 }
              //  else
                    // pm();
            

      
       }
       }
        }
        
        {
        } 
        
       // String[]k={"aksh","ashdkj"};
       // String[][] p={"jjahjkash","hjasjh"},{"aksdjhk","akshkj"};
        JTable jt=new JTable();
        
        
       Object[][]data=null;
        // frog g=new frog();
          System.out.println("Sucessfully read");

    }  
    }


    


