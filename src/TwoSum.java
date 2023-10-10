import java.util.Scanner;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = size - 1;
        int ans = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.print(left + " " + right);
                ans++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (ans == 0) {
            System.out.print(-1);
        }
    }
}
