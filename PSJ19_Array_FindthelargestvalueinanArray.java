import java.util.Scanner;
public class PSJ19_Array_FindthelargestvalueinanArray {

    public static int findTheGreatestValue (int []array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = scanner.nextInt();
            int [] array = new int[size];
            System.out.println("Enter the element of the array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.printf("The greatest value : %d\n" ,findTheGreatestValue(array));
        }
    }
}
