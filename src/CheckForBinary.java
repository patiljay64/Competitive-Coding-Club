import java.util.Scanner;

public class CheckForBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T <= 50) {
            while (T-- > 0) {
                String str = sc.next();
                int temp = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1' || str.charAt(i) == '0') {
                        temp = 1;
                    } else {
                        temp = 0;
                    }
                }
                System.out.print(temp + " ");
            }
        }
    }

}
