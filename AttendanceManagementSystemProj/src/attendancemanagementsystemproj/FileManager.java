/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileManager {
    
    static boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writter = null;
        try {
           // System.out.print("\nwritting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);

           // System.out.println(" ... Done ! ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }
    static public ArrayList<Object> read (String path)
    {  
        Scanner reader = null;
        try
        {
            reader=new Scanner(new File(path));
            String line;
            String[] separated;
  //------------------------------------------------------------------------------------------------------------Students
            if(path.equals("Files\\Students.txt")){
               
            ArrayList<Student> Students = new ArrayList<Student>();
            Student student;

            while (reader.hasNextLine()) {

                student = new Student();
                String Line = reader.nextLine();
                separated = Line.split("#");

              //2017001#10
                student.setId(Integer.parseInt(separated[0])); 
                student.setTotalAttendance(Integer.parseInt(separated[1])); 
              //student.setUserName(separated[2]);
        //_____________________________________________________________________________User
                 ArrayList<Object> user= FileManager.read("Files\\User.txt");
                for (Object s:user){
                 User u=(User) s;
                 if (u.getId()==student.getId()){
                     
                     student.setEmail(u.getEmail());
                     student.setUserName(u.getUserName());
                     student.setPassword(u.getPassword());
                    }
                }
       /* //________________________________________________
                int i=3;
                while (i<separated.length){
                    Course c =new Course(); 
                    c.setCode(separated[i]);
                    
                    student.course.add(c);
                    i++;
                }  */
        //_____________________________________________________________________________Courses
                ArrayList<Object> course= FileManager.read("Files\\Courses.txt");
                for (Object co:course){
                MainCourse cou=(MainCourse) co;
                // int l=0;
                // while(cou.corseStudent.contains(student.getId()))
                // {
                    if(cou.courseStudent.contains(student.getId())){
                      
                        student.course.add(cou);
                    }
                     /*if(student.course.get(l).getCode().equals(cou.getCode())){
                     
                         student.course.get(l).setName(cou.getName());
                         student.course.get(l).setSection(cou.getSection());*/
                   //  }
                   //  l++;
               //  }
                   
                }
                
                Students.add(student);
            }

            return (ArrayList<Object>) (Object) Students;
            
//------------------------------------------------------------------------------------------------------------Teachers

        } else if (path.equals("Files\\Teachers.txt")) {

            ArrayList<Teacher> teachers = new ArrayList<Teacher>();
            Teacher teacher;

            while (reader.hasNext()) {

                teacher = new Teacher();
                String Line = reader.nextLine();
                separated = Line.split("#");

              //4017021
                teacher.setId(Integer.parseInt(separated[0]));
             //teacher.setUserName(separated[1]);
        //_____________________________________________________________________________User
                 ArrayList<Object> user= FileManager.read("Files\\User.txt");
                for (Object s:user){
                 User u=(User) s;
                 if (u.getId()==teacher.getId()){
                     teacher.setEmail(u.getEmail());
                     teacher.setUserName(u.getUserName());
                     teacher.setPassword(u.getPassword());
                    }
                }
       /* //________________________________________________
                int i=3;
                while (i<separated.length){
                    Course c =new Course(); 
                    c.setCode(separated[i]);
                    
                    student.course.add(c);
                    i++;
                }  */
        //_____________________________________________________________________________Courses
                ArrayList<Object> course= FileManager.read("Files\\Courses.txt");
                for (Object co:course){
                MainCourse cou=(MainCourse) co;
                // int l=0;
                // while(cou.corseStudent.contains(student.getId()))
                // {
                    if(cou.courseTeacher.contains(teacher.getId())){
                         
                       teacher.course.add(cou);
                    }
                     /*if(student.course.get(l).getCode().equals(cou.getCode())){
                     
                         student.course.get(l).setName(cou.getName());
                         student.course.get(l).setSection(cou.getSection());*/
                   //  }
                   //  l++;
               //  }
                   
                }
                

                teachers.add(teacher);
            }

            return (ArrayList<Object>) (Object) teachers;
            
//------------------------------------------------------------------------------------------------------------Courses

        } else if (path.equals("Files\\Courses.txt")) {

            ArrayList<MainCourse> Courses = new ArrayList<MainCourse>();
            MainCourse course;

            while (reader.hasNext()) {

                course = new MainCourse();
                String Line = reader.nextLine();
                separated = Line.split("#");

                //CS215#Computer Science#true#4017021#2017001&2017005&2017009&2017013&2017017&2017004&2017008&2017012&2017016&2017020
                course.setCode(separated[0]);
                course.setName(separated[1]);
                course.setSection(Boolean.parseBoolean(separated[2]));
                
                String[] sep2 =separated[3].split("&");
                try{
                        int[]Teachid= Arrays.stream(sep2).mapToInt(Integer::parseInt).toArray();
                        Integer[] TCourse= Arrays.stream( Teachid ).boxed().toArray( Integer[]::new );
                        List<Integer> TeachInCource =Arrays.asList(TCourse);
                        course.setCourseTeacher(TeachInCource);
                        
                        sep2 =separated[4].split("&");
                        int[]stid= Arrays.stream(sep2).mapToInt(Integer::parseInt).toArray();
                        Integer[] SCourse= Arrays.stream( stid ).boxed().toArray( Integer[]::new );
                        List<Integer> StuInCource =Arrays.asList(SCourse);
                        course.setCourseStudent(StuInCource);
                     }catch(NumberFormatException e){
                        System.out.println("Error FileManeger course"+e);
                     }


                Courses.add(course);
            }
            return (ArrayList<Object>) (Object) Courses;

//------------------------------------------------------------------------------------------------------------User

            }else if (path.equals("Files\\User.txt")) {

            ArrayList<User> Users = new ArrayList<User>();
            User user;

            while (reader.hasNext()) {

                user = new User();
                String Line = reader.nextLine();
                separated = Line.split("#");

                //2017001#AHMED ALI@GMAIL.com#AHMED ALI#asde1452
                user.setId(Integer.parseInt(separated[0]));
                user.setEmail(separated[1]);
                user.setUserName(separated[2]);
                user.setPassword(separated[3]);
                Users.add(user);
            }
            return (ArrayList<Object>) (Object) Users;
            }  
  
//------------------------------------------------------------------------------------------------------------Attendance

            else if (path.equals("Files\\Attendance.txt")) {

            ArrayList<Attendance> Attendances = new ArrayList<Attendance>();
            Attendance attendance;

            while (reader.hasNext()) {

                attendance = new Attendance();
                String Line = reader.nextLine();
                separated = Line.split("#");

                //CS215#1/2/2017#4017021#2017001&2017005&2017009&2017017&2017004&2017008&2017012&2017016&2017020
                
                attendance.setCoursecode(separated[0]);
                String[] sep2=separated[1].split("/");
                
                if(sep2.length>2){
                    attendance.date.setDay(Integer.parseInt(sep2[0]));
                    attendance.date.setMonteh(Integer.parseInt(sep2[1]));
                    attendance.date.setYear(Integer.parseInt(sep2[2]));
                }else{
                    attendance.date.setMonteh(Integer.parseInt(sep2[0]));
                }
                
                attendance.setTeachrId(Integer.parseInt(separated[2]));
                
                sep2 =separated[3].split("&");
                int[]stid= Arrays.stream(sep2).mapToInt(Integer::parseInt).toArray();
                Integer[] StudID= Arrays.stream( stid ).boxed().toArray( Integer[]::new );
                List<Integer> IDAtt =Arrays.asList(StudID);
                attendance.setStudentID(IDAtt);
                Attendances.add(attendance);
            }
            return (ArrayList<Object>) (Object) Attendances;
            }
            
//------------------------------------------------------------------------------------------------------------Fees         
            
            else if (path.equals("Files\\Fees.txt")) {

            ArrayList<Fees> Feees = new ArrayList<Fees>();
            Fees fees;

            while (reader.hasNext()) {

                fees = new Fees();
                String Line = reader.nextLine();
                separated = Line.split("#");

                //CS215#2017001&2017005&2017009&2017013&2017017&2017004&2017008&2017012&2017016&2017020
                
                fees.setCoursecode(separated[0]);
              
                separated =separated[1].split("&");
                int[]stid= Arrays.stream(separated).mapToInt(Integer::parseInt).toArray();
                Integer[] StudID= Arrays.stream( stid ).boxed().toArray( Integer[]::new );
                List<Integer> IDAtt =Arrays.asList(StudID);
                fees.setStudentID(IDAtt);
                Feees.add(fees);
            }
            return (ArrayList<Object>) (Object) Feees;
            }
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException in FileManeger read method");
        }finally{reader.close();}

            return null;
      
       
    } 
}
