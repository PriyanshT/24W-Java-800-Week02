package org.georgiancollege.week02;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Book book1 = new Book(1, "Harry Potter",
                "JK Rowling", "Thriller", 19.99, true);
        Book book2 = new Book(2, "ASOIAF", "GRRM",
                "Fantasy", 30.52, false);

        System.out.println(book1);
        System.out.println(book2);
    }
}