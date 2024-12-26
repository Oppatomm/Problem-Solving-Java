import java.util.Scanner;
public class PSJ24_Array_Countnumbersgreaterthan10 {
    
    public static int countNumber (int [] array) {
    int count = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] > 10) {
            count +=1;
        }
    }
    return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.print("Enter the element in array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.printf("The number of numbers greater than 10 is : %d\n",countNumber(array));
        }
    }
}
