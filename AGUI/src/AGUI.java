/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import attendancemanagementsystemproj.*;
import static java.awt.SystemColor.text;
import static java.lang.Boolean.FALSE;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
/**
 *
 * @author Ahmed Abdelaty
 */
public class AGUI extends Application {
         Button update,logout;
                        Stage stage=new Stage();
                                BorderPane Layout1;
                                BorderPane Layout2;
                                BorderPane Layout3;
                                Scene scene2;
                                Scene scene3;
                                Scene scene;
                                Stage stage3;
GridPane grid;
    @Override
    public void start(Stage primaryStage) {
          primaryStage.setTitle("Login Form");
       

        
      grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(javafx.geometry.Insets.EMPTY);

Label email = new Label("Email:");
    email.setTextFill(Color.web("#fdf5e6"));

email.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
grid.add(email, 0, 1);

TextField emailBox = new TextField();
        
    emailBox.selectAll();

    
    /************************************************************************/
    
    
    
    
    
    
    
    
    /**********************************************************************/

grid.add(emailBox, 1, 1);


Label pw = new Label("Password:");
    pw.setTextFill(Color.web("#fdf5e6"));

pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
grid.add(pw, 0, 2);

PasswordField pwBox = new PasswordField();

grid.add(pwBox, 1, 2);


Button btn = new Button("Login");

btn.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);
grid.add(hbBtn, 1, 3);
        
/*****************************************************************/
btn.setOnAction((ActionEvent event) -> {
    String logemail = emailBox.getText();
    String logpass=pwBox.getText();
                  
                if(Login.login(logemail,logpass)<4017020&&Login.login(logemail,logpass)>0){
                  //is student
                          

primaryStage.hide();

        stage.setTitle("Student Panel");
             update=new Button("Update Profile");
              /**********************************************************************/
            
                Menu student = new Menu ("Attendance");
        student.getItems().add(new MenuItem("View attendace"));
       
student.setOnAction(e->{
    
    GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,550,380);
         Stage updateStage=new Stage();
         
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label courseCode = new Label("Course Code:");
courseCode.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(courseCode, 0, 1);

TextField codeTextField= new TextField();
grid2.add(codeTextField, 1, 1);



Label tname = new Label("Teacher Name:");
tname.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(tname, 0, 2);
TextField tnamefield = new TextField();
grid2.add(tnamefield, 1, 2);

Label date=new Label("Select Date :");
date.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(date,0,3);

Label from=new Label("From :");
from.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField fromfield=new TextField();
grid2.add(from,0,4);
grid2.add(fromfield,1,4);

Label to=new Label("To :");
to.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField tofield=new TextField();
grid2.add(to, 0, 5);
grid2.add(tofield,1,5);



 Button bview= new Button("View");
bview.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(bview);
grid2.add(bview, 1, 6); 
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();    
    
    
     /**********************************************************************/
     /*____________VIEW STUDENT ATTENDANCE_______________________*/
     /**********************************************************************/     
    bview.setOnAction(q->{
    
    GridPane attendance =new GridPane();
           
          Scene attendanceScene=new Scene(attendance,780,550);
         Stage attendanceStage=new Stage();
         attendanceStage.setTitle("Your Attendance :");
      
        Text t=new Text("Day \t\t\t\t  Month");
        t.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,15));
//        Text attendtext=new Text(x.View_My_Attendance(STYLESHEET_MODENA, STYLESHEET_MODENA, id));
               Text t2=new Text("'If there is a problem you can send a request to your teacher with your ID :'");
        t2.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,10));
     TextArea request=new TextArea();
     
     
     Label tcode=new Label("Teacher Code:");
tcode.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField tcodefield=new TextField();


Label courseid=new Label("Course Id:");
courseid.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField courseidfield=new TextField();
     request.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
        request. setPrefColumnCount(5);
	request. setPrefRowCount(10);
         
         Button send= new Button("Send");
        send.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
         HBox Btsend = new HBox(10);
         Btsend.setAlignment(Pos.BOTTOM_RIGHT);
          Btsend.getChildren().add(send);
  
          
       attendance.setPadding(javafx.geometry.Insets.EMPTY);
       attendance.setAlignment(Pos.TOP_CENTER);
       attendance.add(t,0, 0);
       attendance.add(t2,0, 29);
       attendance.add(request,0,30);
       attendance.add(courseid, 0, 31);
        attendance.add(courseidfield,0,32);
        attendance.add(tcode,0,33);
          attendance.add(tcodefield,0,34);
       attendance.add(send,0,35);
       attendance.setVgap(9);
       
         
        
         send.setOnAction(esend->{
         //x.Make_Request(request.getText());
     
         
         });
        
        
      attendanceStage.setScene(attendanceScene);
      attendanceStage.setScene(attendanceScene);
          attendanceStage.show();




    });


});
                /**********************************************************************/
        
        
                /**********************************************************************/
        MenuBar leftBar = new MenuBar();
        leftBar.getMenus().addAll(student);   
                MenuBar rightBar = new MenuBar();
                Menu options=new Menu("Options");
                MenuItem logout=new MenuItem("Log Out");
                options.getItems().add(logout);
        rightBar.getMenus().addAll(options);
        Region spacer = new Region();
        spacer.getStyleClass().add("menu-bar");
        HBox.setHgrow(spacer, Priority.SOMETIMES);
        HBox menubars = new HBox(leftBar, spacer, rightBar);
        
                 /**********************************************************************/

                  Layout1 = new BorderPane();
        

                    Layout1.setPadding(new Insets(10, 10, 10, 10));
                    Layout1.setAlignment(update, Pos.CENTER);
                    Layout1.setMargin(update, new Insets(12,12,12,12)); // optional
                    Layout1.setBottom(update);
 /**********************************************************************/
 /*__________________UPDATE PROFILE_____________________________*/
  /**********************************************************************/                   
                    update.setOnAction(e->{
                    
                    
                           GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Update Profile :");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label userName = new Label("Set Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 1);

TextField userTextField = new TextField();
grid2.add(userTextField, 1, 1);



Label newemail = new Label("Set Email :");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 2);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 2);


