package LeetCode;

public class Ex10 {
    public static void main(String[] args) {
        TreeNode root= new TreeNode();

    }
    public TreeNode balanceBST(TreeNode root){
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
