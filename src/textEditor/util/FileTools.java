package textEditor.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Robert Deignan on 03/12/15.
 * robert.deignan@outlook.com
 */
public class FileTools {

    /**
     * Returns a string containing the text read from the file a the location
     * passed to the method.
     *
     * @param file file to be read to a string
     * @return A string containing the text from the specified file
     */
    public static String loadTextToString(File file) {
        String str;
        try {
            str = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return str;
    }
}
