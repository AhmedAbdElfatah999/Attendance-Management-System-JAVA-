/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     /* Scanner read =new Scanner(new File("D:/lectures/pl2/Project/Test/Files/Test.txt"));
     
      PrintWriter pr = new PrintWriter(new FileOutputStream("D:/lectures/pl2/Project/Test/Files/Test.txt"));
      
      pr.println("  true  #2");
      pr.close();*/
      PrintWriter pr = new PrintWriter(new FileOutputStream("D:/lectures/pl2/Project/Test/Files/temp.txt"));
      StringBuffer[] a=new StringBuffer[2];
      a[0]=new StringBuffer();
      a[1]=new StringBuffer();
      a[0].append("AhmedAli");
      a[1].append("0145fg");
      StringBuffer bf=new StringBuffer();
      bf.append("asdf#bnfhjfj#zm");
      String line ="1#2017001#Ahmed Ali#CS215&0&Z@X@C&0&1&true#OR1717&0&0&0@0&1&true";
      String Separator[]=line.split("#");
      List <Integer> Ar=new  ArrayList <Integer>();
     Ar.add(555);
    
      int want=4;
      int wantInsid=-1;
      int i=0;int j=want+1;
      String front=""; String End="";
      if(want>=0)
      {
          while(i<want || j<Separator.length)
          {
              if(i<want &&  want>=0)
              {
                  front+=Separator[i]+"#";
                  i++;
              }
              if(j<Separator.length && want>=0)
              {
                  End+="#"+Separator[j];
                  j++;
              }
          }
          Separator=Separator[want].split("&");
          
      }
       if(wantInsid>=0)
      {
         i=0; j=Separator.length-1;
          while(i<wantInsid || j>wantInsid)
          {
              if(i<wantInsid && wantInsid>=0)
              {
                  front+=Separator[i]+"&";
                  i++;
              }
              if(j>wantInsid && wantInsid>=0)
              {
                  End="&"+Separator[j]+End;
                  j--;
              }
          }
          Separator=Separator[wantInsid].split("@");
          
      }
     Separator[0]="Yaa";
     i=1;
    for(String se:Separator)
    {   if(i==Separator.length)
            front+=se;
         
        else
           front+=se+"@";
       i++;
         
    }
        front+=End;
     // System.out.println(front);
      ClassTest CT=new ClassTest();
       Course C=new Course();
       C.setP(5);
     // System.out.println(C.getP());
      String[] Sa={"555","8"};
      int []array= Arrays.stream(Sa).mapToInt(Integer::parseInt).toArray();
       Integer[] what = Arrays.stream( array ).boxed().toArray( Integer[]::new );
  
            // getting the list view of Array 
        
      List<Integer> arraylist = Arrays.asList(what); 
      
            //  System.out.println(arraylist);
         String test = "te@st";
         int intst=(int)test.charAt(0);
         char b=(char)intst;
         String E;
         int c=0;
         String capital="";
         do{  intst =test.charAt(c);
              char cc =test.charAt(c);
              if((int)intst>90){
                  int Cap=(int)intst-32;
                   cc=(char)Cap;
              }
              capital+=cc;
              c++;
         }while(c<test.length());
       // System.out.println(capital);
        
       
       
       
       
       
       
      
        
       File f=new File("D:\\lectures\\pl2\\Project\\AttendanceManagementSystemProj\\Files\\User.txt");
           if (f.exists())System.out.println("1");
       
       if (f.delete()) System.out.println("1");
       else  System.out.println("0");
     
       
           

  
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       String s5="ter";
       String [] s7=s5.split("#");
      // System.out.println(s7.length);
    
      /*bf.replace(5, 12, "8");
      bf.getChars(0, 0, chars, 0);
       System.out.println("Buffer"+bf);
   
      String s1="AhmedAli  #0145fgv";
      String[] s2=s1.split("#");
    
          if(s2[0].equals("AhmedAli")&&s2[1].equals("0145fgv"))
          {
              System.out.println("If");
          }
          else 
          {
              System.out.println("Else");
          }
      
     System.out.println(s2[0]);
      /*int[] a1=new int[2];
      a1[0]=5;
      a1[1]=5;
      pr.print(a1);
      System.out.println(a1);
      pr.close();
      int[] a2=new int[2];
      int a=bf1.read();
      System.out.print(bf1.read());
      /*ClassTest[] arr=new ClassTest[2];
      arr[0]=new ClassTest();
      arr[1]=new ClassTest();
      int[] se={1,2,3,4,5};
      String[] S={"A","B"};
      List<String> AL=new ArrayList<>();
       
      AL.add("Hallo");
      AL.add("Itsme");
      AL.add("Hallo");
      AL.add("jbbsdb");
      arr[0].setA(se);
      arr[0].setS(S);
      pr.print(AL);
      pr.close();
      System.out.print(AL.get(0));
     /* pr.print(Arrays.toString(arr[0].getA())+"#");
      pr.print(Arrays.toString(arr[0].getS()));
      pr.close();
      String [] St =read.nextLine().split("#");
      String Sa="[1,2,3,4]";
      String Sa2="2";
      String B ="Ahmed&mohamed&Ali";
      String [] Ba=B.split("&");
              System.out.print(Ba[0]);
       /* int  si=Integer.parseInt(Sa);
        int[]  si1=new int[7];
      
     /*  // System.out.print();
      
      
     // int[] arr2 = Integer.parseInt(St[0]);
     //arr[1].setA();
     // System.out.print(St[1]);
*/
    }
    
}
