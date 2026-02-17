import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        sortArray(nums, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Recursive sort function
    public static void sortArray(int[] arr, int n) {

        // base case
        if (n <= 1) {
            return;
        }

        // sort first n-1 elements
        sortArray(arr, n - 1);

        // insert last element at correct position
        int last = arr[n - 1];
        insert(arr, n - 2, last);
    }

    // Recursive insert function
    public static void insert(int[] arr, int i, int key) {

        // base case
        if (i < 0 || arr[i] <= key) {
            arr[i + 1] = key;
            return;
        }

        // shift element right
        arr[i + 1] = arr[i];

        // recursive call
        insert(arr, i - 1, key);
    }
}
