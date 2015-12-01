package MainApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private BorderPane root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("Views/rootLayout.fxml"));

        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(600);
        primaryStage.setX(50);
        primaryStage.setY(50);
        primaryStage.setTitle("TextEditor");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(false);
        primaryStage.show();

        showTextArea();
        showMenuBar();
    }

    public void showMenuBar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Views/menuBar.fxml"));
            MenuBar menu = loader.load();
            root.setTop(menu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showTextArea() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Views/textBoxLayout.fxml"));
            VBox textArea = loader.load();
            root.setCenter(textArea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
