import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavafxSample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // System.out.println(getClass().getResource("resource/fxml/main.fxml"));

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("resource/fxml/main.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        // scene.getStylesheets().add(getClass().getClassLoader().getResource("resource/css/style.css").toExternalForm());
        primaryStage.setTitle("JavaFX Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}