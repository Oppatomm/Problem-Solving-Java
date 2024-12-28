import java.util.Scanner;
public class PSJ26_Array_FindThePositionOfNumbersInAnArray {
    
    public static int findNumberLocationAndPrint (int [] array, int position) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == position) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.print("Enter the element in array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the numbers you want to locate in the Array : ");
            int position = scanner.nextInt();

            int result = findNumberLocationAndPrint(array, position);
            System.out.println(result);
            
            if (result != -1) {
                System.out.printf("The position of %d in the Array is: %d\n",position , result);
            }else {
                System.out.printf("The value %d was not found in the array.\n",position);
            }
        }
    }
}
