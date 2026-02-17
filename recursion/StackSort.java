import java.util.*;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter data? press 1 for yes 0 for no");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter data");
                int d = sc.nextInt();
                st.push(d);
            } else {
                break;
            }
        }

        System.out.println("Original stack: " + st);

        sortStack(st);

        System.out.println("Sorted stack: " + st);
    }

    // Sort stack using recursion
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int val = st.pop();
        sortStack(st);
        insert(val, st);
    }

    // Insert element in sorted order
    public static void insert(int val, Stack<Integer> st) {
        if (st.isEmpty() || st.peek() <= val) {
            st.push(val);
            return;
        }

        int top = st.pop();
        insert(val, st);
        st.push(top);
    }
}
