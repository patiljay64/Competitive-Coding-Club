import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int lastDigit, sum = 0;
            while (N > 0) {
                lastDigit = N % 10;
                sum += lastDigit;
                N /= 10;
            }
            System.out.print(sum+ " ");
        }
    }
}



/*
 * 
 */