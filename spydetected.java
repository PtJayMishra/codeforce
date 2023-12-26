import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


public class spydetected {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            countAndPrintUnique(a);

        }

    }

    public static void countAndPrintUnique(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

    }
}

