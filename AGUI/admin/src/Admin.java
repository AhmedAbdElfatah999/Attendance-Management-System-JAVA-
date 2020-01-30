import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
/**
 *
 * @author Ahmed's
 */
public class Admin extends Application {

        Stage stage;
        BorderPane Layout;
        Button update,logout;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;
        stage.setTitle("Admin Panel");
             update=new Button("Update Profile");
              /**********************************************************************/
            
                Menu student = new Menu ("Student");
        student.getItems().add(new MenuItem("View Profile"));
        student.getItems().add(new MenuItem("Edit Profile"));
        student.getItems().add(new MenuItem ("View Attendance"));
        student.getItems().add(new MenuItem ("Print Attendance Report"));
                /**********************************************************************/
        
                Menu teacher = new Menu ("Teacher");
        teacher.getItems().add(new MenuItem ("View Profile"));
        teacher.getItems().add(new MenuItem ("Edit Profile"));
        teacher.getItems().add(new MenuItem ("View Staff"));
        teacher.getItems().add(new MenuItem ("View subjects"));
        teacher.getItems().add(new MenuItem("Allot subject"));
        
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
        
      
        Layout = new BorderPane();

                    Layout.setPadding(new Insets(10, 10, 10, 10));
                    Layout.setAlignment(update, Pos.CENTER);
                    Layout.setMargin(update, new Insets(12,12,12,12)); // optional
                    
                    Layout.setBottom(update);


        Layout.setTop(menubars);
        Scene scene = new Scene (Layout, 800,600);
        
        
        
        
                            /*********************************************************************/
                            
                            
                            
        BackgroundImage myBI= new BackgroundImage(new Image("back1.jpg"),
            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);   
            Layout.setBackground(new Background(myBI));
            
                                        /*********************************************************************/
ImageView imageView = new ImageView();
imageView.setImage(new Image("rsz_man.png"));     



        Layout.setCenter(imageView);                                   
        stage.setScene(scene);
        stage.show();
}
}