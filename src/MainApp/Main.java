package MainApp;

import Document.Document;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private BorderPane root;
    Document doc = new Document();

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("Views/rootLayout.fxml"));

        primaryStage.setTitle("TextEditor");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
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
        TextArea textArea = new TextArea();
        textArea.setText(doc.getText());
        textArea.setPadding(new Insets(10, 10, 10, 10));
        textArea.setMaxWidth(600);
        textArea.setWrapText(true);
        root.setCenter(textArea);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
