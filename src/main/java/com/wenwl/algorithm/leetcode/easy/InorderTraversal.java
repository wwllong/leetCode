package com.wenwl.algorithm.leetcode.easy;

import com.wenwl.algorithm.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">Q94-二叉树的中序遍历</a>
 */
public class InorderTraversal {

    /**
     * m3(0ms, 70tc): 去掉栈，降低空间复杂度，详细见官方解答
     * Tn = O(n)，Sn = O(1)
     */
    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode predecessor = null;

        while (root != null) {
            if (root.left != null) {
                // predecessor 节点就是当前 root 节点向左走一步，然后一直向右走至无法走为止
                predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                // 让 predecessor 的右指针指向 root，继续遍历左子树
                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                }
                // 说明左子树已经访问完了，我们需要断开链接
                else {
                    res.add(root.val);
                    predecessor.right = null;
                    root = root.right;
                }
            }
            // 如果没有左孩子，则直接访问右孩子
            else {
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }

    /**
     * m2(0ms, 70tc): 解递归，使用迭代，手动维护栈
     * Tn = O(n)，Sn = O(n)
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    /**
     * m(0ms, 70tc): 经典递归
     * Tn = O(n)，Sn = O(n)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }


}
