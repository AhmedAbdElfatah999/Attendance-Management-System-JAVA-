/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author smart
 */
public class Student_form extends Application {
    Student x=new Student();
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
        primaryStage.setTitle("Student Form");
       

        
     GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(javafx.geometry.Insets.EMPTY);
Text scenetitle = new Text("Welcome");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 90));
grid.add(scenetitle, 0, 0, 2, 1);

Label id = new Label("ID :");
id.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid.add(id, 0, 1);

TextField IdBox = new TextField();
grid.add(IdBox, 1, 1);


Label pw = new Label("Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid.add(pw, 0, 2);

PasswordField pwBox = new PasswordField();
grid.add(pwBox, 1, 2);


Button btn = new Button("Login");
btn.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);
grid.add(hbBtn, 1, 3);

//read from the GUI







        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             x.setId(parseInt(IdBox.getText()));//casting the text to integer
           x.setPassword(pwBox.getText());
         
         //view attendance form and then update profile
                
         
         
         
 Menu attend = new Menu("View Attendance");
   MenuItem attendview = new MenuItem("Select Course");
      attend.getItems().add(attendview);
      
     attendview.setOnAction(e -> {
    
       GridPane grid2 = new GridPane();
          Scene updateScene=new Scene(grid2,280,280);
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
 Button bview= new Button("View");
bview.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(bview);
grid2.add(bview, 1, 3); 

bview.setOnAction(be->{
//    x.View_My_Attendance(codeTextField.getText(),tnamefield.getText(),x.getId());
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

     request.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
        request. setPrefColumnCount(5);
	request. setPrefRowCount(10);
         
         Button send= new Button("Send");
        send.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
         HBox Btsend = new HBox(10);
         Btsend.setAlignment(Pos.BOTTOM_RIGHT);
          Btsend.getChildren().add(send);
  //t,note,request,send);
          
       attendance.setPadding(javafx.geometry.Insets.EMPTY);
       attendance.setAlignment(Pos.TOP_CENTER);
       attendance.add(t,0, 0);
       attendance.add(t2,0, 29);
       attendance.add(request,0,30);
       attendance.add(send,0,31);
       attendance.setVgap(9);
       
         
        
         send.setOnAction(esend->{
         x.Make_Request(request.getText());
     
         
         });
        
        
        
        
      attendanceStage.setScene(attendanceScene);
      attendanceStage.setScene(attendanceScene);
          attendanceStage.show();
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();

       
       
       });
       




           
     
     

        //Edit menu
        Menu update = new Menu("Update Proflie");
       MenuItem updateview=new MenuItem("Updae");
       update.getItems().add(updateview);
       updateview.setOnAction(e->{
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



Label email = new Label("Set Email :");
email.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(email, 0, 2);
TextField emailBox = new TextField();
grid2.add(emailBox, 1, 2);


Label pw = new Label("Set Password:");
pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid2.add(pw, 0, 3);

PasswordField pwBox = new PasswordField();
grid2.add(pwBox, 1, 3);

 Button b= new Button("Save Changes");
b.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hb = new HBox(10);
hb.setAlignment(Pos.BOTTOM_CENTER);
hb.getChildren().add(b);
grid2.add(b, 1, 4); 

b.setOnAction(be->{
    x.UpdateMyProfile(userTextField.getText(),emailBox.getText(),pwBox.getText());
});
updateStage.setScene(updateScene);
      updateStage.setScene(updateScene);
         updateStage.show();

       
       
       });
       
       
    

       

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(attend, update);
        
        GridPane viewstudent=new GridPane();
          viewstudent.setPadding(javafx.geometry.Insets.EMPTY);
        viewstudent.setAlignment(Pos.CENTER); 
//nodes are placed in center of GridPane
        viewstudent.setHgap(6);
        viewstudent.setVgap(5);
       
       Image img=new Image("unknown.png"); 
       ImageView imgview=new ImageView(img);
       viewstudent.add(imgview,0,0);
        
      Text viewname=new Text("Name :"+x.getUserName());
        viewname.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,13));
        viewstudent.add(viewname,0, 0);
        
          Text viewemail=new Text("Email :"+x.getEmail());
        viewemail.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,13));
        viewstudent.add(viewemail,0,2);
        
        Text viewid=new Text("ID :"+x.getId());
           viewid.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,13));
        viewstudent.add(viewid,0, 3);
        
       Text viewcourse=new Text("Courses:"+x.getCourse());
           viewcourse.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,13));
        viewstudent.add(viewcourse,0, 4);
        
        

    BorderPane layout = new BorderPane();
       layout.setTop(menuBar);
       layout.setCenter(viewstudent);
       
        Scene scene = new Scene(layout, 400, 300);
       primaryStage.setScene(scene);
      primaryStage.show();



  
        
        
       
   
            }
        });





Scene scene = new Scene(grid, 560,550);
primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