Label newpw = new Label("Set Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 3);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 3);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 4); 

b.setOnAction(be->{
    //x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();
                    
                    
                    
                    
                    
                    
                    
                    });
                    
                    
                    
                    
        Layout1.setTop(menubars);
         scene = new Scene (Layout1, 800,600);
        
        
        
        
                 /*********************************************************************/
                            
                            
                            
        BackgroundImage myBI= new BackgroundImage(new Image("back1.jpg"),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);   
            Layout1.setBackground(new Background(myBI));
                
                    /*********************************************************************/
ImageView imageView = new ImageView();
imageView.setImage(new Image("man.png"));     

  stage.setScene(scene);

        Layout1.setCenter(imageView);                                   
        stage.setScene(scene);
                
stage.show();
       logout.setOnAction(e->{
       stage.hide();
       });
       
   
                }
               else if(Login.login(logemail,logpass)>=4017020 && Login.login(logemail,logpass)<8888825){
                                     // is teacher
primaryStage.hide();
                                     
                         stage.setTitle("Teacher Panel");
             update=new Button("Update Profile");
              /**********************************************************************/
            
                Menu student = new Menu ("Student");
          
        
        
        
        
        
        
        
        
 /*************************************************************************/       
/*___________________________________Check Fees_____________________*/
/*************************************************************************/                
                MenuItem checkfees =new MenuItem("Check Fees");
                student.getItems().add(checkfees);
                checkfees.setOnAction(e->{
                
                  Label l1=new Label("check fees");
                Label l2=new Label(" s_name");
                Label l3=new Label("s_id");
                TextField f1=new TextField();
                TextField f2=new TextField();
                
               Button b1=new Button("ok");
               TextArea c=new TextArea();
               
               c.setPrefSize(100, 100);
                GridPane root1= new GridPane();
                root1.add(l1, 1, 0);
                root1.add(l2, 0, 1);
                root1.add(l3, 0, 2);
                root1.add(f1, 1, 1);
                root1.add(f2, 1, 2);
                root1.add(b1, 1, 3);
                root1.add(c, 1, 5);
                root1.setAlignment(Pos.CENTER);
                l1.setPrefSize(50, 50);
                b1.setPrefSize(50, 30);
            
                l1.setFont(Font.font(15));
                root1.setVgap(15);
                root1.setHgap(15);
                 //-----------------------------------------
           Scene scene3 = new Scene(root1, 500, 500);
        
        primaryStage.setTitle("");
        primaryStage.setScene(scene3);
        primaryStage.show();
                
                
                
                
                
                
                });
   /*************************************************************************/               
  /*_____________________ADD ATTENDANCE____________________________*/
  /*************************************************************************/        
        MenuItem markattendance=new MenuItem("Add Attedance");
        student.getItems().add(markattendance);
                markattendance.setOnAction(e->{
                  
                      Label l1=new Label("set attendance");
                Label l2=new Label("student name");
                Label l3=new Label("id");
                Label l4=new Label("date");
                Label l5=new Label("course");
                Label l6=new Label("techer name");
                Button b1=new Button("ok");
                GridPane root2=new GridPane();
                root2.add(l1, 1, 0);
                root2.add(l2, 0, 1);
                root2.add(l3, 0, 2);
                root2.add(l4, 0, 3);
                root2.add(l5, 0, 4);
                root2.add(l6, 0, 5);
                root2.add(b1, 1, 6);
                root2.setAlignment(Pos.CENTER);
                l1.setPrefSize(100, 100);
                l1.setFont(Font.font(18));
                l2.setPrefSize(100, 100);
                l3.setPrefSize(100, 100);
                l4.setPrefSize(100,100);
                l5.setPrefSize(100, 100);
                l6.setPrefSize(100, 100);
                b1.setPrefSize(50, 50);
                TextField f1=new TextField();
                 TextField f2=new TextField();
                  TextField f3=new TextField();
                   TextField f4=new TextField();
                    TextField f5=new TextField();
                     root2.add(f1, 1, 1);
                     root2.add(f2, 1, 2);
                     root2.add(f3, 1, 3);
                     root2.add(f4, 1, 4);
                     root2.add(f5, 1, 5);
                 
                 root2.setAlignment(Pos.CENTER);
                     
            
            
                               Scene scene2 = new Scene(root2, 500, 500);
        
                primaryStage.setScene(scene2);
        primaryStage.show();   
           
              
           });
 /*************************************************************************/                 
/*____________________DELETE STUDENT_____________________________*/
/*************************************************************************/                  
        
        MenuItem feesattendance=new MenuItem("Delete Student");
        student.getItems().add(feesattendance);
                feesattendance.setOnAction(e->{
                
                    
              Label l1=new Label("delete student");
                Label l2=new Label(" s_name");
                Label l3=new Label("s_id");
                TextField f1=new TextField();
                TextField f2=new TextField();
                
               Button b1=new Button("delete");
               
                GridPane root1= new GridPane();
                root1.add(l1, 1, 0);
                root1.add(l2, 0, 1);
                root1.add(l3, 0, 2);
                root1.add(f1, 1, 1);
                root1.add(f2, 1, 2);
                root1.add(b1, 1, 3);
                 root1.setAlignment(Pos.CENTER);
                l1.setPrefSize(50, 50);
                b1.setPrefSize(50, 30);
            
                l1.setFont(Font.font(15));
                root1.setVgap(15);
                root1.setHgap(15);
                
                
                   
                     
                
                BorderPane root=new BorderPane();
             
                root.setCenter(root1);
               
                Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("delete student");
        primaryStage.setScene(scene);
        primaryStage.show();
                
                             Scene scene2 = new Scene(root1, 500, 500);
        
        primaryStage.setTitle("show courses");
        primaryStage.setScene(scene2);
        primaryStage.show();
                
                });

   

    /**********************************************************************/
    /*_______________VIEW COURSE__________________________________*/
   /**********************************************************************/            
                Menu course = new Menu ("Course");
                MenuItem viewcourse=new MenuItem("View Course");
        course.getItems().add(viewcourse);
        
        viewcourse.setOnAction(e->{
        
         Button b55=new Button("show courses");
                Scene scene3 = new Scene(b55, 500, 500);
        
        primaryStage.setTitle("show courses");
        primaryStage.setScene(scene3);
        primaryStage.show();
                
        
        
        
        
        
        });
     /**********************************************************************/    
   /*_____________________LESS ATTENDANCE_________________________*/
  /**********************************************************************/     
              MenuItem viewattendance=new MenuItem("View Less Attendance");
        student.getItems().add(viewattendance);
        viewattendance.setOnAction(e->{
        
        GridPane attendance =new GridPane();
           
          Scene attendanceScene=new Scene(attendance,780,550);
         Stage attendanceStage=new Stage();
         attendanceStage.setTitle("Less Attendance :");
      
        Text t=new Text("The Less Attedance");
        t.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,15));
//      but here the function which will view the less attendance
               Text t2=new Text();
        t2.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,10));
     TextArea request=new TextArea();
    

       
       attendance.setPadding(javafx.geometry.Insets.EMPTY);
       attendance.setAlignment(Pos.TOP_CENTER);
       attendance.add(t,0, 0);
    
     
      attendanceStage.setScene(attendanceScene);
      attendanceStage.setScene(attendanceScene);
          attendanceStage.show();




    });
            
            
            
            
        
        
        
        
        
     /**********************************************************************/
     /*__________________HANDOVER COURSE__________________________*/
     /**********************************************************************/    
      
        
        MenuItem handover=new MenuItem("Handover Course");
        course.getItems().add(handover);
        handover.setOnAction(e->{
        
        
                         Label l1=new Label("handover");
                Label l2=new Label("old teacher");
                Label l3=new Label("new teacher");
                TextField f1=new TextField();
                TextField f2=new TextField();
                
               Button b1=new Button("ok");
                
               
               
               
                 GridPane root1= new GridPane();
                root1.add(l1, 1, 0);
                root1.add(l2, 0, 1);
                root1.add(l3, 0, 2);
                root1.add(f1, 1, 1);
                root1.add(f2, 1, 2);
                root1.add(b1, 1, 3);
                 root1.setAlignment(Pos.CENTER);
                l1.setPrefSize(50, 50);
                b1.setPrefSize(50, 30);
            
                l1.setFont(Font.font(15));
                root1.setVgap(15);
                root1.setHgap(15);
               
                     
                
                BorderPane root=new BorderPane();
              
                root.setCenter(root1);
               
      
                Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("handover");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
                 Scene scene2 = new Scene(root1, 500, 500);
        
        primaryStage.setTitle("show courses");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        });
        
                /**********************************************************************/
        MenuBar leftBar = new MenuBar();
        leftBar.getMenus().addAll(student,course);   
                MenuBar rightBar = new MenuBar();
                Menu options=new Menu("Options");
                options.getItems().add(new MenuItem("Log Out"));
        rightBar.getMenus().addAll(options);
        Region spacer = new Region();
        spacer.getStyleClass().add("menu-bar");
        HBox.setHgrow(spacer, Priority.SOMETIMES);
        HBox menubars = new HBox(leftBar, spacer, rightBar);
        
                 /**********************************************************************/
        Layout3 = new BorderPane();

                    Layout3.setPadding(new Insets(10, 10, 10, 10));
                    Layout3.setAlignment(update, Pos.CENTER);
                    Layout3.setMargin(update, new Insets(12,12,12,12)); // optional
                    Layout3.setBottom(update);


        Layout3.setTop(menubars);
         scene3 = new Scene (Layout3, 800,600);
        
        
        
        
                 /*********************************************************************/
                            
                            
                            
        BackgroundImage myBI= new BackgroundImage(new Image("back1.jpg"),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);   
            Layout3.setBackground(new Background(myBI));
                
                    /*********************************************************************/
