package hashing.tests;

import hashing.FirstNonRepeatingChar;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstNonRepeatingCharTest {

    @Test
    public void testFirstNonRepeatingChar() {
        assertEquals((Character) 'w', FirstNonRepeatingChar.firstNonRepeatingChar("swiss"));
        assertEquals((Character) 'l', FirstNonRepeatingChar.firstNonRepeatingChar("alphabet"));
        assertNull(FirstNonRepeatingChar.firstNonRepeatingChar("aabbcc"));
        assertEquals((Character) 'e', FirstNonRepeatingChar.firstNonRepeatingChar("aabbccdde"));
    }

    @Test
    public void testEmptyString() {
        assertNull(FirstNonRepeatingChar.firstNonRepeatingChar(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertEquals((Character) 'a', FirstNonRepeatingChar.firstNonRepeatingChar("a"));
    }
}
