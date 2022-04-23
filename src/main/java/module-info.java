module com.example.testapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.testapp to javafx.fxml;
    exports com.example.testapp;
}