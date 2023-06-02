module app.musicmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.musicmanager to javafx.fxml;
    exports app.musicmanager;
}