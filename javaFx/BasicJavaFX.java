import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BasicJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label label = new Label("Hello, Welcome to JavaFX!");
        label.setLayoutX(50);
        label.setLayoutY(30);

        // Create a button
        Button button = new Button("Click Me");
        button.setLayoutX(90);
        button.setLayoutY(80);

        // Create a pane and add components
        Pane root = new Pane();
        root.getChildren().addAll(label, button);

        // Create a scene and add it to the stage
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("My First JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}