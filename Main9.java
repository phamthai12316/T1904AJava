package jv2.labsession1.assigment1;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

    public class Main9 extends Application {
        public static Stage mainStage;
        public static void main(String[] args) {
            launch(args);
        }
                @Override
                public void start (Stage primaryStage) throws IOException {
                    mainStage = primaryStage;
                    try{
                        Parent root = FXMLLoader.load(getClass().getResource("tbProduct.fxml"));
                        primaryStage.setTitle("Products List");
                        primaryStage.setScene(new Scene(root, 600, 400));
                        primaryStage.show();
                    }catch(Exception e){

                    }
                }
    }