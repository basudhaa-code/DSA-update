import java.util.Scanner;

class NODE {
    int data;
    NODE link;

    NODE(int data) {
        this.data = data;
        this.link = null;
    }
}

class ListOperation {
    NODE Start;

    void insertBeg(int data){
        NODE newNode = new NODE(data);
        if (Start == null) {
            Start = newNode;
            return;
        }
        
        newNode.link = Start;
        Start = newNode;
        
        
    }

    void insertEnd(int data) {
        NODE newNode = new NODE(data);

        if (Start == null) {
            Start = newNode;
            return;
        }

        NODE ptr = Start;
        while (ptr.link != null) {
            ptr = ptr.link;
        }

        ptr.link = newNode;
    }

    void Display() {
        NODE ptr = Start;
        while (ptr != null) {
            System.out.println("data: " + ptr.data);
            ptr = ptr.link;
        }
    }

    int Delete(){
        if(Start == null)
            return 0;
        int x = Start.data;
        Start = Start.link;
        return x;

    }
}

class StackOperation{
    boolean isEmpty(){
        if(Start == null)
            return true;
        return false;
    }

    void Push(int x  ){
        ListOperation lt = new ListOperation();
        lt.insertBeg(x);
    }

    void Pop(){
        ListOperation lt = new ListOperation();
        lt.Delete();
    }
    void Display(){
        ListOperation lt = new ListOperation();
        lt.Display();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Do you want to enter any data ?");
            int ch = sc.nextInt();
            if(ch == 0)
                break;
            System.out.println("Enter the value");
            int val = sc.nextInt();
            StackOperation stk = new StackOperation();
            stk.Push(val);
            stk.Pop();
            stk.Display();
        }
        
    }
}