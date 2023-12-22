module com.example.friendgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.friendgui to javafx.fxml;
    exports com.example.friendgui;
}