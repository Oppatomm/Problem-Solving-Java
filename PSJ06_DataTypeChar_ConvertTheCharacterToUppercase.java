import java.util.Scanner;
public class PSJ06_DataTypeChar_ConvertTheCharacterToUppercase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter one character, English letters only. : ");
            char input = scanner.next().charAt(0);
            char Upperinput = Character.toUpperCase(input);
            System.out.println("Output : " + Upperinput);
        }
    }
}
