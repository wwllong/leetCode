package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.ValidParentheses;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void test(){
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
        assertTrue(validParentheses.isValid("{[]}"));
    }

}
