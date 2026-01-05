import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("output: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();
            if(stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();

            stack.push(arr[i]);

        }

        for(int i = 0; i < n; i++){
            System.out.print(result[i]);
        }


        
    }
    
}
