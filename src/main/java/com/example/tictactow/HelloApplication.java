package com.example.tictactow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HelloApplication extends Application {
    Integer[] alternatives = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8};


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 840);
        stage.setTitle("Hello!");
        InputStream stream = new FileInputStream("C:\\Users\\KalleNY\\IdeaProjects\\TicTacTow\\mater.jpg");
        Image image = new Image(stream);
        stage.setScene(scene);
        stage.show();


    }
    public static Image show() throws FileNotFoundException {
        InputStream stream = new FileInputStream("C:\\Users\\KalleNY\\IdeaProjects\\TicTacTow\\mater.jpg");
        Image image = new Image(stream);
        return image;
    }



    public static void main(String[] args) {
        launch();
    }
}