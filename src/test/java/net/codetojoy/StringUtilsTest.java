package net.codetojoy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {
    @Test
    public void testReverseString_withMultipleCharacters() {
        StringUtils stringUtils = new StringUtils();
        String input = "abc";

        String result = stringUtils.reverseString(input); // test

        assertEquals("cba", result);
    }

    @Test
    public void testReverseString_withEmptyString() {
        StringUtils stringUtils = new StringUtils();
        String input = "";

        String result = stringUtils.reverseString(input); // test

        assertEquals("", result);
    }

    @Test
    public void testReverseString_withSingleCharacter() {
        StringUtils stringUtils = new StringUtils();
        String input = "a";

        String result = stringUtils.reverseString(input); // test

        assertEquals("a", result);
    }

    @Test
    public void testReverseString_withFourCharacters() {
        StringUtils stringUtils = new StringUtils();
        String input = "abcd";

        String result = stringUtils.reverseString(input); // test

        assertEquals("dcba", result);
    }

    @Test
    public void testReverseString_withNull() {
        StringUtils stringUtils = new StringUtils();

        String result = stringUtils.reverseString(null); // test

        assertNull(result);
    }
}
