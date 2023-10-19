import java.util.Scanner;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases

        while (T-- > 0) { // Iterate through each test case
            String input = sc.next(); // Read the input string
            boolean isRepeatedPattern = isRepeatedSubstringPattern(input); // Check if it's a repeated pattern
            System.out.print(isRepeatedPattern + " "); // Print the result with a space
        }
    }

    public static boolean isRepeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) { // Iterate through possible substring lengths
            if (len % i == 0) { // If i evenly divides the string length
                String substring = s.substring(0, i); // Extract a substring
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < len / i; j++) { // Repeat the substring
                    repeated.append(substring);
                }
                if (s.equals(repeated.toString())) { // Check if the repeated string matches the original
                    return true; // It's a repeated substring pattern
                }
            }
        }
        return false; // If no repeated pattern is found, return false
    }
}
