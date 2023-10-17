import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test Case
        int T = sc.nextInt();

        while (T-- > 0) {

            // array with its length
            int[] arr = new int[sc.nextInt()];

            // finding the middle
            int mid = (arr.length) / 2;

            // array elements
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // left side and right side of array
            int right = 0, left = 0;
            for (int i = 0; i < arr.length; i++) {
                // for left side
                if (i < mid) {
                    left += arr[i];
                }
                // for right side
                if (i >= mid) {
                    right += arr[i];
                }
            }

            // checking all the conditions
            if (left == right) {
                System.out.print(0 + " ");
            } else if (left > right) {
                System.out.print((left - right) + " ");
            } else {
                System.out.print((right - left) + " ");
            }
        }

    }
}
