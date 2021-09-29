import java.util.Locale;

public class CodeupCrypt {
    public static double version;
    public static String hashPassword(String inputString){
        String output = "";
        for(int i = 0; i <inputString.length(); i++){
            switch (Character.toLowerCase(inputString.charAt(i))){
                case 'a':
                    output += 4;
                    break;
                case 'e':
                    output += 3;
                    break;
                case 'i':
                    output += 1;
                    break;
                case 'o':
                    output += 0;
                    break;
                case 'u':
                    output += 9;
                    break;
                default:
                    output+= inputString.charAt(i);
                    break;
            }
        }
        return output;
    }

    public static boolean checkPassword(String hashed, String original) {
        return hashed.equals(hashPassword(original));
    }
}
