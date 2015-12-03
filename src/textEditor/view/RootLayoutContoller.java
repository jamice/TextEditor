package textEditor.view;

import javafx.fxml.FXML;
import textEditor.MainApp;

/**
 * Created by Robert Deignan on 03/12/15.
 * robert.deignan@outlook.com
 */
public class RootLayoutContoller {
    // Reference back to mainApp for access to public methods
    MainApp mainApp;


    /**
     * Clears all text from the main text area.
     */
    @FXML
    public void handleClear() {
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
