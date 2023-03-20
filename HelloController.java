package com.example.cashingupprogram;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Pane anchorPane;
    @FXML
    private Pane summaryPane;
    @FXML
    private TextField onePCount;
    @FXML
    private Label onePLabel;
    @FXML
    private Button submitButton;
    @FXML
    private Label totalLabel;
    @FXML
    private TextField twoPCount;
    @FXML
    private Label twoPLabel;
    @FXML
    private TextField fivePCount;
    @FXML
    private Label fivePLabel;
    @FXML
    private TextField tenPCount;
    @FXML
    private Label tenPLabel;
    @FXML
    private TextField twentyPCount;
    @FXML
    private Label twentyPLabel;
    @FXML
    private TextField fiftyPCount;
    @FXML
    private Label fiftyPLabel;
    @FXML
    private TextField onePoundCount;
    @FXML
    private Label onePoundLabel;
    @FXML
    private TextField twoPoundCount;
    @FXML
    private Label twoPoundLabel;
    @FXML
    private TextField fivePoundCount;
    @FXML
    private Label fivePoundLabel;
    @FXML
    private TextField tenPoundCount;
    @FXML
    private Label tenPoundLabel;
    @FXML
    private TextField twentyPoundCount;
    @FXML
    private Label twentyPoundLabel;
    @FXML
    private TextField fiftyPoundCount;
    @FXML
    private Label fiftyPoundLabel;
    @FXML
    private Label minusFloatLabel;
    @FXML
    private Label expectedTotalLabel;
    @FXML
    private TextField expectedTotalField;
    @FXML
    private Button expectedTotalButton;
    @FXML
    private Label plusMinusLabel;
    @FXML
    private Button resetButton;





    // Summary Fields

    double sum;

    double minusFloat;




    // Submit Button


    public void submit(ActionEvent event){

        sum = 0;


        // 1p


        int onePCoins;

        double onePTotal = 0;


        if(onePCount.getText().isEmpty()){
            onePTotal = 0;
            onePLabel.setText("1p Coins = £" + String.format("%.2f", onePTotal));
        } else {


            try {

                onePCoins = Integer.parseInt(onePCount.getText());
                onePTotal = onePCoins * 0.01;

                sum += onePTotal;

                onePLabel.setText("1p Coins = £" + String.format("%.2f", onePTotal));

            } catch (NumberFormatException e) {
                onePLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                onePLabel.setText("Error");
            }


        }


        // 2p


        int twoPCoins;

        double twoPTotal = 0;


        if (twoPCount.getText().isEmpty()){
            twoPTotal = 0;
            twoPLabel.setText("2p Coins = £" +String.format("%.2f", twoPTotal));
        } else {

            try {

                twoPCoins = Integer.parseInt(twoPCount.getText());
                twoPTotal = twoPCoins * 0.02;

                sum += twoPTotal;

                twoPLabel.setText("2p Coins = £" + String.format("%.2f", twoPTotal));

            } catch (NumberFormatException e) {
                twoPLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                twoPLabel.setText("Error");
            }

        }




        // 5p


        int fivePCoins;

        double fivePTotal;


        if (fivePCount.getText().isEmpty()){
            fivePTotal = 0;
            fivePLabel.setText("5p Coins = £" + String.format("%.2f", fivePTotal));
        } else {

            try {

                fivePCoins = Integer.parseInt(fivePCount.getText());
                fivePTotal = fivePCoins * 0.05;

                sum += fivePTotal;

                fivePLabel.setText("5p Coins = £" + String.format("%.2f", fivePTotal));

            } catch (NumberFormatException e) {
                fivePLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                fivePLabel.setText("Error");
            }


        }



        // 10p

        int tenPCoins;

        double tenPTotal;


        if (tenPCount.getText().isEmpty()){
            tenPTotal = 0;
            tenPLabel.setText("10p Coins = £" + String.format("%.2f", tenPTotal));

        } else {

            try {

                tenPCoins = Integer.parseInt(tenPCount.getText());
                tenPTotal = tenPCoins * 0.1;

                sum += tenPTotal;

                tenPLabel.setText("10p Coins = £" + String.format("%.2f", tenPTotal));

            } catch (NumberFormatException e) {
                tenPLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                tenPLabel.setText("Error");
            }


        }




        // 20p


        int twentyPCoins;

        double twentyPTotal;


        if (twentyPCount.getText().isEmpty()){
            twentyPTotal = 0;
            twentyPLabel.setText("10p Coins = £" + String.format("%.2f", twentyPTotal));

        } else {


            try {

                twentyPCoins = Integer.parseInt(twentyPCount.getText());
                twentyPTotal = twentyPCoins * 0.2;

                sum += twentyPTotal;

                twentyPLabel.setText("10p Coins = £" + String.format("%.2f", twentyPTotal));

            } catch (NumberFormatException e) {
                twentyPLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                twentyPLabel.setText("Error");
            }


        }




        // 50p


        int fiftyPCoins;

        double fiftyPTotal;


        if (fiftyPCount.getText().isEmpty()){
            fiftyPTotal = 0;
            fiftyPLabel.setText("50p Coins = £" + String.format("%.2f", fiftyPTotal));

        } else {


            try {

                fiftyPCoins = Integer.parseInt(fiftyPCount.getText());
                fiftyPTotal = fiftyPCoins * 0.5;

                sum += fiftyPTotal;

                fiftyPLabel.setText("50p Coins = £" + String.format("%.2f", fiftyPTotal));

            } catch (NumberFormatException e) {
                fiftyPLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                fiftyPLabel.setText("Error");
            }


        }




        // £1


        int onePoundCoins;

        double onePoundTotal;


        if (onePoundCount.getText().isEmpty()){
            onePoundTotal = 0;
            onePoundLabel.setText("£1 Coins = £" + String.format("%.2f", onePoundTotal));

        } else {


            try {

                onePoundCoins = Integer.parseInt(onePoundCount.getText());
                onePoundTotal = onePoundCoins * 1;

                sum += onePoundTotal;

                onePoundLabel.setText("£1 Coins = £" + String.format("%.2f", onePoundTotal));

            } catch (NumberFormatException e) {
                onePoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                onePoundLabel.setText("Error");
            }


        }




        // £2


        int twoPoundCoins;

        double twoPoundTotal;


        if (twoPoundCount.getText().isEmpty()){
            twoPoundCoins = 0;
            twoPoundTotal = 0;
            twoPoundLabel.setText("£2 Coins = £" + String.format("%.2f", twoPoundTotal));

        } else {


            try {

                twoPoundCoins = Integer.parseInt(twoPoundCount.getText());
                twoPoundTotal = twoPoundCoins * 2;

                sum += twoPoundTotal;

                twoPoundLabel.setText("£2 Coins = £" + String.format("%.2f", twoPoundTotal));

            } catch (NumberFormatException e) {
                twoPoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                twoPoundLabel.setText("Error");
            }


        }





        // £5


        int fivePoundCoins;

        double fivePoundTotal;


        if (fivePoundCount.getText().isEmpty()){
            fivePoundCoins = 0;
            fivePoundTotal = 0;
            fivePoundLabel.setText("£5 Coins = £" + String.format("%.2f", fivePoundTotal));

        } else {

            try {

                fivePoundCoins = Integer.parseInt(fivePoundCount.getText());
                fivePoundTotal = fivePoundCoins * 5;

                sum += fivePoundTotal;

                fivePoundLabel.setText("£5 Coins = £" + String.format("%.2f", fivePoundTotal));

            } catch (NumberFormatException e) {
                fivePoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                fivePoundLabel.setText("Error");
            }


        }






        // £10


        int tenPoundCoins;

        double tenPoundTotal;


        if (tenPoundCount.getText().isEmpty()){
            tenPoundCoins = 0;
            tenPoundTotal = 0;
            tenPoundLabel.setText("£10 Coins = £" + String.format("%.2f", tenPoundTotal));

        } else {


            try {

                tenPoundCoins = Integer.parseInt(tenPoundCount.getText());
                tenPoundTotal = tenPoundCoins * 10;

                sum += tenPoundTotal;

                tenPoundLabel.setText("£10 Coins = £" + String.format("%.2f", tenPoundTotal));

            } catch (NumberFormatException e) {
                tenPoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                tenPoundLabel.setText("Error");
            }


        }





        // £20


        int twentyPoundCoins;

        double twentyPoundTotal;


        if (twentyPoundCount.getText().isEmpty()){
            twentyPoundCoins = 0;
            twentyPoundTotal = 0;
            twentyPoundLabel.setText("£20 Coins = £" + String.format("%.2f", twentyPoundTotal));

        } else {


            try {

                twentyPoundCoins = Integer.parseInt(twentyPoundCount.getText());
                twentyPoundTotal = twentyPoundCoins * 20;

                sum += twentyPoundTotal;

                twentyPoundLabel.setText("£20 Coins = £" + String.format("%.2f", twentyPoundTotal));

            } catch (NumberFormatException e) {
                twentyPoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                twentyPoundLabel.setText("Error");
            }


        }


        // £50


        int fiftyPoundCoins;

        double fiftyPoundTotal;


        if (fiftyPoundCount.getText().isEmpty()){
            fiftyPoundCoins = 0;
            fiftyPoundTotal = 0;
            fiftyPoundLabel.setText("£50 Coins = £" + String.format("%.2f", fiftyPoundTotal));

        } else {


            try {

                fiftyPoundCoins = Integer.parseInt(fiftyPoundCount.getText());
                fiftyPoundTotal = fiftyPoundCoins * 50;

                sum += fiftyPoundTotal;

                fiftyPoundLabel.setText("£50 Coins = £" + String.format("%.2f", fiftyPoundTotal));

            } catch (NumberFormatException e) {
                fiftyPoundLabel.setText("Error: Numbers Only Please");
            } catch (Exception e) {
                fiftyPoundLabel.setText("Error");
            }


        }




        totalLabel.setText("Total: £" + String.format("%.2f", sum));

        minusFloat = sum - 130;

        minusFloatLabel.setText("Total Takings:  £" +
                String.format("%.2f", minusFloat));

    }




    // Expected Total

    double expectedTotal;

    double countedMinusExpected;

    public void expectedTotalSubmit(ActionEvent event){

        try {

            expectedTotal = Double.parseDouble(expectedTotalField.getText());

            countedMinusExpected = minusFloat - expectedTotal;

            if(countedMinusExpected < 0){
                plusMinusLabel.setTextFill(Color.RED);
            } else if (countedMinusExpected == 0) {
                plusMinusLabel.setTextFill(Color.BLACK);
            } else {
                plusMinusLabel.setTextFill(Color.GREEN);
            }

            plusMinusLabel.setText("+/- : " + String.format("%.2f", countedMinusExpected));

        } catch (Exception e){



        }

    }




    // Reset Button


    public void reset(ActionEvent event){

        onePCount.setText("");
        twoPCount.setText("");
        fivePCount.setText("");
        tenPCount.setText("");
        twentyPCount.setText("");
        fiftyPCount.setText("");
        onePoundCount.setText("");
        twoPoundCount.setText("");
        fivePoundCount.setText("");
        tenPoundCount.setText("");
        twentyPoundCount.setText("");
        fiftyPoundCount.setText("");

    }




}