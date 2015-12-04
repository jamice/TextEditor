package textEditor.model;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;
import textEditor.util.FileTools;

import java.io.File;
import java.io.IOException;

/**
 * Created by Robert Deignan on 02/12/15.
 * robert.deignan@outlook.com
 */
public class Document {
    private String text;


    /**
     * Default constructor, sets text to a default string
     */
    public Document() {
        text = "Default string.";
    }
    

    /**
     * Constructor
     * @param text String that will be assigned to the text variable.
     */
    public Document(String text) {
        this.setText(text);
    }


    /**
     * Returns a new document, returns null if no file selected.
     */
    public static Document openDoc(File file) {

        if (file != null) {
            return new Document(FileTools.fileToString(file));
        } else {
            return null;
        }
    }

    /**
     * Saves a document to file
     */
    public void saveDoc(File file) {
        if (file != null) {
            try {
                FileUtils.writeStringToFile(file, this.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Getters and setters.
     */
    public String getText() {
        return text;
    }

    public void setText(String currentText) {
        this.text = currentText;
    }
}
