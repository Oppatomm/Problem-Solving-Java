import java.util.Scanner;
public class PSJ11_Methods_ConvertTimeFromHoursToSeconds {

    public static int convertToSeconds (int hours) {
        return hours * 3600;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the number of hours : ");
        int hours = scanner.nextInt();
        int seconds = convertToSeconds(hours);
        System.out.println(hours + " hours = " + seconds + " second");
        scanner.close();
    }

}