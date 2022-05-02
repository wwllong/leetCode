package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.ClimbingStairs;
import junit.framework.TestCase;
import org.junit.Test;

public class ClimbingStairsTest {

    private ClimbingStairs climbingStairs = new ClimbingStairs();

    private final int n1 = 2;
    private final int expected1 = 2;

    private final int n2 = 3;
    private final int expected2 = 3;

    @Test
    public void test6(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs6(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs6(n2));
    }


    @Test
    public void test5(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs5(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs5(n2));
    }

    @Test
    public void test4(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs4(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs4(n2));
    }

    @Test
    public void test3(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs3(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs3(n2));
    }

    @Test
    public void test2(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs2(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs2(n2));
    }

    @Test
    public void test1(){
        TestCase.assertEquals(expected1, climbingStairs.climbStairs1(n1));
        TestCase.assertEquals(expected2, climbingStairs.climbStairs1(n2));
    }

}
