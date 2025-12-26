import java.util.Scanner;

class ArrayHandling{
    private int arr[];
    private int size;
    public ArrayHandling(int size){
        this.size = size;
        arr = new int[size];

    }

    public void CreateArray(){
        System.out.println("Enter the Array elements: ");
        for(int i=0; i<size; i++){
            System.out.println("The " + size + "element: ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();

        }
    }

    public void DisplayArray(int Size){
        System.out.println("The array elements are: ");
        for (int i=0;i<size; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public void InsertArray(int element, int position){
        position = position - 1;
        int i= size-1;
        while (i!=position){
            arr[i] = arr[i-1];
            i--;
        }
        arr[position] = element;
    }
}

class SortingAlgorithm {

    public void BubbleSort(int arr[], int size){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
            }
        }
    }

}

public class Sorting {
    public static void main(String args[]){
        
        System.out.println("Enter the number of elements for the Array: ");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        ArrayHandling arr = new ArrayHandling(n+1);

        arr.CreateArray();
        arr.DisplayArray(n);

        System.out.println("Enter the number you want to enter: ");
        int number = sc.nextInt();

        System.out.println("Enter the position you want to enter: ");
        int position = sc.nextInt();

        arr.InsertArray(number, position);
        arr.DisplayArray(n+1);

        System.out.println("Sorted Array: ");

        SortingAlgorithm obj = new SortingAlgorithm();

        obj.BubbleSort(obj.arr, n);
        System.out.println("\nArray after sorting:");
        ah.DisplayArray();

    }
}
