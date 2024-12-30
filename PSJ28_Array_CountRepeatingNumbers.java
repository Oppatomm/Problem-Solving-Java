import java.util.Scanner;
import java.util.HashMap;
public class PSJ28_Array_CountRepeatingNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter the size in the Array : ");
            int size = scanner.nextInt();

            int [] array = new int [size];

            System.out.print("Enter number in Array : ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            HashMap <Integer,Integer> number = new HashMap<>();

            for (int i = 0; i < array.length; i++) {
                if (number.containsKey(array[i])) {
                    number.put(array[i], number.get(array[i]) +1);
                }else {
                    number.put(array[i],1);
                }
            }

            System.out.println("Number of duplicate values : ");
            for (HashMap.Entry<Integer,Integer> entry : number.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
                }
            }
        }
    }
}