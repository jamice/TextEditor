package textEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import textEditor.model.Document;
import textEditor.view.MainTextAreaController;

import java.io.IOException;

public class MainApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private Document doc = new Document();

    /**
     * Constructor
     */
    public MainApp() { }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TextEditor");
        initRootLayout();
        initMainTextArea();
    }


    /**
     * Initialize the root layout including main menu bar.
     */
    public void initRootLayout() {
        try {
            // Load the rootLayout fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Initialize the main text area.
     */
    public void initMainTextArea() {
        try {
            // Load the mainTextArea fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/MainTextAreaLayout.fxml"));
            AnchorPane mainTextArea = loader.load();
            rootLayout.setCenter(mainTextArea);

            // Give the controller access to mainApp
            MainTextAreaController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { launch(args); }

    public Document getDoc() {
        return this.doc;
    }
}