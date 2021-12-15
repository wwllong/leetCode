package com.wenwl.algorithm.leetcode.domain;

import java.util.List;

/**
 * Definition for singly-linked list.
 * @author: wenwl
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode... next) {
        this.val = val;
        this.setNextNodes(next);
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String printList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val);
        ListNode next = this.next;
        while(next != null) {
            stringBuilder.append(next.val);
            next = next.next;
        }
        return stringBuilder.toString();
    }

    public ListNode setNextNodes(ListNode... next){
        ListNode current = this;
        for (ListNode node : next) {
            current.next = node;
            current = node;
        }
        return this;
    }

}
