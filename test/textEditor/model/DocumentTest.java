package textEditor.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robert Deignan on 04/12/15.
 * robert.deignan@outlook.com
 */
public class DocumentTest {

    Document documentDefault;
    Document documentString;

    @Before
    public void setUp() throws Exception {
        documentDefault = new Document();
        documentString = new Document("test string");
    }

    @Test
    public void testDocument() throws Exception {
        assertEquals("Default constructor sets @name to 'untitled'", "untitled", documentDefault.getFileName());
        assertEquals("String constructor sets @name to 'untitled'", "untitled", documentString.getFileName());
        assertEquals("Default constructor sets @text to empty string", "", documentDefault.getText());
        assertEquals("Default constructor sets @text to empty string", "test string", documentString.getText());

    }

    @Test
    public void testOpenDoc() throws Exception {
        assertEquals("Null file parameter returns null.", null, Document.openDoc(null));
    }

    @Test
    public void testSaveDoc() throws Exception {

    }
}