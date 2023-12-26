import java.util.Scanner;

public class ContestLog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of test cases
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            // Input for the size of the array
            int n = scanner.nextInt();

            // Input for the array as a string
            String arr = scanner.next();

            // Count the characters that occur more times than their corresponding index value
            int count = 0;
            for (int i = 0; i < 26; i++) {
                char currentChar = (char) ('A' + i);
                int charCount = countOccurrences(arr, currentChar);

                if (charCount > ('A' - 65 + i)) {
                    count++;
                }
            }

            // Print the result for the current test case
            System.out.println(count);
        }

        scanner.close();
    }

    static int countOccurrences(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}
