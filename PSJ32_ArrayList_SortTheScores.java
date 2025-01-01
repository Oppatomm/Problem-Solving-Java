import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PSJ32_ArrayList_SortTheScores {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            
            ArrayList <Integer> number = new ArrayList<>();

            System.out.println("Enter scores (type -1 to stop) : ");

            while (true) {
                int num = scanner.nextInt();

                if (num == -1) {
                    break;
                }

                number.add(num);
            }
            Collections.sort(number);
            
            System.out.println("Sorted scores : ");

            for(int num : number) {
                System.out.println(num);
            }
        }
    }
}