import java.util.Scanner;
import java.util.Arrays;
public class PSJ29_ArrayList_ConvertArraytoString {
    
    public static void arraytoString (int [] array) {
        System.out.printf( "%s\n",Arrays.toString(array));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size in the Array : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.print("Enter element in Array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            arraytoString(array);
        }
    }

}
