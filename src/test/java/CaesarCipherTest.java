import static org.junit.Assert.*;
import org.junit.*;

public class CaesarCipherTest {

    @Test
    public void instantiates_correctly_with_subjectText() {
//        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
//        assertEquals("a", testCaesarCipher.getSubjectText());
//        assertEquals(1, testCaesarCipher.getKey());
        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }
}
