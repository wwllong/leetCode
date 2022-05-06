package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @version 1.0.0
 * @date 2022/5/6 11:38
 *
 * @see <a href="https://leetcode-cn.com/problems/roman-to-integer/">Q13-罗马数字转整数</a>
 */
public class RomanToInt {

    /**
     * 3ms(3999tc)
     */
    public static int romanToInt1(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0, n = chars.length; i < n; i++) {
            int current = romanValueOf(chars[i]);

            if(i < n - 1 && romanValueOf(chars[i]) < romanValueOf(chars[i + 1])) {
                result -= current;
            }else {
                result += current;
            }

        }
        return result;
    }

    private static Integer romanValueOf(Character roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
