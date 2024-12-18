import java.util.Scanner;
public class PSJ18_Methods_CalculateArea {
    
    public static double calCulateCirCle (int r) {
        return Math.PI * (r * r);
    }

    public static int calCulateRectangle (int width , int length) {
        return width * length;
    }

    public static double calCulateTriangle (int base , int height) {
        return 0.5 * (base * height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("=== Welcome to the program for calculating the area of ​​geometric shapes. ===");
            System.out.println("Enter 1 to find the area of ​a circle.");
            System.out.println("Enter 2 to find the area of ​​a rectangle.");
            System.out.println("Enter 3 to find the area of ​​the triangle.");
            System.out.print("Enter Number : ");
            int num = scanner.nextInt();
            String name = "";
            switch (num) {
                case 1 :
                    name = "circle";
                    System.out.print("Enter radius : ");
                    int radius = scanner.nextInt();
                    System.out.printf("Area of %s : %.2f\n" ,name , calCulateCirCle(radius));
                    break;
                case 2 : 
                    name = "rectangle";
                    System.out.print("Enter width : ");
                    int width = scanner.nextInt();
                    System.out.print("Enter length : ");
                    int length = scanner.nextInt();
                    System.out.printf("Area of %s : %d\n" ,name , calCulateRectangle(width, length));
                    break;
                case 3 :
                    name = "triangle";
                    System.out.print("Enter base : ");
                    int base = scanner.nextInt();
                    System.out.print("Enter height : ");
                    int height = scanner.nextInt();
                    System.out.printf("Area of %s : %.2f\n" ,name , calCulateTriangle(base, height));
                    break;

                default :
                    System.out.println("You entered an incorrect number. Please enter 1 - 3.");
            }
            scanner.close();
    }
}