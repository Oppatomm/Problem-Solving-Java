import java.util.Scanner;
public class PSJ20_Array_name {

    public static int findthesumofallnumbers (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.printf("Enter the elements of the array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.printf("The sum of the numbers is : %d\n" , findthesumofallnumbers(array));
        }
    }
}