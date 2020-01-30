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
public class Admin extends User{
     private String path;

    
    public Admin(String path)
    {
        this.path=path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
//_________________________________________________________________________________________________________update
    
    public static void update(int Id ,String newPassord ,String nEmail ,String newUsername)
    {
       ArrayList<Object> Users= FileManager.read("Files\\User.txt");
       for (Object i:Users){
           User c=(User) i;
           if(c.getId()==Id){
               if(newPassord!=null) c.setPassword(newPassord);
               
               if(nEmail!=null){
                   String newEmail=Login.ToCapital(nEmail);
                   c.setEmail(newEmail);
               }
               
               if(newUsername!=null) c.setUserName(newUsername); 
           }
           FileManager.write(Integer.toString(c.getId())+"#"+c.getEmail()+"#"+c.getUserName()+"#"+c.getPassword(),"Files\\Temp.txt",true);
       }
       rename("Files\\User.txt");
     /*  byte test=0;
       for (Object i:Users){
           User c=(User) i;
           if(test!=0) FileManager.write(Integer.toString(c.getId())+"#"+c.getUserName()+"#"+c.getEmail()+"#"+c.getPassword(), "Files\\User.txt",true);
           else {FileManager.write(Integer.toString(c.getId())+"#"+c.getUserName()+"#"+c.getEmail()+"#"+c.getPassword(), "Files\\User.txt",false); test=1;}
           }*/
       }  
  
//_________________________________________________________________________________________________________Allot
    
    
    public static void allot(String coursecode ,int id )
    {
         ArrayList<Object> courses= FileManager.read("Files\\Courses.txt");
         String line="";
         int j=0;
       for (Object i:courses){
           MainCourse c=(MainCourse) i;
           if(c.getCode().equals(coursecode)){
               c.courseTeacher.add(id);
           }
           line=c.getCode()+"#"+c.getName()+"#"+c.getSection()+"#";
           
           j=0;
           while(j<c.courseTeacher.size())
           {
               if(j==c.courseTeacher.size()-1) line+=c.courseTeacher.get(j);
               else line+=c.courseTeacher.get(j)+"&";
               j++;
           }
           
           line+="#";
           j=0;
           while(j<c.courseStudent.size())
           {
               if(j==c.courseStudent.size()-1) line+=c.courseStudent.get(j);
               else line+=c.courseStudent.get(j)+"&";
               j++;   
           }
        FileManager.write(line,"Files\\Temp.txt",true);    
       }
       rename("D:\\lectures\\pl2\\Project\\AttendanceManagementSystemProj\\Files\\Courses.txt");
       }   
//_________________________________________________________________________________________________________View
public /*Object*/ static void view(int id){
       if (id<4017020){
           ArrayList<Object> Students= FileManager.read("Files\\Students.txt");
           for (Object i:Students){
              Student c=(Student) i;
           
              if(c.getId()==id){
                 //return (Object)c;
                 System.out.println(c.getId());
                 System.out.println(c.getEmail());
                 System.out.println(c.getTotalAttendance());
                 System.out.println(c.getPassword());
                 System.out.println(c.getUserName());
              }
            }
           
    }else {
           ArrayList<Object> Teachers= FileManager.read("Files\\Teachers.txt");
           for (Object i:Teachers){
              Teacher c=(Teacher) i;
           
              if(c.getId()==4017021){
                 //return (Object)c;
                
                 System.out.println(c.getId());
                 System.out.println(c.getEmail());
                 System.out.println(c.getPassword());
                 System.out.println(c.getUserName());
               
             }
            }     
         }
      
    
}

//_________________________________________________________________________________________________________reports

public static void reports( String code,String fromDate,String toDate){

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
              
              }
            }

       FileManager.write("the Attendance between "+fromDate+" && "+toDate+":","Files\\Weekly Reports.txt",true);
       ArrayList<Object> Students= FileManager.read("Files\\Students.txt");
       for (Object i:Students){
           Student c=(Student) i;
           if(StAttId.contains(c.getId()))
           {
               int Counter = Collections.frequency(StAttId, c.getId());
               FileManager.write(c.getUserName()+"                     "+c.getId()+"                     "+Integer.toString(Counter),"Files\\Weekly Reports.txt",true);
               
           }
      }
    
}
    
    
}
