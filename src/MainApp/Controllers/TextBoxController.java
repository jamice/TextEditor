package MainApp.Controllers;

import Document.Document;
import MainApp.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * Created by Robert Deignan on 01/12/15.
 * robert.deignan@outlook.com
 */
public class TextBoxController {
    private Main mainApp;
    @FXML private Document doc = new Document();
    @FXML private TextArea textBox;

    // Constructor, called before the intialize method
    public TextBoxController() { }

    // Initializes the class, called after the fxml file is loaded
    @FXML
    private void initialize() {
        textBox.setText(doc.getText());
    }

    // Called by the main app to give a reference back t itself
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

}
