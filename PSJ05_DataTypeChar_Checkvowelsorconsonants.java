import java.util.Scanner;
public class PSJ05_DataTypeChar_Checkvowelsorconsonants {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter one character, English letters only. : ");
            char input = scanner.next().charAt(0);
            char lowerinput = Character.toLowerCase(input);
            if (lowerinput == 'a' || lowerinput == 'e' ||
                lowerinput == 'i' || lowerinput == 'o' ||
                lowerinput == 'u' ) {
                    System.out.println(lowerinput + " is a vowel");
            }else {
                System.out.println(input + " is a consonant");
            }
        }
    }
}

