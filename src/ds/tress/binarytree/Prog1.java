package ds.tress.binarytree;

import java.util.Stack;
public class Prog1 {
    private TreeNode root;
    private class TreeNode {
            private int data;
            private TreeNode left ;
            private TreeNode right;

            public TreeNode(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(20);
        TreeNode third  = new TreeNode(30);
        TreeNode fourth = new TreeNode(40);
        TreeNode fifth = new TreeNode(50);

        root = first;
        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void PreOrederIterator(TreeNode root){
        if(root ==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data+"  ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
            
        }
    }


    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.createBinaryTree();
        p1.preOrder(p1.root);
    }
}
