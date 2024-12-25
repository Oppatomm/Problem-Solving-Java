import java.util.Arrays;
import java.util.Scanner;
public class PSJ23_Array_Sortthenumbersinthearray {

    public static void sortAndPrint (int [] array) {
        Arrays.sort(array);
        System.out.print("Array After sort : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter size : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.print("Enter the element in array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            sortAndPrint(array);
        }
    }
}
