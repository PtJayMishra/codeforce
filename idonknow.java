import java.util.Arrays;
import java.util.Scanner;

public class idonknow {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int t = in.nextInt();
int a = 0;
        for (int i = 0; i < t; i++) {


        int[] array = {in.nextInt()}; // Replace this array with your input

        // Move the 0 index element to the last index
        int temp = array[0];
        for (int j = 0; j < array.length - 1; i++) {
            array[j] = array[j + 1];

        }
        array[array.length - 1] = temp;

            int lastIndex = array.length - 1;
            while (lastIndex > 0 && array[lastIndex] > array[lastIndex - 1]) {
                // Swap the last index element with the preceding element
                int temp1 = array[lastIndex];
                array[lastIndex] = array[lastIndex - 1];
                array[lastIndex - 1] = temp;
                lastIndex--;

                a++;

            }System.out.print(a++);

            // Print the manipulated array



        }
    }
}
