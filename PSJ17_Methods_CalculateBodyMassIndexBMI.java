import java.util.Scanner;
public class PSJ17_Methods_CalculateBodyMassIndexBMI {

    public static double calCulateBMI (int weight , int heightCM) {
        if (heightCM < 100) {
            System.out.println("Height must be at least 100 cm.");
            return -1;
        }

        double heightM = heightCM / 100.0; 

        double BMI = weight / (heightM * heightM); 
        
        if (BMI < 18.5) {
            System.out.print("BMI : Low weight , ");
            return BMI;
        }else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.print("BMI : Normal , ");
            return BMI;
        }else{
            System.out.print("BMI : Overweight , ");
            return BMI;
        }
    }

    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter height : ");
            int height = scanner.nextInt();
            System.out.print("Enter weight : ");
            int weight = scanner.nextInt();
            double bmi = calCulateBMI(weight,height);
            if (bmi != -1) {
                System.out.printf("%.2f" , bmi);
            }
        }
    }
}