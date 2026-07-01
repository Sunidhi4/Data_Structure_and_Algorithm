import java.util.*;
public class BST04
{
    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node createBST(int [] arr, int st, int end)
    {
        if(st > end)
        {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node (arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder)
    {
        if(root == null)
        {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node balanceBST(Node root)
    {
        //inorder seq
        ArrayList<Integer>inorder = new ArrayList<>();
        getInorder(root, inorder);
        //sorted inorder -> balanced BSt
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
     public static void main ( String args[]) 
{
     Node root = new Node(8);
     root.left = new Node(6);
     root.left.left = new Node(5);
     root.left.left.left = new Node(3);
     root.right = new Node(10);
     root.right.right = new Node(11);
     root.right.right.right = new Node (12);

     balanceBST(root);
} 
 } 