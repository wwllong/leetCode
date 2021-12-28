package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.domain.ListNode;
import com.wenwl.algorithm.leetcode.easy.MergeTwoSortedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MergeTwoSortedListTest {

    private MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

    ListNode list1 = new ListNode(1,
            new ListNode(2),
            new ListNode(3));
    ListNode list2 = new ListNode(1,
            new ListNode(3),
            new ListNode(4));
    ListNode expected1 = new ListNode(1,
            new ListNode(1),
            new ListNode(2),
            new ListNode(3),
            new ListNode(3),
            new ListNode(4)
    );

    ListNode list3 = null;
    ListNode list4 = new ListNode(0);
    ListNode expected2 = new ListNode(0);

    @Test
    public void test2(){
        assertEquals(expected1, mergeTwoSortedList.mergeTwoLists2(list1, list2));
        assertNull(mergeTwoSortedList.mergeTwoLists2(null, null));
        assertEquals(expected2, mergeTwoSortedList.mergeTwoLists(list3, list4));
    }

    @Test
    public void test1(){
        assertEquals(expected1, mergeTwoSortedList.mergeTwoLists(list1, list2));
        assertNull(mergeTwoSortedList.mergeTwoLists(null, null));
        assertEquals(expected2, mergeTwoSortedList.mergeTwoLists(list3, list4));
    }

}
