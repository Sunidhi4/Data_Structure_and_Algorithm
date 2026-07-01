Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high); 
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
}

* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    int ans;
 
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
 
    public void inorder(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        inorder(root.left, k);
        count++;
        if(count == k) {
            ans = root.val;
            return;
        }       
        inorder(root.right, k);       
    }
}
* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = Integer.MAX_VALUE;
    int prev = -1;
 
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return ans;
 
        getMinimumDifference(root.left);
 
        if (prev != -1) {
            ans = Math.min(ans, root.val - prev);
        }
        prev = root.val;
 
        getMinimumDifference(root.right);
 
        return ans;
    }
}Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = Integer.MAX_VALUE;
    int prev = -1;
 
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return ans;
 
        getMinimumDifference(root.left);
 
        if (prev != -1) {
            ans = Math.min(ans, root.val - prev);
        }
        prev = root.val;
 
        getMinimumDifference(root.right);
 
        return ans;
    }
}
Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
 
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) { 
            return true;
        }
        if (root.val >= maxVal || root.val <= minVal) {
            return false;
        }
 
        boolean isLeftValid = isValidBST(root.left, minVal, root.val);
        boolean isRightVaild = isValidBST(root.right, root.val, maxVal);
        return isLeftValid && isRightVaild;
    }
}

Pastebin
Search...

Login Sign up
Advertisement

Guest User
Untitled
a guest
Jan 9th, 2025
30
0
Neve