import java.util.*;
public class Bst03
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

    public static Node createBST(int arr[], int st, int end)
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

    public static void printpreorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        printpreorder(root.left);
        printpreorder(root.right);
    }

    
     public static void main ( String args[]) 
{
     int arr[] = {3, 5, 6, 8, 10, 11, 12};
     int l = arr.length - 1;
     Node root = createBST(arr, 0, l);
    printpreorder(root);
    System.out.println();
} 
 } 