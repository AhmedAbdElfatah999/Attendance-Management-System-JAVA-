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

/**
 *
 * @author Ahmed Abdelaty
 */
public class Admain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          primaryStage.setTitle("Login Form");
       

        
     GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(javafx.geometry.Insets.EMPTY);

Label email = new Label("Email:");
    email.setTextFill(Color.web("#fdf5e6"));

email.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid.add(email, 0, 1);

TextField emailBox = new TextField();
    String logemail = emailBox.getText();
    
    /************************************************************************/
    
    
    
    
    
    
    
    
    /**********************************************************************/

grid.add(emailBox, 1, 1);


Label pw = new Label("Password:");
    pw.setTextFill(Color.web("#fdf5e6"));

pw.setFont(Font.font("Tahoma", FontWeight.NORMAL,15));
grid.add(pw, 0, 2);

PasswordField pwBox = new PasswordField();
    String logpass = pwBox.getText();

grid.add(pwBox, 1, 2);


Button btn = new Button("Login");
btn.setFont(Font.font("Tahoma", FontWeight.NORMAL,12));
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);
grid.add(hbBtn, 1, 3);
        


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
