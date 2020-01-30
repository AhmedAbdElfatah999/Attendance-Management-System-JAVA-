/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AttendanceManagementSystem;
/**
 *
 * @author hp
 */
public abstract class User {
    private String userName;
    private String Email;
    private String Password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

   
   
    
}
