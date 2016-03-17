import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
public class main extends Application {

    Stage window;
    Button button1,button2;


    public static void main(String[] args)

    {
        launch(args);
        System.out.println("Checking if it works");
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Bank of the Internet");



        button2 = new Button("log in");
        button1 = new Button("sign up");

        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button1.setTranslateX(120);
        button1.setTranslateY(0);

        button2.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button2.setTranslateX(-120);
        button2.setTranslateY(0);

        Text t = new Text();
        t.setText("Bank of The Internet");
        t.setFont(Font.font ("Verdana", 40));
        t.setTranslateX(0);
        t.setTranslateY(-120);


        StackPane layout = new StackPane();
        layout.getChildren().add(button2);
        layout.getChildren().add(button1);
        layout.getChildren().add(t);
        Scene scene = new Scene(layout, 800, 700);






        window.setScene(scene);
        window.show();
    }
}