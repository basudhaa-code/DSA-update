import java.util.*;

public class ReverseAndPlaindriom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        Stack<Character> stk = new Stack<>();

        // push characters into stack
        for (int i = 0; i < n; i++) {
            stk.push(str.charAt(i));
        }

        // build reversed string
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());   // 🔥 pop, not peek
        }

        String rev = sb.toString();
        System.out.println("The reverse string is: " + rev);

        if (str.equals(rev))
            System.out.println("YES PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }
}
