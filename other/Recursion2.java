class PrintNum{
    int Sumnum(int n){
        if (n==0)
            return 0;
        else{
            return n + Sumnum(n-1);
        }
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        PrintNum obj = new PrintNum();
        System.out.println("the sum is " + obj.Sumnum(2));
    }
}
