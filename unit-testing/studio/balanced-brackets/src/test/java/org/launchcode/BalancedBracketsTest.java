package org.launchcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //1
    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //2
    @Test
    public void bracketsWithOneCharReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
    }

    //3
    @Test
    public void openBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

//    //failing 3 for test case
//    @Test
//    public void openBracketsReturnTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("["));
//    }

    //4
    @Test
    public void onlyClosingBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //5
    @Test
    public void curlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}]"));
    }

    //6
    @Test
    public void bracketsOutOfOrderReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

//    //failing 6 for test case
//    @Test
//    public void bracketsOutOfOrderReturnTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
//    }

    //7
    @Test
    public void bracketsAroundLaunchReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]code"));
    }

    //8
    @Test
    public void extraBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

//    //failing 8 for test case
//    @Test
//    public void extraBracketReturnTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[]["));
//    }

    //9
    @Test
    public void multipleSetsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    //10
    @Test
    public void nestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    //11
    @Test
    public void bracketsAroundCodeReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    //12
    @Test
    public void multipleBracketsInStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[st] Te[st]"));
    }
}

/*
 * The function BalancedBrackets should return true if and only if
 * the input string has a set of "balanced" brackets.
 *
 * That is, whether it consists entirely of pairs of opening/closing
 * brackets (in that order), none of which mis-nest. We consider a bracket
 * to be square-brackets: [ or ].
 *
 * The string may contain non-bracket characters as well.
 *
 * These strings have balanced brackets:
 *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
 *
 * While these do not:
 *   "[LaunchCode", "Launch]Code[", "[", "]["
 *
 * @param str - to be validated
 * @return true if balanced, false otherwise
 */
