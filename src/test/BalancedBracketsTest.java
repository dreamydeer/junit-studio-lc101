package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

//    @Test
//    public void containsBrackets() {
//
//    }

//    @Test
//    public void containsEmptyString() {
//        assertTrue(!BalancedBrackets.hasBalancedBrackets(""));
//    }

    @Test public void bracketsWithTextInMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("Launchcode")));
    }

    @Test
    public void bracketsStartIntheMiddleOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void bracketsFollowedByText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }

    @Test public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test public void openBracketFollowedByTextNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    @Test public void closeBracketInTheMiddleOfTextNoOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test public void onlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test public void onlyClosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test public void deepNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }



}
