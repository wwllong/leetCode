package com.wenwl.algorithm.leetcode.easy;

import com.wenwl.algorithm.leetcode.domain.ListNode;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">Q21-合并两个有序链表</a>
 */
public class MergeTwoSortedList {

    /**
     * m2(0ms, 208tc): 递归
     * Tn = O(n + m)，Sn = O(n + m)
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.val <= list2.val){
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }
    }

    /**
     * m1(0ms, 208tc): 迭代
     * Tn = O(n + m)，Sn = O(1)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);

        ListNode pre = preHead;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                pre.next = list1;
                list1 = list1.next;
            }else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;

        return preHead.next;
    }
}
