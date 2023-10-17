import java.util.*;

public class CountMaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int[] arr = new int[sc.nextInt()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int counter = 0;
            int maximum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    counter++;
                } else {
                    counter = 0;
                }
                maximum = Math.max(maximum, counter);
            }
            System.out.print(maximum + " ");

        }

    }
}
