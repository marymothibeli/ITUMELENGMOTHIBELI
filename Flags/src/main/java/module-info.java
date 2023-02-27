module com.mycompany.flags {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.flags to javafx.fxml;
    exports com.mycompany.flags;
}
