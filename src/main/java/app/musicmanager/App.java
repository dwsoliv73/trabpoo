package app.musicmanager;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels for login and password
        Label loginLabel = new Label("Login:");
        Label passwordLabel = new Label("Password:");

        // Create text fields for login and password
        TextField loginTextField = new TextField();
        PasswordField passwordField = new PasswordField();

        // Create a layout pane
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.add(loginLabel, 0, 0);
        root.add(loginTextField, 1, 0);
        root.add(passwordLabel, 0, 1);
        root.add(passwordField, 1, 1);

        // Create a scene
        Scene scene = new Scene(root, 1366, 768);

        // Set the scene on the stage
        primaryStage.setScene(scene);

        // Set the window title
        primaryStage.setTitle("Basic JavaFX App");

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
