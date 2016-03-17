import com.sun.tools.javac.jvm.ClassFile;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
public class main extends Application {

    Stage window;           // not sure if i need to declare them here , since text work
    Button button1,button2;


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



        button2 = new Button("log in");
        button1 = new Button("sign up");


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
        the getChildren add stuff to the screen
         */
        StackPane layout = new StackPane();
        layout.getChildren().add(button2);
        layout.getChildren().add(button1);
        layout.getChildren().add(t);
        layout.getChildren().add(version);
        layout.setStyle("-fx-background-color: lightslategray");
        Scene scene = new Scene(layout, 800, 700);






        window.setScene(scene);
        window.show();
    }
}