import java.util.Scanner;
public class PSJ08_DataTypeBoolean_CheckMovieViewingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age. : ");
        int age = scanner.nextInt();
        boolean result = age >= 18;
        if (result) {
            System.out.println("You can watch R-rated movies.");
        }else {
            System.out.println("You cannot watch R-rated movies.");
        }
        scanner.close();
    }
}
