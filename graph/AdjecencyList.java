class Node{
    int val;
    Node next = null;

    Node(int Val){
        this.val = Val;
        this.next = null;
    }
}

class LinkedLiST{

    Node Start;

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (Start == null) {
            Start = newNode;
            return;
        }

        Node ptr = Start;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = newNode;
    }
}


class Graph{
    int nodes;
    Node AdjList[];


    Graph(int nodes){
        this.nodes = nodes;
        AdjList = new Node[nodes];
    }

   void addEdge(int a, int b) {
        // Add b to a's adjacency list
        Node newNode1 = new Node(b);
        newNode1.next = AdjList[a];
        AdjList[a] = newNode1;

        // Add a to b's adjacency list (since it's undirected)
        Node newNode2 = new Node(a);
        newNode2.next = AdjList[b];
        AdjList[b] = newNode2;
    }

    // Optional: method to print the adjacency list
    void printAdjacencyList() {
        for (int i = 0; i < nodes; i++) {
            System.out.print("Vertex " + i + ":");
            Node current = AdjList[i];
            while (current != null) {
                System.out.print(" -> " + current.val);
                current = current.next;
            }
            System.out.println();
        }
    }
}
public class AdjecencyList {
    public static void main(String[] args) {
        // Example usage
        Graph graph = new Graph(5);
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.printAdjacencyList();
    }
}