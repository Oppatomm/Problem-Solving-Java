import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PSJ31_ArrayList_FindTheMaximumandMinimumValues {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList <Integer> number = new ArrayList<>();

            System.out.println("Enter numbers (type -1 to stop) : ");

            while (true) {
                int num = scanner.nextInt();

                if (num == -1) {
                    break;
                }

                number.add(num);
            }
            int max = Collections.max(number);
            int min = Collections.min(number);
            System.out.printf("Maximum value : %d\n" , max);
            System.out.printf("Minimum value : %d\n" , min);
        }
    }
}
