package jv2.session3.assigment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main6 extends Application {
    public static void main(String args[]){ launch(args);}

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Timer.fxml"));
            primaryStage.setScene(new Scene(root,600,600));
            primaryStage.setTitle("Timer Countdown");
            primaryStage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
