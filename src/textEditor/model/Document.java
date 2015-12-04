package textEditor.model;

import org.apache.commons.io.FileUtils;
import textEditor.util.FileTools;

import java.io.File;
import java.io.IOException;

/**
 * Created by Robert Deignan on 02/12/15.
 * robert.deignan@outlook.com
 *
 * Model of a text document with associated methods for handling Document operations.
 */
public class Document {
    private String text;
    private String fileName;


    /**
     * Default constructor, sets text to a default string
     */
    public Document() {
        this.text = "";
        this.fileName = "untitled";
    }
    

    /**
     * Constructor
     * @param text String that will be assigned to the text variable.
     */
    public Document(String text) {
        this.text = text;
        this.fileName = "untitled";
    }


    /**
     * Returns a new document, returns null if no file selected.
     *
     * @param file File object whose contents will used to fill the Documents text variable.
     */
    public static Document openDoc(File file) {
        // Document that will be returned if file is not null
        Document doc;

        if (file != null) {
            // Instantiate a new Document with the contents of the file as its text
            doc = new Document(FileTools.fileToString(file));
            // Set Document.fileName to the name of the file being read
            doc.fileName = file.getName();
            return doc;
        }
        // If the file parameter was null, return null
        return null;
    }


    /**
     * Saves a document to file
     *
     * @param file File object where the Document's text variable will be written to.
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}