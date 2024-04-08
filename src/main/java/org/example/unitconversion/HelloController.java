package org.example.unitconversion;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ComboBox<String> chooseCategory;
    @FXML
    private TextField inputText;
    @FXML
    private Text outputText;
    @FXML
    private ComboBox<String> inputLength;
    @FXML
    private ComboBox<String> outputLength;
    @FXML
    private ComboBox<String> inputTemperature;
    @FXML
    private ComboBox<String> outputTemperature;
    @FXML
    private ComboBox<String> inputMass;
    @FXML
    private ComboBox<String> outputMass;

    @FXML
    protected void onCategory(){
        if (chooseCategory.getValue().equalsIgnoreCase("Length")){
            inputLength.setVisible(true);
            outputLength.setVisible(true);
            inputTemperature.setVisible(false);
            outputTemperature.setVisible(false);
            inputMass.setVisible(false);
            outputMass.setVisible(false);
        } else if (chooseCategory.getValue().equalsIgnoreCase("Temperature")){
            inputLength.setVisible(false);
            outputLength.setVisible(false);
            inputTemperature.setVisible(true);
            outputTemperature.setVisible(true);
            inputMass.setVisible(false);
            outputMass.setVisible(false);
            inputTemperature.translateYProperty().set(-90);
            outputTemperature.translateYProperty().set(-90);
        } else if (chooseCategory.getValue().equalsIgnoreCase("Mass")){
            inputLength.setVisible(false);
            outputLength.setVisible(false);
            inputTemperature.setVisible(false);
            outputTemperature.setVisible(false);
            inputMass.setVisible(true);
            outputMass.setVisible(true);
            inputMass.translateYProperty().set(-180);
            outputMass.translateYProperty().set(-180);
        }
    }

    @FXML
    protected void onTextField(){
        try {
            double input = Double.parseDouble(inputText.getText());
            if (chooseCategory.getValue().equalsIgnoreCase("Length")) {
                if (inputLength.getValue().equalsIgnoreCase("Inch") && outputLength.getValue().equalsIgnoreCase("Foot")) {
                    outputText.setText("Output: " + input / 12 + " ft");
                } else if (inputLength.getValue().equalsIgnoreCase("Foot") && outputLength.getValue().equalsIgnoreCase("Inch")) {
                    outputText.setText("Output: " + input * 12 + " in");
                } else if (inputLength.getValue().equalsIgnoreCase("Foot") && outputLength.getValue().equalsIgnoreCase("Yard")){
                    outputText.setText("Output: " + input / 3 + " yd");
                } else if (inputLength.getValue().equalsIgnoreCase("Yard") && outputLength.getValue().equalsIgnoreCase("Foot")){
                    outputText.setText("Output: " + input * 3 + " ft");
                } else if (inputLength.getValue().equalsIgnoreCase("Yard") && outputLength.getValue().equalsIgnoreCase("Mile")){
                    outputText.setText("Output: " + input / 1760 + " mi");
                } else if (inputLength.getValue().equalsIgnoreCase("Mile") && outputLength.getValue().equalsIgnoreCase("Yard")){
                    outputText.setText("Output: " + input * 1760 + " yd");
                } else if (inputLength.getValue().equalsIgnoreCase("Inch") && outputLength.getValue().equalsIgnoreCase("Yard")){
                    outputText.setText("Output: " + input / 36 + " yd");
                } else if (inputLength.getValue().equalsIgnoreCase("Inch") && outputLength.getValue().equalsIgnoreCase("Mile")){
                    outputText.setText("Output: " + input / 63360 + " mi");
                } else if (inputLength.getValue().equalsIgnoreCase("Inch") && outputLength.getValue().equalsIgnoreCase("Inch")){
                    outputText.setText("Output: " + input +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Foot") && outputLength.getValue().equalsIgnoreCase("Mile")){
                    outputText.setText("Output: " + input / 5280 +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Yard") && outputLength.getValue().equalsIgnoreCase("Inch")){
                    outputText.setText("Output: " + input / 36 +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Yard") && outputLength.getValue().equalsIgnoreCase("Yard")){
                    outputText.setText("Output: " + input +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Foot") && outputLength.getValue().equalsIgnoreCase("Foot")){
                    outputText.setText("Output: " + input +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Mile") && outputLength.getValue().equalsIgnoreCase("Inch")){
                    outputText.setText("Output: " + input * 63360 +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Mile") && outputLength.getValue().equalsIgnoreCase("Foot")){
                    outputText.setText("Output: " + input * 5280 +" in");
                } else if (inputLength.getValue().equalsIgnoreCase("Mile") && outputLength.getValue().equalsIgnoreCase("Mile")){
                    outputText.setText("Output: " + input +" in");
                } else {
                    outputText.setText("Output: invalid");
                }
            }else if (chooseCategory.getValue().equalsIgnoreCase("Temperature")){
                if (inputTemperature.getValue().equalsIgnoreCase("Fahrenheit") && outputTemperature.getValue().equalsIgnoreCase("Celsius")){
                    double celsius = (input-32)*((double) 5 /9);
                    outputText.setText("Output: " + celsius +"°C");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Celsius") && outputTemperature.getValue().equalsIgnoreCase("Fahrenheit")) {
                    double fahrenheit = input * ((double) 9 / 5) + 32;
                    outputText.setText("Output: " + fahrenheit + "°F");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Fahrenheit") && outputTemperature.getValue().equalsIgnoreCase("Fahrenheit")) {
                    outputText.setText("Output: " + input + "°F");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Celsius") && outputTemperature.getValue().equalsIgnoreCase("Celsius")) {
                    outputText.setText("Output: " + input + "°C");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Fahrenheit") && outputTemperature.getValue().equalsIgnoreCase("Kelvin")) {
                    double kelvin = (input-32)*((double) 5 /9) + 273.15;
                    outputText.setText("Output: " + kelvin + "K");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Celsius") && outputTemperature.getValue().equalsIgnoreCase("Kelvin")) {
                    double kelvin = input + 273.15;
                    outputText.setText("Output: " + kelvin + "K");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Kelvin") && outputTemperature.getValue().equalsIgnoreCase("Fahrenheit")) {
                    double fahrenheit = (input - 273.15) * ((double) 9/5) + 32;
                    outputText.setText("Output: " + fahrenheit + " °F");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Kelvin") && outputTemperature.getValue().equalsIgnoreCase("Celsius")) {
                    double fahrenheit = (input - 273.15);
                    outputText.setText("Output: " + fahrenheit + "°C");
                } else if (inputTemperature.getValue().equalsIgnoreCase("Kelvin") && outputTemperature.getValue().equalsIgnoreCase("Kelvin")) {
                    outputText.setText("Output: " + input + "K");
                } else {
                    outputText.setText("Output: invalid");
                }
            }else if (chooseCategory.getValue().equalsIgnoreCase("Mass")){
                if (inputMass.getValue().equalsIgnoreCase("Milligram") && outputMass.getValue().equalsIgnoreCase("Gram")){
                    outputText.setText("Output: " + input/1000 + "g");
                } else if (inputMass.getValue().equalsIgnoreCase("Milligram") && outputMass.getValue().equalsIgnoreCase("Kilogram")){
                    outputText.setText("Output: " + input/1000000 + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Milligram") && outputMass.getValue().equalsIgnoreCase("Metric Ton")){
                    outputText.setText("Output: " + input/1000000000 + "mt");
                } else if (inputMass.getValue().equalsIgnoreCase("Milligram") && outputMass.getValue().equalsIgnoreCase("Milligram")){
                    outputText.setText("Output: " + input + "mg");
                } else if (inputMass.getValue().equalsIgnoreCase("Gram") && outputMass.getValue().equalsIgnoreCase("Milligram")){
                    outputText.setText("Output: " + input*1000 + "mg");
                } else if (inputMass.getValue().equalsIgnoreCase("Gram") && outputMass.getValue().equalsIgnoreCase("Gram")){
                    outputText.setText("Output: " + input + "g");
                } else if (inputMass.getValue().equalsIgnoreCase("Gram") && outputMass.getValue().equalsIgnoreCase("Kilogram")){
                    outputText.setText("Output: " + input/1000 + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Gram") && outputMass.getValue().equalsIgnoreCase("Metric Ton")){
                    outputText.setText("Output: " + input/1000000 + "mt");
                } else if (inputMass.getValue().equalsIgnoreCase("Kilogram") && outputMass.getValue().equalsIgnoreCase("Milligram")){
                    outputText.setText("Output: " + input*1000000 + "mg");
                } else if (inputMass.getValue().equalsIgnoreCase("Kilogram") && outputMass.getValue().equalsIgnoreCase("Gram")){
                    outputText.setText("Output: " + input*1000 + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Kilogram") && outputMass.getValue().equalsIgnoreCase("Kilogram")){
                    outputText.setText("Output: " + input + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Kilogram") && outputMass.getValue().equalsIgnoreCase("Metric Ton")){
                    outputText.setText("Output: " + input/1000 + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Metric Ton") && outputMass.getValue().equalsIgnoreCase("Milligram")){
                    outputText.setText("Output: " + input*1000000000 + "mg");
                } else if (inputMass.getValue().equalsIgnoreCase("Metric Ton") && outputMass.getValue().equalsIgnoreCase("Gram")){
                    outputText.setText("Output: " + input*1000000 + "g");
                } else if (inputMass.getValue().equalsIgnoreCase("Metric Ton") && outputMass.getValue().equalsIgnoreCase("Kilogram")){
                    outputText.setText("Output: " + input*1000 + "kg");
                } else if (inputMass.getValue().equalsIgnoreCase("Metric Ton") && outputMass.getValue().equalsIgnoreCase("Metric Ton")){
                    outputText.setText("Output: " + input/1000000 + "mt");
                }
            }
        }catch (NumberFormatException e){
            outputText.setText("Output: you must input a number");
        }catch (NullPointerException e){
            outputText.setText("Output: you cannot input nothing");
        }
    }
}