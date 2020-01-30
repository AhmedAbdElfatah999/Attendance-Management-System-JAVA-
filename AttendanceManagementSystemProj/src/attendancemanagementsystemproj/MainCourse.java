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
public class MainCourse extends Course {
    protected List<Integer>courseStudent=new ArrayList<>();
    protected List<Integer>courseTeacher=new ArrayList<>();
   protected  List<Integer> getCourseStudent() {
        return courseStudent;
    }

   protected void setCourseStudent(List<Integer> courseStudent) {
        this.courseStudent = courseStudent;
        
    }

    public List<Integer> getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(List<Integer> courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}
