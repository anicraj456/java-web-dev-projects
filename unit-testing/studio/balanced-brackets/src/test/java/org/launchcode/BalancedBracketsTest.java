package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //true

    @Test
    public void emptyString(){
        String message =" empty string return false";
        String testChar = " ";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void prefectString(){
        String message = "prefect string return false";
        String testChar = "Lanchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void stringWithinBrackets(){
        String message = "string wrapped around set of brackets return true";
        String testChar = "[Launchcode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void setOfBracketsNextToString(){
        String message = " set of brackets next to string return true";
        String testChar = "[]Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void setOfBrackets(){
        String message = " set of brackets  return true";
        String testChar = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void nestedBrackets(){
        String message = " Nested brackets return true";
        String testChar = "[[]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void bracketsInMiddle(){
        String message = " set of brackets in middle of the string return true";
        String testChar = "Launch[code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void multipleNestedBrackets(){
        String message = " Multiple nested brackets  return true";
        String testChar = "[[]][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }
    @Test
    public void multipleBrackets(){
        String message =" set of multiple brackets  return true";
        String testChar = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertTrue(result,message);
    }

    //False
    @Test
    public void singleBracket(){
        String message =" single brackets return false";
        String testChar = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void closingBracket(){
        String message = "closing brackets return false";
        String testChar = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void openingBracketAlone(){
        String message =" opening brackets before words return false";
        String testChar = "[Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void closingBracketString(){
        String message =" closing brackets between string return false";
        String testChar = "Launch]code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void messyBrackets(){
        String message = "unordered brackets return false";
        String testChar = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void oppDirectionBracket(){
        String message =" opposite direction brackets return false";
        String testChar = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
    @Test
    public void misplacedBrackets(){
        String message =" set of brackets misplaced in string return false";
        String testChar = "Launch]code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testChar);
        assertFalse(result,message);
    }
}