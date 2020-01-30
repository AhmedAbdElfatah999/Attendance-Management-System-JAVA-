/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /* ArrayList<Object> attendance= FileManager.read("Files\\Attendance.txt");
       for (Object i:attendance){
           Attendance c=(Attendance) i;
           System.out.println(c.date.getDay());
           System.out.println(c.date.getMonteh());
           System.out.println(c.date.getYear());
           System.out.println(c.getCoursecode());
           System.out.println(c.getTeachrId());
           System.out.println(c.studentID.get(0));
           System.out.println(c.studentID.get(2));
           System.out.println("////////////////////");
           
           
       }*/
      /* ArrayList<Object> fees= FileManager.read("Files\\Fees.txt");
       for (Object i:fees){
           Fees c=(Fees) i;
          // System.out.println(c.date.getDay());
          // System.out.println(c.date.getMonteh());
          // System.out.println(c.date.getYear());
           System.out.println(c.getCoursecode());
          // System.out.println(c.getTeachrId());
           System.out.println(c.studentID.get(0));
           System.out.println(c.studentID.get(2));
           System.out.println("////////////////////");
           
           
       }*/
     // Admin.allot("OR1717",1478);
       
    
       
          
      /*
      //FileManager.write("qwertyuksdfghjkcvb","D:\\lectures\\pl2\\Project\\New folder\\Test.txt", false);
       ArrayList<Object> Students= FileManager.read("Files\\Students.txt");
       for (Object i:Students){
           Student c=(Student) i;
           System.out.println(c.getTotalAttendance());
         // System.out.println(c.date.getMonteh());
          // System.out.println(c.date.getYear());
           System.out.println(c.getCoursecode());
          // System.out.println(c.getTeachrId());
           System.out.println(c.studentID.get(0));
           System.out.println(c.studentID.get(2));
           System.out.println("////////////////////");*/
      // }
    
     /* ArrayList<Object> Teachers= FileManager.read("Files\\Teachers.txt");
           for (Object i:Teachers){
              Teacher c=(Teacher) i;
           
              if(c.getId()==4017021){
                 //return (Object)c;
                 System.out.println(c.getId());
                 System.out.println(c.getEmail());
                 System.out.println(c.getPassword());
                 System.out.println(c.getUserName());
               
             }
            }  */ 
   /*  
     Admin.update(2017001, "asde1452", null, "AHMED ALI");
     Admin.view(2017001);
     Admin.reports("HR_2015", "1/3/2017", "1/3/2017");
     */
//_______________________________________________________________________________
 /*   String code="CS215";
    String fromDate="1/2/2017";
    String toDate="3/2/2017";
    ArrayList<Integer> StAttId=new ArrayList<>();
    
    ArrayList<Object> Attendances= FileManager.read("Files\\Attendance.txt");
    
           String[] startDate1=fromDate.split("/");
           int[]startDate= Arrays.stream(startDate1).mapToInt(Integer::parseInt).toArray();
           
           String[] endDate1=toDate.split("/");
           int[]endDate= Arrays.stream(endDate1).mapToInt(Integer::parseInt).toArray();
           for (Object i:Attendances){
              Attendance c=(Attendance) i;
             
              if( c.getCoursecode().equals(code) && c.date.getMonteh()==startDate[1] && (c.date.getDay()>=startDate[0]&&c.date.getDay()<=endDate[0])){
                  StAttId.addAll(c.studentID);
                System.out.println("1");
              }
            }
System.out.println(StAttId);
int Count = Collections.frequency(StAttId,2017001 );
System.out.println(Count);

       ArrayList<Object> Students= FileManager.read("Files\\Students.txt");
       for (Object i:Students){
           Student c=(Student) i;
           if(StAttId.contains(c.getId()))
           {
               int Counter = Collections.frequency(StAttId, c.getId());
               FileManager.write(c.getUserName()+"                     "+c.getId()+"                     "+Integer.toString(Counter),"Files\\Weekly Reports.txt",true);
           }
      }*/
//_______________________________________________________________________________
  /* ArrayList<String>Ent=  Login.login("AhMED ALI@gmail.com", "asde1452");

     System.out.println(Ent.size());
       System.out.println(Ent.g[0]);*/
      // System.out.println(Login.ToCapital("null"));
      //Admin.allot("CS215", 0);
    
     Login.login("aYa AlI@GMAIL.COM", "741erty");
    }  
}
