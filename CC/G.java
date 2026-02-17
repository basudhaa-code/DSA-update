import java.util.Scanner;

public class G {
    
    public static double log2(double n) {
        // Use Math.log (natural logarithm) or Math.log10
        return Math.log(n) / Math.log(2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t --  > 0) {
            double n = sc.nextDouble();
            long m = (long) log2(n);
            int num = (int)n;
            long two = (long) Math.pow(2.0,m);
            System.out.println(two + "tw0");
            long diff = num - two;

            long th = (long) Math.pow(2.0, m-1);
            long a = diff + th;
            if(num < two)
                a--;
            System.out.println(a);
        }
        /*while (t-- > 0) {
            double n =  sc.nextDouble();

            long m = (int)log2(n);
            
            System.out.println("m"+m);
            long c = (long)Math.pow(2.0, m-1) ;
            System.err.println("c" + c);
            long cm =  (int)Math.abs(n - Math.pow(2.0,m));
            System.out.println("cm" + cm);
            if(n == 2){
                System.out.println("0");
                continue;
            }
            if(cm == 0){
                System.out.println( c);
                continue;
            }
            else if(cm == 1 && n < (c*2)){
                System.out.println("THIS " + c);
                continue;
            } 
            else if(cm == 1 && n > (c*2)){
                c++;
                System.out.println("thssc" + c);
            }else{
                c--;
                long sum = c + cm;
                System.out.println("tHAT" + sum);
            }

        }        */
    }
}