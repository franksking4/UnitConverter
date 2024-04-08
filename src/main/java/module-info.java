module org.example.unitconversion {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.unitconversion to javafx.fxml;
    exports org.example.unitconversion;
}