import java.util.*;

class ArrayOperation{
    int n;
    int arr[];
    ArrayOperation(int size){
        this.n = size;
        arr = new int[n];
    }

    void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array one by one: ");

        for(int i=0; i<n; i++){
            System.out.println("Enter the " + i +"th element");
            arr[i] = sc.nextInt();
        }
    }

    void displayArray(){
        System.out.println("Showing the array elements: ");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

     int SecondLargest
}


public class SecondLargest {
    
}
