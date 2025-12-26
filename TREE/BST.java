import java.util.Scanner;

class Tree {
    int Val;
    Tree left;
    Tree right;

    Tree(int x) {
        this.left = null;
        this.right = null;
        this.Val = x;
    }
}

class BSToperation {

    public static Tree insert(Tree root, int x) {
        if (root == null)
            return new Tree(x);

        if (x < root.Val) {
            root.left = insert(root.left, x);
        } else {
            root.right = insert(root.right, x);
        }
        return root;
    }

    public static Tree insertIteration(Tree root, int x) {

        Tree newNode = new Tree(x);

        if (root == null)
            return newNode;

        Tree parent = null;
        Tree curr = root;

        while (curr != null) {
            parent = curr;
            if (x < curr.Val)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if (x < parent.Val)
            parent.left = newNode;
        else
            parent.right = newNode;

        return root;
    }

    public static void DeleteNode(Tree Root,int x){
        Tree ptr = Root;
        if(Root == null)
            return -1;
        while(ptr != null && ptr.Val != x) {
            if(ptr.Val > x)
                ptr = ptr.left;
            else
                ptr = ptr.right;
        }

        if(ptr == null)
            return Root;
        
        
        
    }

    public static void InOrder(Tree Root) {
        if (Root == null)
            return;
        InOrder(Root.left);
        System.out.print(Root.Val + " ");
        InOrder(Root.right);
    }

    public static boolean LookUp(int val, Tree Root) {
        if (Root == null)
            return false;

        if (Root.Val == val)
            return true;

        if (val < Root.Val)
            return LookUp(val, Root.left);
        else
            return LookUp(val, Root.right);
    }

    public static int Height(Tree Root) {
        if (Root == null)
            return 0;
        else {
            int left_height = Height(Root.left);
            int right_height = Height(Root.right);

            return (1 + Math.min(left_height, right_height));
        }
    }
}

public class BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        Tree Root = null;

        do {
            System.out.println("Do you want to enter any data ?? (1/0)");
            ch = sc.nextInt();
            if (ch == 0)
                break;

            System.out.println("Enter the data: ");
            int data = sc.nextInt();

            Root = BSToperation.insertIteration(Root, data);

        } while (true);

        System.out.println("Inorder Traversal:");
        BSToperation.InOrder(Root);

        System.out.println("Enter the value to search");
        int value = sc.nextInt();
        if (BSToperation.LookUp(value, Root))
            System.out.println("found");
        else
            System.out.println("not found");

        System.out.println("the height is " + BSToperation.Height(Root));
    }
}
