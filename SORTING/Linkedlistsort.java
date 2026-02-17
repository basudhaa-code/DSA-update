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

    void BubbleSort(int n){
        NODE ptr1,ptr2;
        for(int i = 0; i < n; i++){
            ptr1 = Start;
            ptr2 = Start.link;
            if(ptr1.data > ptr2.data){
                NODE temp = ptr2.link;
                ptr2 = ptr1;
                ptr1.link = temp;
            }
            ptr1 = ptr1.link;
            ptr2 = ptr2.link;
        }
    }
}


public class Linkedlistsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("If you want to add data press 1 else press 0");
            int ch = sc.nextInt();
            
        }
    }
    
}