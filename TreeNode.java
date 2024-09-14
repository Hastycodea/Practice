import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode right, TreeNode left) {
        this.val = val;
        this.right = right;
        this.left = left;
    };

}

class Solution {
    
    public List<Integer> leavesCollector(TreeNode root, List<Integer> leaf) {
        if(root == null) return leaf;

        if(root.left == null && root.right == null) leaf.add(root.val);

        leaf = leavesCollector(root.left, leaf);
        leaf = leavesCollector(root.right, leaf);

        return leaf;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = leavesCollector(root1, new ArrayList<>());
        List<Integer> leaf2 = leavesCollector(root2, new ArrayList<>());

        return leaf1.equals(leaf2);
    }
}
