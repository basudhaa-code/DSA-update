import java.util.*;

public class ExtendedE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
            // Initialize the value of all the variable accordingly 
        int a = 0, b =1;
        int a1 = b, b1 = a;
        int c = num1;
        int d = num2;
        int r,q; // quotient and remainder when c is divided  by d
        do{
            r = c % d;
            q = c / d;

            c =d;
            d = r;
            int t = a1;
            a1=a;
            a =t -q*a;
            t = b1;
            b1=b; 
            b= t - q*b;
        }while(r!=0);

    System.out.println("the  value of d is " + d);
    }
}