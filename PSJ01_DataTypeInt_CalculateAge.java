import java.util.Scanner;
public class PSJ01_DataTypeInt_CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year (AD) : ");
        int current = scanner.nextInt();
        System.out.print("Enter year of birth (AD) : ");
        int birth = scanner.nextInt();
        int result = current - birth;
        System.err.println("Your age is " + result + " years.");
        scanner.close();
    }
}