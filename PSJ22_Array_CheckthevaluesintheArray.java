import java.util.Scanner;
public class PSJ22_Array_CheckthevaluesintheArray {

    public static int checkthevalues (int [] array , int values) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == values) {
                return values;
            }
        }
        return 1;
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

            System.out.print("Enter the number you want to check : ");
            int values = scanner.nextInt();

            int result = checkthevalues(array, values);
            if (result != 1) {
                System.out.printf("%d is in the array.\n", checkthevalues(array, values));
            }else {
                System.out.printf("%d is not in the array.\n", values);
            }
        }
    }
}