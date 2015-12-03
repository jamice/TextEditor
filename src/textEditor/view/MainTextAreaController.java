package textEditor.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import textEditor.MainApp;
import textEditor.model.Document;

/**
 * Created by Robert Deignan on 02/12/15.
 * robert.deignan@outlook.com
 */
public class MainTextAreaController {
    // Reference back to mainApp for access to public methods
    MainApp mainApp;

    @FXML
    private Document doc = new Document();
    @FXML
    private TextArea textArea;

    /**
     * Called automatically after the fxml file has been loaded.
     */
    private void initialize() {
    }


    /** Callled by the main application to give a reference back to itself
     * @param mainApp The main application class
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        textArea.setText(doc.getText());
    }
}
