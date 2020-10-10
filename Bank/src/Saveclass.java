/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eh5i0
 */
import java.io.Serializable;
import javax.swing.ImageIcon;

public class Saveclass implements Serializable {
    protected String accounttext="empty";
     protected String nametext="empty";
      protected String fathernametext="empty";
       protected String mothernametext="empty";
       protected String date="empty";
       protected String mobile="empty";
       protected String gender="empty";
       protected String merital="empty";
       protected String birth="empty";
      protected ImageIcon img=null;
       protected String Address="";
       protected String balance="";
      public Saveclass(String d,String a, String n ,String f ,String m 
       ,String mo ,String bi ,String g ,String me ,String adrs,String blnc, ImageIcon img)
      {
          this.accounttext=a;
          this.nametext=n;
          this.fathernametext=f;
          this.mothernametext=m;
          this.date=d;
          this.birth=bi;
          this.mobile=mo;
          this.gender=g;
          this.merital=me;
          this.img=img;
          this.Address=adrs;
          this.balance=blnc;
      }
    public void saveaccounttext( String a)
    {
        this.accounttext=a;
        
    }
    
     public void nametext( String a)
    {
        this.nametext=a;
        
    }
    
}
