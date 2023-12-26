import java.util.Scanner;
import java.util.HashSet;
public class doremyspaint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = in.nextInt();
                HashSet<Integer> set = new HashSet<Integer>();

                // Add each element of array into the set
                for (int z = 0; z < a.length; z++) {
                    set.add(a[z]);
                }

                // The size of the set is the number of unique elements in the array

            }
        }

    }}
