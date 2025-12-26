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

     void reverseArray(int i) {
        if (i >= n / 2)
            return;

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseArray(i + 1);
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        n = sc.nextInt();

        ArrayOperation obj =  new ArrayOperation(n);
        obj.inputArray();
        obj.displayArray();
        obj.reverseArray(0);
        obj.displayArray();
    }
}
