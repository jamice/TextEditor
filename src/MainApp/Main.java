package MainApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private BorderPane root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("Views/rootLayout.fxml"));
        primaryStage.setTitle("TextEditor");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);

        primaryStage.show();
        showMenuBar();
    }

    public void showMenuBar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Views/menuBar.fxml"));
            MenuBar menu = loader.load();
            root.setTop(menu);
        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
