/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AttendanceManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class StCourse extends Course {
    
    byte[] AttAttendance= new byte[150];
    boolean fees;
    public byte[] getAttAttendance() {
        return AttAttendance;
    }

    public void setAttAttendance(byte A,int pos) { //POS is the Statc Variable from mark Attendance
        this.AttAttendance[pos] = A;
    }
    
}
