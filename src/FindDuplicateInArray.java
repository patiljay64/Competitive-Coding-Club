import java.util.Scanner;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                int index = arr[i] % size;
                arr[index] += size;
            }
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] / size) >= 2) {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
