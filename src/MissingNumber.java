import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            int sumOfArr = 0;

            // taking elements of array
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = sc.nextInt();
            }

            // formula of sum of natural numbers
            int sum = (size * (size + 1)) / 2;

            // calculating the sum of array elements
            for (int i = 0; i < arr.length; i++) {
                sumOfArr += arr[i];
            }

            // finding the missing element by sum - sum of array
            System.out.print((sum - sumOfArr));
            
        }
    }
}

/*
 * for example
 * N = 5
 * arraay is [1,2,4,5] && missing element is 3.
 * 1. calculate sum of N number using the the formula
 * Sn = n(n+1)/2
 * i.e (5 * 6)/2 = 15 = Sn
 * 
 * 2. calculate the sum of array elements
 * sumOfArr
 * i.e 1+2+4+5 = 12
 * 3. find the missing element
 * Sn - sumOfArr
 * 
 */