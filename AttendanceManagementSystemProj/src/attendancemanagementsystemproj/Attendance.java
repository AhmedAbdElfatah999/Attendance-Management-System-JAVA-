/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

/*import java.util.ArrayList;
import java.util.List;*/

/**
 *
 * @author hp
 */
public class Attendance extends StCo {
   // private String coursecode;
    private int teachrId;
    public Date date=new Date();
    //List<Integer> studentID=new ArrayList<>();

  /* public String getCoursecode() {
        return coursecode;
    }*/

  /*  public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }*/
   
    public int getTeachrId() {
        return teachrId;
    }
    
     public void setTeachrId(int teachrId) {
        this.teachrId = teachrId;
    }
    
  /*  public List<Integer> getStudentID() {
        return studentID;
    }
    public void setStudentID(List<Integer> studentID) {
        this.studentID = studentID;
    }*/

  

   
    
    
}
