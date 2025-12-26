
class PrintName{
    void Printname(int n){
        if(n==0)
            return;
        else{
            System.out.print("basudha");
            Printname(n-1);
        }
    }
}

public class Recursion1 {
    public static void main(String[] args) {
        PrintName obj = new PrintName();
        obj.Printname(12);
    }
}
