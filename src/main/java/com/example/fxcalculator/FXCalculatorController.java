package com.example.fxcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXCalculatorController {

    Float num = 0f;
    int operation = -1;
    boolean firstRun = true;
    boolean mathDone = false;

    @FXML
    private Button sub;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button multi;

    @FXML
    private Button one;

    @FXML
    private TextField textBox;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    public void handleButtonPress(ActionEvent event) {
        if (firstRun) {
            textBox.setText("");
            firstRun = false;
        }
        if (mathDone) {
            textBox.setText("");
            mathDone = false;
        }
        if (event.getSource() == one) {
            textBox.setText(textBox.getText() + "1");
        }
        else if (event.getSource() == two) {
            textBox.setText(textBox.getText() + "2");
        }
        else if (event.getSource() == three) {
            textBox.setText(textBox.getText() + "3");
        }
        else if (event.getSource() == four) {
            textBox.setText(textBox.getText() + "4");
        }
        else if (event.getSource() == five) {
            textBox.setText(textBox.getText() + "5");
        }
        else if (event.getSource() == six) {
            textBox.setText(textBox.getText() + "6");
        }
        else if (event.getSource() == seven) {
            textBox.setText(textBox.getText() + "7");
        }
        else if (event.getSource() == eight) {
            textBox.setText(textBox.getText() + "8");
        }
        else if (event.getSource() == nine) {
            textBox.setText(textBox.getText() + "9");
        }
        else if (event.getSource() == add) {
            num = Float.parseFloat(textBox.getText());
            operation = 1; //Add
            textBox.setText(textBox.getText() + "+");
        }
        else if (event.getSource() == sub) {
            num = Float.parseFloat(textBox.getText());
            operation = 2; //Subtract
            textBox.setText(textBox.getText() + "-");
        }
        else if (event.getSource() == multi) {
            num = Float.parseFloat(textBox.getText());
            operation = 3; //Multiply
            textBox.setText(textBox.getText() + "*");
        }
        else if (event.getSource() == div) {
            num = Float.parseFloat(textBox.getText());
            operation = 4; //Divide
            textBox.setText(textBox.getText() + "/");
        }
        else if (event.getSource() == equals) {
            mathDone = true;
            String secondNumStr = "";
            if (textBox.getText().contains("+")) {
                secondNumStr = textBox.getText().substring(textBox.getText().indexOf("+") + 1);
            }
            else if (textBox.getText().contains("-")) {
                secondNumStr = textBox.getText().substring(textBox.getText().indexOf("-") + 1);
            }
            else if (textBox.getText().contains("*")) {
                secondNumStr = textBox.getText().substring(textBox.getText().indexOf("*") + 1);
            }
            else if (textBox.getText().contains("/")) {
                secondNumStr = textBox.getText().substring(textBox.getText().indexOf("/") + 1);
            }
            Float secondNum = Float.parseFloat(secondNumStr);
            switch (operation) {
                case 1:
                    Float answer = num + secondNum;
                    textBox.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer = num - secondNum;
                    textBox.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer = num * secondNum;
                    textBox.setText(String.valueOf(answer));
                    break;
                case 4:
                    answer = 0f;
                    try {
                        answer = num / secondNum;
                    }
                    catch (Exception e){
                        textBox.setText("Error");
                    }
                    textBox.setText(String.valueOf(answer));
                    break;
            }
        }
    }
}
