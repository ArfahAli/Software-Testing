package org.example;
import junit.framework.TestCase;
import org.junit.Test;
public class PalindromeCheckTest extends TestCase {
    @Test
    public void test_empty_string() {
        assertFalse(PalindromeCheck.isPalindrome(""));
    }
    @Test
    public void test_one_Character() {
        assertTrue(PalindromeCheck.isPalindrome("s"));
    }
    @Test
    public void test_2_diff_Characters() {
        assertTrue(PalindromeCheck.isPalindrome("ty"));
    }
    @Test
    public void test2_same_Characters() {
        assertTrue(PalindromeCheck.isPalindrome("zz"));
    }
    @Test
    public void test_a_word_that_is_Palindrome() {
        assertTrue(PalindromeCheck.isPalindrome("mam"));
    }
    @Test
    public void test_a_word_that_is_not_a_Palindrome() {
        assertFalse(PalindromeCheck.isPalindrome("arfah"));
    }
    @Test
    public void test_special_characters() {
        assertTrue(PalindromeCheck.isPalindrome("!!"));
    }



}
