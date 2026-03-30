package com.example.csc164_firstjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button theOnlyButtonInMyAppButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Oh - that's what this button does!");

        theOnlyButtonInMyAppButton.setText("You clicked me!!!");
    }
}