import java.util.*;

class Sort {
    public static void BubbleSortA(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void BubbleSortB(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Matrix {

    int mat[][];
    int n;
    int m;

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        mat = new int[n][m];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the matrix");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public void outputMatrix() {
        System.out.println("The element of the matrix");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void Sort() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                Sort.BubbleSortA(mat[i]);
            else
                Sort.BubbleSortB(mat[i]);
        }
    }
}

public class matrixSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and column ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        Matrix mat = new Matrix(n, m);
        mat.inputMatrix();
        mat.outputMatrix();
        mat.Sort();
        System.out.println("Matrix after sorting");
        mat.outputMatrix();
        sc.close();
    }
}
