package jv2.labsession5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("table.fxml"));
            primaryStage.setTitle("Sinh Vien");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){}
    }
}