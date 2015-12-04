package textEditor.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;
import textEditor.MainApp;
import textEditor.model.Document;

import java.io.File;
import java.io.IOException;

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
     * Open and display a document
     */
    @FXML
    public void handleOpen() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        File file = chooser.showOpenDialog(new Stage());

        // Prevents the document being cleared if the open dialog box is opened
        // then closed without selecting a file
        if (file != null) {
            mainApp.getMainTextAreaController().setDoc(Document.open(file));
            mainApp.getMainTextAreaController().updateText();
        }
    }


    /**
     * Save a document to file
     */
    @FXML
    public void handleSave() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save File");
        File file = chooser.showSaveDialog(new Stage());

        try {
            if (file != null) {
                FileUtils.writeStringToFile(
                        file,
                        mainApp.getMainTextAreaController().getDoc().getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Exits the application.
     */
    @FXML
    public void handleExit() {
        System.exit(0);
    }


    /**
     * Called by the main application to give a reference back to itself
     *
     * @param mainApp The main application class
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
