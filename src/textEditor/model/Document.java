package textEditor.model;

import textEditor.util.FileTools;

import java.io.File;

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
     * Returns a new document
     */
    public static Document open(File file) {
        return new Document(FileTools.fileToString(file));
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
