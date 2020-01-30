/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.io.File;

/**
 *
 * @author hp
 */
public  class User {
    private String userName;
    private String Email;
    private String Password;
    private int id;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setUserName(String userName) {
        this.userName = userName;
    }

    protected void setEmail(String Email) {
        this.Email = Email;
    }

    protected void setPassword(String Password) {
        this.Password = Password;
    }

    protected String getUserName() {
        return userName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

   public static void rename(String path){
         File f=new File(path);
           if (f.exists())
       
       f.delete() ;
       
       
       File newF =new File("Files\\Temp.txt");
        newF.renameTo(new File(path));
    }
   
    
}
