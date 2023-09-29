import java.util.Scanner;

public class DefangedIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.print(sc.next().replace(".", "[.]"));

        }
    }
}

// . = 46
