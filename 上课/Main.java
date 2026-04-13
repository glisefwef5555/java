public class Main {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 叶子节点
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minDepth = Integer.MAX_VALUE;
        // 左子树存在时计算
        if (root.left != null) {
            minDepth = Math.min(minDepth(root.left), minDepth);
        }
        // 右子树存在时计算
        if (root.right != null) {
            minDepth = Math.min(minDepth(root.right), minDepth);
        }
        return minDepth + 1;
    }

    // 程序入口 main 方法
    public static void main(String[] args) {
        Main solution = new Main();
        // 测试用例：构造一个简单二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        // 输出最小深度，预期结果为 3
        System.out.println("最小深度为：" + solution.minDepth(root));
    }
}