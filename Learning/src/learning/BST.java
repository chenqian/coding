/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 * @Author chen qian @Edit Time 6:37:56 PM
 */
public class BST {

    public static Boolean IsBST(BNode node) {
        return IsBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static Boolean IsBSTHelper(BNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }
        return IsBSTHelper(node.left, min, node.data - 1) && IsBSTHelper(node.right, node.data + 1, max);
    }
    public static int IsBalHelper(BNode node) {
        if (node == null) {
            return 0;
        }

        int LeftHeight = IsBalHelper(node.left);
        if (LeftHeight == -1) {
            return -1;
        }

        int RightHeight = IsBalHelper(node.right);
        if (RightHeight == -1) {
            return -1;
        }

        if (Math.abs(LeftHeight - RightHeight) > 1) {
            return -1;
        } else {
            return Math.max(LeftHeight, RightHeight) + 1;
        }

    }

    public static Boolean IsBalance(BNode node) {
        if (IsBalHelper(node) == -1) {
            return false;
        }
        return true;
    }
}
