/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public abstract class StCo {
     private String coursecode;
     List<Integer> studentID=new ArrayList<>();
     

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }
   

    
    
    public List<Integer> getStudentID() {
        return studentID;
    }
    public void setStudentID(List<Integer> studentID) {
        this.studentID = studentID;
    }
}
