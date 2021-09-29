import java.sql.SQLOutput;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class TestingStringUtils {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter something and I'll tell you if it's a number.");
        System.out.println(StringUtils.isNumeric(sc.nextLine()));

        System.out.println("Enter a string the case of which you would like me to reverse.");
        System.out.println(StringUtils.swapCase(sc.nextLine()));
        System.out.println("Enter a string you want me to print backwards.");
        System.out.println(StringUtils.reverse(sc.nextLine()));

        System.out.println("Enter something.");
        String userInput = sc.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.println("That string is numeric.");
        } else {
            System.out.println("That string is non-numeric.");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
