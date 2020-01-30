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
public class Login {
    public static String ToCapital(String string){
         int Ascii;
         String capital="";
         int c=0;
         do{  Ascii =string.charAt(c);
              char cc =string.charAt(c);
              if((int)Ascii>=97 && (int)Ascii<=122 ){
                  int Cap=(int)Ascii-32;
                   cc=(char)Cap;
              }
              capital+=cc;
              c++;
         }while(c<string.length());
         return capital;
    }
     public static int login (String email,String Pass){
                 
           String Email=ToCapital(email);
           ArrayList<String> en=new ArrayList<>();
             int b=0;      
           ArrayList<Object> user=  FileManager.read("Files\\User.txt");
           for (Object i:user){
              User u=(User) i;
             // System.out.print(u.getEmail()+" ");
              if(u.getEmail().equals(Email)&&u.getPassword().equals(Pass)){
                  b=1;
                if(u.getId()<4017020){
                  
                   return u.getId();
                   /*en.add("Files\\Students.txt");
                   break;*/
                }
               else if(u.getId()>=4017020 && u.getId()<8888825){
                   
                   return u.getId();
                  /* en.add(Integer.toString(u.getId()));
                   en.add("Files\\Teachers.txt");
                   break;*/
               }else if (u.getId()>=8888824){
                  
                   return u.getId();
                 /* en.add(Integer.toString(u.getId()));
                  en.add("Files\\Teachers.txt");
                  break;*/
              } 
              
             
           }
           
       }
      // System.out.print(b);
        return 0;
     }
    
}
