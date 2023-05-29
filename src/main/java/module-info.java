module com.example.cspicross {
    requires javafx.controls;
    requires javafx.fxml;
    requires  javafx.graphics;

    opens SCPicross to javafx.fxml;
    exports SCPicross;
}