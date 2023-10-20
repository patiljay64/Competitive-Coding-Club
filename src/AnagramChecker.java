import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases

        while (T-- > 0) { // Iterate through each test case
            String str1 = sc.next();
            String str2 = sc.next();
            boolean areAnagrams = areAnagrams(str1, str2); // Check if the two strings are anagrams
            System.out.print(areAnagrams + " "); // Print the result with a space
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If the lengths of the strings are different, they can't be anagrams
        }

        // Create arrays to store character frequency
        int[] count1 = new int[26]; // Assuming only lowercase letters (a-z)
        int[] count2 = new int[26];

        // Count the frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
        }

        // Count the frequency of characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i) - 'a']++;
        }

        // Compare the character frequencies
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false; // If any character frequency differs, they are not anagrams
            }
        }

        return true; // The strings are anagrams
    }
}
