package com.wenwl.algorithm.leetcode.easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/valid-parentheses/">Q20-有效的括号</a>
 */
public class ValidParentheses {

    /**
     * m1(2ms, 91tc): 栈-先进后出的特点
     * Tn = O(n)，Sn = O(n+∣Σ∣)，∣Σ∣=6
     */
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1){
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
               stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}
