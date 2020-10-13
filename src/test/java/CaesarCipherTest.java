//import static org.junit.Assert.*;
//import org.junit.*;
//
//public class CaesarCipherTest {
//
//    @Test
//    public void instantiates_correctly_with_subjectText() {
////        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
////        assertEquals("a", testCaesarCipher.getSubjectText());
////        assertEquals(1, testCaesarCipher.getKey());
//        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
//        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
//    }
//}
import static org.junit.Assert.*;

import org.junit.*;

public class CaesarCipherTest {

    @Test
    public void test_instanceOfClassCaesarCipher_true(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void encrypts_a_single_lowercase_letter_word_with_positive_within_bounds_key(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",3);
        assertEquals("d", testCaesarCipher.getCipherText());
    }


    @Test
    public void encrypts_single_uppercase_letter_correctly(){
        CaesarCipher testCaesarCipher = new CaesarCipher("B",27);
        assertEquals("C", testCaesarCipher.getCipherText());
    }

    @Test
    public void encrypts_a_single_letter_word_with_positive_out_of_bounds_key(){
        CaesarCipher testCaesarCipher = new CaesarCipher("b",27);
        assertEquals("c", testCaesarCipher.getCipherText());
    }
    @Test
    public void encrypts_multi_character_word_character(){
        CaesarCipher testCaesarCipher = new CaesarCipher("joseph",1);
        assertEquals("kptfqi", testCaesarCipher.getCipherText());
    }
    @Test
    public void decode_reverseEncode_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("kptfqi", 1);
        assertEquals("joseph", testCaesarCipher.getPlainText());
    }














}