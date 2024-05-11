module java.socket_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens java.socket_2 to javafx.fxml;
    exports java.socket_2;
}