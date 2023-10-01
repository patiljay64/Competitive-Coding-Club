import java.util.Scanner;

public class MinMaxofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];

            int min, max = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.print(min + " " + max + " ");

        }

    }
}
