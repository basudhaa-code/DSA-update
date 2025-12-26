//program for factorial of a number.

class RecursionFunc{
    int Func(int n){
        if(n==1)
            return 1;
        else
            return n*Func(n-1);
    }
}

public class Recursion{
    public static void main(String[] args) {
        RecursionFunc obj = new RecursionFunc();
        int fact = obj.Func(5);

        System.out.println("the factorial : " + fact);
    }
}