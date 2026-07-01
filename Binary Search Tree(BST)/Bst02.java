import java.util.*;
public class Bst02
{
    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node (int data)
        {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }
        else
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

 public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0; i<path.size(); i++)
        {
            System.out.print(path.get(i)+" ");
        }

        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return ;
        }

        path.add(root.data);
        if(root.left == null && root.right == null)
        {
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }

        if(min != null && root.data <= min.data)
        {
            return false;
        }
        else if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node createMirror(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preorder(Node root)
    {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    
     public static void main ( String args[]) 
{
      int values[] = {3, 5, 6, 8, 10, 11, 12};
     Node root = null;
     
     for(int i=0; i<values.length; i++)
     {
        root = insert(root, values[i]);
     }
    ArrayList<Integer> Al = new ArrayList<>();
      printRoot2Leaf(root, Al);
     Node min = new Node (Integer.MIN_VALUE);
     Node max = new Node (Integer.MAX_VALUE);
      System.out.println(isValidBST(root, min, max));
      preorder(root);
      System.out.println();
     root = createMirror(root);
     preorder(root);
} 
 } 