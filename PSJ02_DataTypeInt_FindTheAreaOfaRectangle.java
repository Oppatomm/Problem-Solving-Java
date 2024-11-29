import java.util.Scanner;

public class PSJ02_DataTypeInt_FindTheAreaOfaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = scanner.nextInt();
        System.out.print("Enter width : ");
        int width = scanner.nextInt();
        int result = width * length;
        System.out.println("Area is " + result);
        scanner.close();
    }
}
