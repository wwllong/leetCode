package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.domain.TreeNode;
import com.wenwl.algorithm.leetcode.easy.InorderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InorderTraversalTest {

    private final InorderTraversal inorderTraversal = new InorderTraversal();

    private final TreeNode tc1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    private final List<Integer> expected1 = Arrays.asList(1, 3, 2);

    @Test
    public void test3(){
        List<Integer> integers = inorderTraversal.inorderTraversal3(tc1);
        Assert.assertArrayEquals(expected1.toArray(), integers.toArray());
    }

    @Test
    public void test2(){
        List<Integer> integers = inorderTraversal.inorderTraversal2(tc1);
        Assert.assertArrayEquals(expected1.toArray(), integers.toArray());
    }

    @Test
    public void test1(){
        List<Integer> integers = inorderTraversal.inorderTraversal(tc1);
        Assert.assertArrayEquals(expected1.toArray(), integers.toArray());
    }

}