ImageView imageView = new ImageView();
imageView.setImage(new Image("mann.png"));     



//update teacher profile
  update.setOnAction(e->{
                    
                    
           GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Update Profile :");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label userName = new Label("Set Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 1);

TextField userTextField = new TextField();
grid2.add(userTextField, 1, 1);



Label newemail = new Label("Set Email :");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 2);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 2);


Label newpw = new Label("Set Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 3);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 3);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 4); 

b.setOnAction(be->{
    //x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();
  });















        Layout3.setCenter(imageView);                                   
        stage.setScene(scene3);
        stage.show();
         logout.setOnAction(e->{
       stage.hide();
       });
}
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
               
        else if (Login.login(logemail,logpass)>=8888824){
                  
                   // is admin
primaryStage.hide();
                                  
             
     stage.setTitle("Admin Panel");
             update=new Button("Update Profile");
              /**********************************************************************/
            /**************VIEW PROFILE ******************************************/
                Menu student = new Menu ("Student");
                MenuItem viewprofile=new MenuItem("View Profile");
                viewprofile.setOnAction(e->{
                 GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,550,380);
         Stage updateStage=new Stage();
            
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label courseCode = new Label("Profile ID:");
courseCode.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(courseCode, 0, 1);

TextField codeTextField= new TextField();
grid2.add(codeTextField, 1, 1);

 Button bview= new Button("View");
bview.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(bview);
grid2.add(bview, 1, 2); 
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();    
    
         bview.setOnAction(w->{
         
          GridPane attendance =new GridPane();
           
          Scene attendanceScene=new Scene(attendance,780,550);
         Stage attendanceStage=new Stage();
         attendanceStage.setTitle("Profile ID:");
      //print imformation about the profile
        Text t=new Text("");
        t.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,15));
//      but here the function which will view the less attendance
               Text t2=new Text();
        t2.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,10));
     TextArea request=new TextArea();
    

       
       attendance.setPadding(javafx.geometry.Insets.EMPTY);
       attendance.setAlignment(Pos.TOP_CENTER);
       attendance.add(t,0, 0);
    
     
      attendanceStage.setScene(attendanceScene);
      attendanceStage.setScene(attendanceScene);
          attendanceStage.show();
         
         });      
         
         
         
         
                
                
                
                
                
                });
                
                
        student.getItems().add(viewprofile);
        MenuItem editprofile=new MenuItem("Edit Profile");
        student.getItems().add(editprofile);
       
        
        
  /****************************GENERATE REPORT*********************/      
        MenuItem report=new MenuItem("Generate Attendance Report");
        student.getItems().add(report);
        report.setOnAction(e->{
        
          GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,550,380);
         Stage updateStage=new Stage();
         
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);

