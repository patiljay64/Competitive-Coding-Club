import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int lastDigit, reverseNo = 0;
            while (N > 0) {
                lastDigit = N % 10;
                reverseNo = (reverseNo * 10) + lastDigit;
                N /= 10;
            }
            System.out.print(reverseNo + " ");

        }
    }
}

// Explanation
/*
 * Eg. N = 1234
 * 1st Iteration
 * 1234 % 10 = 4 remainder
 * reverse = 0*10+ remainder = ) 0 + 4 = 0
 * 1234 / 10 = 123 = N
 * 
 * 2st Iteration
 * 123 % 10 = 3 remainder
 * reverse = 4*10+3 = 43
 * 123 / 10 = 12 = N
 * 
 * 3rd Iteration
 * 12 % 10 = 2 = remainder
 * reverse = 43*10+2 = 432
 * 12 / 10 = 1 = N
 * 
 * 4th Iteration
 * 1 % 10 = 1 = remainder
 * reverse = 432*10+1 = 4321
 * 1 /10 = 0
 * termination
 */
