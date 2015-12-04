package textEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import textEditor.view.MainTextAreaController;
import textEditor.view.RootLayoutController;

import java.io.IOException;

public class MainApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private MainTextAreaController mainTextAreaController;
    private RootLayoutController rootLayoutController;

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
            FXMLLoader rootLayoutLoader = new FXMLLoader();
            rootLayoutLoader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = rootLayoutLoader.load();

            // Give the controller access to mainApp
            rootLayoutController = rootLayoutLoader.getController();
            rootLayoutController.setMainApp(this);

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
            FXMLLoader mainTextAreaLoader = new FXMLLoader();
            mainTextAreaLoader.setLocation(MainApp.class.getResource("view/MainTextAreaLayout.fxml"));
            AnchorPane mainTextArea = mainTextAreaLoader.load();
            rootLayout.setCenter(mainTextArea);

            // Give the controller access to mainApp
            mainTextAreaController = mainTextAreaLoader.getController();
            mainTextAreaController.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { launch(args); }

    public MainTextAreaController getMainTextAreaController() {
        return mainTextAreaController;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}