Label date=new Label("Select Date :");
date.setFont(Font.font("Tahoma", FontWeight.EXTRA_LIGHT,16));
grid2.add(date,1,0);

Label select=new Label("Select Course :");
select.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField selectfield=new TextField();
grid2.add(select,0,1);
grid2.add(selectfield,1,1);

Label from=new Label("From :");
from.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField fromfield=new TextField();
grid2.add(from,0,2);
grid2.add(fromfield,1,2);

Label to=new Label("To :");
to.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
TextField tofield=new TextField();
grid2.add(to, 0, 3);
grid2.add(tofield,1,3);



 Button bprint= new Button("print");
bprint.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(bprint);
grid2.add(bprint, 1, 4); 
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();    
    
    bprint.setOnAction(p->{
    //call generate method here
    });
    
        
        
        
        });
        
        
        
        
        
        
        
        
                /*****************T VIEW PROFILE***************************************/
        
                Menu teacher = new Menu ("Teacher");
                MenuItem viewprofie=new MenuItem("View Profile");
        teacher.getItems().add(viewprofile);
        viewprofile.setOnAction(v->{
             GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,550,380);
         Stage updateStage=new Stage();
            
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label courseCode = new Label("Profile ID:");
courseCode.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(courseCode, 0, 1);

TextField codeTextField= new TextField();
grid2.add(codeTextField, 1, 1);

 Button bview= new Button("View");
bview.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(bview);
grid2.add(bview, 1, 2); 
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();    
    
         bview.setOnAction(w->{
         
          GridPane attendance =new GridPane();
           
          Scene attendanceScene=new Scene(attendance,780,550);
         Stage attendanceStage=new Stage();
         attendanceStage.setTitle("Profile ID:");
      //print imformation about the profile
        Text t=new Text("");
        t.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,15));
//      but here the function which will view the less attendance
               Text t2=new Text();
        t2.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,10));
     TextArea request=new TextArea();
    

       
       attendance.setPadding(javafx.geometry.Insets.EMPTY);
       attendance.setAlignment(Pos.TOP_CENTER);
       attendance.add(t,0, 0);
    
     
      attendanceStage.setScene(attendanceScene);
      attendanceStage.setScene(attendanceScene);
          attendanceStage.show();
         
         });      
         
         
         
         
                
        
        });
        
        /******************EDIT PROFILE*******************/
        /*************************************************/
        MenuItem teditprofile=new MenuItem("Edit Profile");
        teacher.getItems().add(teditprofile);
         teditprofile.setOnAction(e->{
               GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Update Profile :");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);


Label userid = new Label("Target ID:");
userid.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userid, 0, 1);
TextField useridTextField = new TextField();
grid2.add(useridTextField, 1, 1);

Label userName = new Label("Edit Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 2);

TextField userTextField = new TextField();
grid2.add(userTextField, 1, 2);



Label newemail = new Label("Edit Email :");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 3);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 3);


