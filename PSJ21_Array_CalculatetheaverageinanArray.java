import java.util.Scanner;
public class PSJ21_Array_CalculatetheaverageinanArray {
    
    public static int calculateaverage (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = scanner.nextInt();

            int [] array = new int[size];

            System.out.print("Enter the elements of the array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            System.out.printf("The average is : %d\n" , calculateaverage(array));
        }
    }
}
