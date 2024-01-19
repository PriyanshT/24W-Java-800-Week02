module org.georgiancollege.week02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.georgiancollege.week02 to javafx.fxml;
    exports org.georgiancollege.week02;
}