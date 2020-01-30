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
public class StuInCourse extends Course {
   private List<Integer>corseStudent=new ArrayList<>();

   protected  List<Integer> getCorseStudent() {
        return corseStudent;
    }

   protected void setCorseStudent(List<Integer> corseStudent) {
        this.corseStudent = corseStudent;
    }
   
}
