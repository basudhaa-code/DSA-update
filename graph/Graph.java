import java.util.Scanner;

class Graphop {
    int node;
    int adjMatrix[][];

    Graphop(int node) {
        this.node = node;
        adjMatrix = new int[node][node];
    }

    public void AdjMatrixCreate(int a, int b) {
        adjMatrix[a][b] += 1 ;
        adjMatrix[b][a] += 1;
    }

    public void Display() {
        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean SimpleGraph(){
        for(int i = 0; i < node; i++ ){
            for(int j = 0; j < node; j++){
                if(adjMatrix[i][i] != 0 && adjMatrix[i][j] > 1)
                    return false;
            }
        }
        return true;
    }

    public boolean isRegular(){
        int prevdeg = 0;
        for(int i = 0; i < node; i++){
            int deg = 0;
            for(int j = 0; j < node; j++)
                deg = deg + adjMatrix[i][j];
            if(i == 0)
                prevdeg = deg;
            else if(prevdeg != deg)
                return false;
        }
        return true;
    }

}

public class Graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int node = sc.nextInt();
        Graphop gp = new Graphop(node);
        do {
            System.out.println("Do you want to add ?");
            int ch = sc.nextInt();
            if (ch == 0)
                break;
            System.out.println("Enter the nodes number ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            a--; // convert to 0-based
            b--;

            if (a < 0 || b < 0 || a >= node || b >= node) {
                System.out.println("Invalid node number");
                continue;
            }

            gp.AdjMatrixCreate(a, b);
        } while (true);

        gp.Display();
        if(gp.isRegular())
            System.out.println("regular graph");
        else
            System.out.println("Not a regular graph");

        if(gp.SimpleGraph())
            System.out.println("Simple graph");
        else
            System.out.println("Not a Simple graph");
    }
}
