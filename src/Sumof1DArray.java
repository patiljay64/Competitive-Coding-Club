import java.util.Scanner;

public class Sumof1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int sizeOfArray = sc.nextInt();
            int sum = 0, arr[] = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
                System.out.print(sum + " ");
            }
        }
    }
}
