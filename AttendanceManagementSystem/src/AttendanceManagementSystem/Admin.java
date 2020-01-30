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
public class Admin extends User  {
    private String path;

    
    public Admin(String path)
    {
        this.path=path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public void changePassword(int id,String newPassord)
    {
        
    }
    
    
}
