import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {

            // array initialization with input of its size
            int[] arr = new int[sc.nextInt()];

            // array elements
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                // true bcoz last element is always a leader
                boolean isLeader = true;

                for (int j = i + 1; j < arr.length; j++) {

                    // check whether a 2nd element is greter than 1st then break
                    if (arr[j] >= arr[i]) {
                        isLeader = false;
                        break;
                    }
                }
                // if the ith element is gretter than all elements
                if (isLeader == true) {
                    System.out.print(arr[i] + " ");
                }
            }

        }
    }
}
