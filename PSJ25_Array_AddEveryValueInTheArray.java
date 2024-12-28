import java.util.Scanner;
public class PSJ25_Array_AddEveryValueInTheArray {

    public static void addvalueAndPrint (int [] array, int add) {
        System.out.print("Array after adding values : ");
        for (int i = 0; i < array.length; i++) {
            array[i] += add;
            System.out.print(array[i] + " ");
        }
        System.out.println();
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

            System.out.print("Enter the value you want to add : ");
            int add = scanner.nextInt();

            addvalueAndPrint(array,add);

        }
    }
}
