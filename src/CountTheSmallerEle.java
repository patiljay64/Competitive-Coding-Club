import java.util.Scanner;

public class CountTheSmallerEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int[] arr = new int[sc.nextInt()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int target = sc.nextInt();
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= target) {
                    counter++;
                }
            }
            System.out.print(counter + " ");

        }
    }
}
