import com.sun.corba.se.pept.transport.EventHandler;
import com.sun.tools.javac.jvm.ClassFile;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class main extends Application
{

    Stage window;           // not sure if i need to declare them here , since text work
    Button button1,button2,button_go_Back,button_go_Back2;
    Scene Log_in_Scene, Sign_up_Scene, Scene1;
    FlowPane pane1, pane2;


    public static void main(String[] args)

    {
        launch(args);
        System.out.println("Checking if it works"); // print to console when application close
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Bank of the Internet");

        /*
        The window is the thing that launch and the scene is everything that goes inside the buttons, title
        , color and labels , etc

        */



        button1 = new Button("log in");
        button2 = new Button("sign up");


        /*
        i added this color and fonts for the buttons and text because it was on the documents idk
         if you guys want to change it
         */
        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button1.setTranslateX(120);
        button1.setTranslateY(0);

        button2.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button2.setTranslateX(-120);
        button2.setTranslateY(0);

        Text t = new Text();
        t.setText("Bank of The Internet");
        t.setFont(Font.font ("Verdana",FontPosture.ITALIC, 40));
        t.setFill(Color.DEEPSKYBLUE);
        t.setTranslateX(0);
        t.setTranslateY(-120);


        Text version = new Text();
        version.setText("Desktop Bank of Internet ver 1.0");
        version.setFont(Font.font("Arial",FontPosture.REGULAR, 12));
        version.setTranslateX(300);
        version.setTranslateY(340);

        /*
        change scene
         */
        button1.setOnAction(e -> window.setScene(Log_in_Scene));
        button2.setOnAction(e-> window.setScene(Sign_up_Scene));


        /*
        the go back button goes from scene of log in and sign up to the start scene
         */
        button_go_Back = new Button("Go Back");
        button_go_Back.setTranslateX(350);
        button_go_Back.setTranslateY(-336);
        button_go_Back.setOnAction(e -> window.setScene(Scene1));

        button_go_Back2 = new Button("Go Back");
        button_go_Back2.setTranslateX(350);
        button_go_Back2.setTranslateY(-336);
        button_go_Back2.setOnAction(e -> window.setScene(Scene1));




        /*
        the getChildren add stuff to the screen
         */
        StackPane layout = new StackPane();
        layout.getChildren().add(button2);
        layout.getChildren().add(button1);
        layout.getChildren().add(t);
        layout.getChildren().add(version);
        layout.setStyle("-fx-background-color: lightslategray");
        Scene1 = new Scene(layout, 800, 700);




        /*
        layout for scene for log in
         */

        StackPane layout_log_ing = new StackPane();
        layout_log_ing.getChildren().add(button_go_Back2);
        layout_log_ing.setStyle("-fx-background-color: lightslategray");
        Log_in_Scene = new Scene(layout_log_ing,800,700);



        /*
        layout for sign up scene
         */
        Label label_name = new Label("Name:");
        label_name.setTranslateX(-330);
        label_name.setTranslateY(-250);
        TextField textField_name = new TextField();
        textField_name.setTranslateY(-250);
        textField_name.setTranslateX(-250);

        textField_name.setPrefWidth(10);
        textField_name.setMinWidth(40);
        textField_name.setMaxWidth(100);


        StackPane layout_sign_up = new StackPane();
        layout_sign_up.getChildren().add(button_go_Back);
        layout_sign_up.getChildren().addAll(label_name,textField_name);

        layout_sign_up.setStyle("-fx-background-color: lightslategray");
        Sign_up_Scene = new Scene(layout_sign_up,800,700);






        window.setScene(Scene1);
        window.show();
    }

}