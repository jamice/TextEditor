package textEditor.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import textEditor.MainApp;

/**
 * Created by Robert Deignan on 03/12/15.
 * robert.deignan@outlook.com
 */
public class RootLayoutController {
    // Reference back to mainApp for access to public methods
    MainApp mainApp;

    public void initialize() {
    }


    /**
     * Clears all text from the main text area.
     */
    @FXML
    public void handleClear() {
        mainApp.getMainTextAreaController().getTextArea().clear();
    }


    /**
     * Exits the application.
     */
    @FXML
    public void handleExit() {
        System.exit(0);
    }


    /**
     * Callled by the main application to give a reference back to itself
     *
     * @param mainApp The main application class
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
