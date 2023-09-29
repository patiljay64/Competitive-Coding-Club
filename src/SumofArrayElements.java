import java.util.Scanner;

public class SumofArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int Sum = 0;

        for (int i = 0; i < N; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
            Sum += ele;
        }
        System.out.println(Sum);
    }
}
