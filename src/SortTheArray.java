import java.util.Scanner;

public class SortTheArray {
    // for printing the sorted array
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // sorting the array (Bubble Sort)
    public static void sortArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swapping (Methon 1: classic)
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;

                    // method 2 (XOR)
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        // array is sorted and ready to print
        PrintArr(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of an array
        int N = sc.nextInt();
        // array with size N
        int arr[] = new int[N];

        // gatting array elements from user
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // calling func for sort
        sortArr(arr);
    }
}