Label newpw = new Label("Edit Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 4);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 4);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 5); 


//call function to update admin profile
b.setOnAction(be->{
    //x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show(); 
         });
         
         /**********************ALLOT SUBJECT*********************/
         /**********************************************************/
       MenuItem allot=new MenuItem("Allot Subject");
        teacher.getItems().add(allot);
        allot.setOnAction(e->{
            
          GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Allot Subject:");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label userName = new Label("Course Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 1);
TextField userTextField = new TextField();
grid2.add(userTextField, 1, 1);



Label newemail = new Label("Course Code:");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 2);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 2);


Label newpw = new Label("Teacher ID:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 3);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 3);

 Button ballot= new Button("Allot");
ballot.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(ballot);
grid2.add(ballot, 1, 4); 

ballot.setOnAction(be->{
   //call Allot Subject Here
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();
        
        
        
        
        });
        
                /**********************************************************************/
        MenuBar leftBar = new MenuBar();
        leftBar.getMenus().addAll(student,teacher);   
                MenuBar rightBar = new MenuBar();
                Menu options=new Menu("Options");
                options.getItems().add(new MenuItem("Log Out"));
        rightBar.getMenus().addAll(options);
        Region spacer = new Region();
        spacer.getStyleClass().add("menu-bar");
        HBox.setHgrow(spacer, Priority.SOMETIMES);
        HBox menubars = new HBox(leftBar, spacer, rightBar);
        
      
         Layout2 = new BorderPane();

                    Layout2.setPadding(new Insets(10, 10, 10, 10));
                    Layout2.setAlignment(update, Pos.CENTER);
                    Layout2.setMargin(update, new Insets(12,12,12,12)); // optional
                    
                    Layout2.setBottom(update);


        Layout2.setTop(menubars);
         scene2 = new Scene (Layout2, 800,600);
        
        
        
        
                            /*********************************************************************/
                            
                            
                            
        BackgroundImage myBI= new BackgroundImage(new Image("back1.jpg"),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);   
            Layout2.setBackground(new Background(myBI));
            
                                        /*********************************************************************/
ImageView imageView = new ImageView();
imageView.setImage(new Image("rsz_man.png"));     

editprofile.setOnAction(e->{

                          GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Update Profile :");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);


Label userid = new Label("Target ID:");
userid.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userid, 0, 1);
TextField useridTextField = new TextField();
grid2.add(useridTextField, 1, 1);

Label userName = new Label("Edit Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 2);

TextField userTextField = new TextField();
grid2.add(userTextField, 1, 2);



Label newemail = new Label("Edit Email :");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 3);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 3);


Label newpw = new Label("Edit Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 4);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 4);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 5); 


//call function to update admin profile
b.setOnAction(be->{
    //x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();









});




 /**********************************************************************/
/*_________________________UPDATE PROFILE______________________*/
/**********************************************************************/
  update.setOnAction(e->{
                    
                    
                           GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,780,550);
         Stage updateStage=new Stage();
         updateStage.setTitle("Update Profile :");
         
grid2.setAlignment(Pos.CENTER);
grid2.setHgap(10);
grid2.setVgap(10);
grid2.setPadding(javafx.geometry.Insets.EMPTY);
Label userName = new Label("Edit Name:");
userName.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(userName, 0, 1);

TextField userTextField = new TextField();
grid2.add(userTextField, 1, 1);



Label newemail = new Label("Edit Email :");
newemail.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newemail, 0, 2);
TextField newemailBox = new TextField();
grid2.add(newemailBox, 1, 2);


Label newpw = new Label("Edit Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(newpw, 0, 3);

PasswordField newpwBox = new PasswordField();
grid2.add(newpwBox, 1, 3);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 4); 


//call function to update admin profile
b.setOnAction(be->{
    //x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();
                    
  });


        Layout2.setCenter(imageView);                                   
        stage.setScene(scene2);
        stage.show();
         logout.setOnAction(e->{
       stage.hide();
       });
                               }
        
                             
});


/******************************************************************/

        BackgroundImage myBI= new BackgroundImage(new Image("bluee.jpg"),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);   
            grid.setBackground(new Background(myBI));

        
      Scene scene = new Scene(grid, 600,400);
        primaryStage.setScene(scene);
            primaryStage.setResizable(false);

        primaryStage.show();
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      
    }
    
}
