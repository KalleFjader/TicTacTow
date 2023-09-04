package com.example.tictactow;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public Button one; @FXML
    Button two; @FXML
    Button three; @FXML
    Button four; @FXML
    Button five; @FXML
    Button six; @FXML
    Button seven; @FXML
    Button eight; @FXML
    Button nine; @FXML
    Label result; @FXML
    ImageView imageview;

    InputStream stream = new FileInputStream("C:\\Users\\KalleNY\\IdeaProjects\\TicTacTow\\mater.jpg");
    Image image = new Image(stream);

    Integer[] board = new Integer[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    int turn = 0;
    Image bild = HelloApplication.show();

    public HelloController() throws FileNotFoundException {
    }

    public int checkResults(){
        if(board[0] == board[1] && board[0] == board[2] && board[0] != 0){
            return board[0];
        }else if(board[3] == board[4] && board[3] == board[5] && board[3] != 0){
            return board[3];
        }else if(board[6] == board[7] && board[6] == board[8] && board[6] != 0){
            return board[6];
        }else if(board[0] == board[3] && board[0] == board[6] && board[0] != 0){
            return board[0];
        }else if(board[1] == board[4] && board[1] == board[7] && board[1] != 0){
            return board[1];
        }else if(board[2] == board[5] && board[2] == board[8] && board[2] != 0){
            return board[2];
        }else if(board[0] == board[4] && board[1] == board[8] && board[0] != 0){
            return board[0];
        }else if(board[2] == board[4] && board[2] == board[6] && board[2] != 0){
            return board[2];
        }else{
            return 404;
        }
    }

    public void AIturn(Integer[] board){
            int choice = 9;
            while (board[choice] != 0 && turn != 4) {
                for (int i = 0; i < 10; i++) {
                    int rand = (int) (Math.random() * 9);
                    choice = rand;
                }

            }
            turn = turn + 1;
            board[choice] = 2;
            if (choice == 0) {
                one.setText("O");
            } else if (choice == 1) {
                two.setText("O");
            } else if (choice == 2) {
                three.setText("O");
            } else if (choice == 3) {
                four.setText("O");
            } else if (choice == 4) {
                five.setText("O");
            } else if (choice == 5) {
                six.setText("O");
            } else if (choice == 6) {
                seven.setText("O");
            } else if (choice == 7) {
                eight.setText("O");
            } else if (choice == 8) {
                nine.setText("O");
            }
    if(checkResults() == 1){
        result.setText("YOU WON!");
    }else if(checkResults() == 2){
        result.setText("MATER WON!");
        imageview.setImage(image);


    }
    }

    @FXML
    private void oneclicked(ActionEvent event) {
        System.out.println("one");
        one.setText("X");
        board[0] = 1;
        System.out.println(board[0]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }

    }

    @FXML
    private void twoclicked(ActionEvent event) {
        System.out.println("two");
        two.setText("X");
        board[1] = 1;
        System.out.println(board[1]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void threeclicked(ActionEvent event) {
        System.out.println("three");
        three.setText("X");
        board[2] = 1;
        System.out.println(board[2]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }

    }

    @FXML
    private void fourclicked(ActionEvent event) {
        System.out.println("four");
        four.setText("X");
        board[3] = 1;
        System.out.println(board[3]);

        for(int i=0; i < 9; i++){
            System.out.print(board[i]);
        }

        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void fiveclicked(ActionEvent event) {
        System.out.println("five");
        five.setText("X");
        board[4] = 1;
        System.out.println(board[4]);

        for(int i=0; i < 9; i++){
            System.out.print(board[i]);
        }

        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void sixclicked(ActionEvent event) {
        System.out.println("six");
        six.setText("X");
        board[5] = 1;
        System.out.println(board[5]);

        for(int i=0; i < 9; i++){
            System.out.print(board[i]);
        }

        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void sevenclicked(ActionEvent event) {
        System.out.println("seven");
        seven.setText("X");
        board[6] = 1;
        System.out.println(board[6]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void eightclicked(ActionEvent event) {
        System.out.println("eight");
        eight.setText("X");
        board[7] = 1;
        System.out.println(board[7]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

    @FXML
    private void nineclicked(ActionEvent event) {
        System.out.println("nine");
        nine.setText("X");
        board[8] = 1;
        System.out.println(board[8]);
        if(checkResults() == 404){
            AIturn(board);
        }else if(checkResults() == 1){
            result.setText("YOU WON!");
        }else{
            result.setText("MATER WON!");
            imageview.setImage(bild);
        }
    }

}