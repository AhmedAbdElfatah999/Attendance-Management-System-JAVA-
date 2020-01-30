/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagementsystemproj;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileSearch {
    
    public static void ChangeInString(String ST,String newValue,int wantinside, int wantinside2,int posInFile) //id is the statc valu from loge in
    {     
            String Separator[]=ST.split("#");
     
            int flag=0;
            int i=0;int j=wantinside+1;
            String front=""; String End="";
            if(wantinside>=0)
              {
                   while(i<wantinside || j<Separator.length)
                      {
                       if(i<wantinside &&  wantinside>=0)
                         {
                            front+=Separator[i]+"#";
                            i++;
                         }
                      if(j<Separator.length && wantinside>=0)
                         {
                            End+="#"+Separator[j];
                            j++;
                         }
                      }
                    Separator=Separator[wantinside].split("&");
                    flag=1;
          
              }
          if(wantinside2>=0)
             {
                i=0; j=Separator.length-1;
                while(i<wantinside2 || j>wantinside2)
                    {
                      if(i<wantinside2 && wantinside2>=0)
                         {
                           front+=Separator[i]+"&";
                           i++;
                         }
                      if(j>wantinside2 && wantinside2>=0)
                         {
                           End="&"+Separator[j]+End;
                           j--;
                         }
                     }
                Separator=Separator[wantinside2].split("@");
               flag=2;
             }
         
         Separator[posInFile]=newValue;
         i=1;
         if (flag==0)
         {
              for(String se:Separator)
         {   if(i==Separator.length)
                 front+=se;
             else
                 front+=se+"#";
             i++;
         
         }
         }
         if (flag==1)
         {
              for(String se:Separator)
         {   if(i==Separator.length)
                 front+=se;
             else
                 front+=se+"&";
             i++;
         
         }
         }
         if (flag==2)
         {
              for(String se:Separator)
         {   if(i==Separator.length)
                 front+=se;
             else
                 front+=se+"@";
             i++;
         
         }
         }
        
        front+=End;
        System.out.println(front);
            
       
        
       
     
     }
    
public static String readFromString(String ST,int wantinside, int wantinside2,int posInFile) //id is the statc valu from loge in
    {     
            String Separator[]=ST.split("#");
            if(wantinside>=0)
              {
                    Separator=Separator[wantinside].split("&");
          
              }
          if(wantinside2>=0)
             {
                Separator=Separator[wantinside2].split("@");
             }
         
       return Separator[posInFile];
        
     }

 public static void ReadFromCource(String ST )//just for cources

    {  Scanner read =null;
    read=new Scanner("Files\\Courses.txt");
    String[] Separated;
    while(read.hasNextLine())
    {
        Separated=read.nextLine().split("#");
        if(Separated[0]==ST) 
            System.out.print(Separated[0]);
            
    }
    System.out.print(ST);
    // return null;
    }
}
