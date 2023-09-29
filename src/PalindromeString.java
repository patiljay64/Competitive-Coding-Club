import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // reading input Ex.(3 aba aabbaa aaaa)
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // if (T == 0) {
        // System.out.print(1);
        // }
        while (T-- > 0) {
            String str = sc.next();
            String reverseStr = "";
            //
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr = reverseStr + str.charAt(i);
            }
            if (str.equals(reverseStr)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

    }
}
