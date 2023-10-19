import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases
        
        while (T-- > 0) { // Iterate through each test case
            String jewels = sc.next(); // Read the jewels string
            String stones = sc.next(); // Read the stones string

            int count = countJewelsInStones(jewels, stones); // Count jewels in stones
            System.out.print(count + " "); // Print the result with a space
        }
    }

    public static int countJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            if (jewels.indexOf(stone) != -1) {
                count++; // Increment count if a jewel is found in stones
            }
        }
        return count; // Return the total count of jewels in stones
    }
}
