import java.util.Scanner;
import java.util.ArrayList;
public class PSJ30_ArrayList_CountTheNumberofEntries {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList <Integer> number = new ArrayList<>();

            int count = 0;
            System.out.println("Enter exam scores (type -1 to stop) : ");

            while (true) {
                int score = scanner.nextInt();

                if (score == -1) {
                    break;
                }

                number.add(score);
                count += 1;
            }

            System.out.printf("Total number of scores : %d\n" , count);
        }
    }
}