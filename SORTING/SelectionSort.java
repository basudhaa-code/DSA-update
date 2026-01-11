import java.util.Scanner;

class Array {
    int arr[];
    int n;

    Array(int n) {
        this.n = n;
        arr = new int[n];
    }

    void createArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    void displayArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        Array a = new Array(n);

        a.createArray();

        System.out.println("Before Sorting:");
        a.displayArray();

        a.bubbleSort();

        System.out.println("After Sorting:");
        a.displayArray();
    }
}
