/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.util.ArrayList;



/**
 *
 * @author hp
 */
public class Student extends User{
   public ArrayList<Course> course=new ArrayList<>();
   private int totalAttendance=0;

    public int getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(int totalAttendance) {
        this.totalAttendance = totalAttendance;
    }
   
    
}
