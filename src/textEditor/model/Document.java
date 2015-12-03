package textEditor.model;

/**
 * Created by Robert Deignan on 02/12/15.
 * robert.deignan@outlook.com
 */
public class Document {
    private String currentText = "default string.";

    public String getCurrentText() {
        return currentText;
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
