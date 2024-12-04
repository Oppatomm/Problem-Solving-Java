import java.util.Scanner;
public class PSJ15_Methods_FindTheLargestNumberInAnArray {

    public static int findTheLargestNumber (int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Please enter the number of elements in the array : ");
            int size = scanner.nextInt();
            int [] array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.printf("Please enter the element of the array at position %d : " , i);
                array[i] = scanner.nextInt();
            }

            System.out.println("The largest number in the array is : " + findTheLargestNumber(array));
        }
    }
}
