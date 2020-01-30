/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AttendanceManagementSystem;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Student extends User{
   private int id;
  ArrayList <StCourse> cource=new ArrayList<>();

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    
    
}
