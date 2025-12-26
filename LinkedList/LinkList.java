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

public class LinkList {
    public static void main(String[] args) {
        ListOperation list = new ListOperation();
        list.insertEnd(23);
        list.insertEnd(34);
        list.insertBeg(233);
        list.insertBeg(323);
        list.Display();
        System.out.println("deleted = " + list.Delete());
    }
}
