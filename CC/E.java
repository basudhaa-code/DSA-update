import java.util.Scanner;

public class E {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();

      int x[] = new int[T];
      int y[] = new int[T];

      for(int i = 0; i <T; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            
      }
      int c = 0;
      for(int i = 0; i <T; i++){
        for(int j =i+1; j <T; j++){
            int v = (int)Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
            int d = (int)Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));

            if(v == d){
                c++;
            }
        }
      }

      System.out.println(c);
    }
}
