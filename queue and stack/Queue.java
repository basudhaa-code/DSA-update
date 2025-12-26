import java.util.*;
class QueueDec {
    int front;
    int rear;
    QueueDec() {
        this.front = -1;
        this.rear = -1;
    }
}

class QueueOperation {
    ArrayList<Integer> Q;
    QueueDec info;

    QueueOperation() {
        Q = new ArrayList<>();
        info = new QueueDec();
    }

    public void Insert(int x) {
        // First element insertion
        if (info.front == -1) {
            info.front = 0;
            info.rear = 0;
            Q.add(x);
        } else {
            info.rear++;
            Q.add(x);
        }
    }

    public int deQueue() {
        if (info.front == -1) {
            throw new RuntimeException("Queue is empty!");
        }

        int val = Q.get(info.front);

        info.front++;

        // Queue becomes empty
        if (info.front > info.rear) {
            info.front = info.rear = -1;
        }

        return val;
    }

    public void display() {
        if (info.front == -1) {
            throw new RuntimeException("Queue is empty!");
        }

        for (int i = info.front; i <= info.rear; i++) {
            System.out.print(Q.get(i));
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueOperation qp = new QueueOperation();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter value to insert:");
                    int val = sc.nextInt();
                    qp.Insert(val);
                    break;

                case 2:
                    System.out.println("Deleting...");
                    try {
                        System.out.println("Deleted: " + qp.deQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Queue elements:");
                        qp.display();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}