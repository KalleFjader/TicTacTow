module com.example.tictactow {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tictactow to javafx.fxml;
    exports com.example.tictactow;
}