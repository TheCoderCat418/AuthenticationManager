module com.mycompany.authappgui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.authappgui to javafx.fxml;
    exports com.mycompany.authappgui;
}
