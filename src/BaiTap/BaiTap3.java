package BaiTap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap3 {


    public class EmailValidator {
        public static boolean isValidEmail(String email) {
            String regex = "\\d{3}-\\d{2}-\\d{4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        public static void main(String[] args) {
            String email1 = "rikeiacademy@rikkeisoft.com";
            String email2= "rikeiacademy@rikkeisoft";

            System.out.println(" email 1: " + isValidEmail(email1)); // true
            System.out.println(" email 2: " + isValidEmail(email1)); // false
        }
    }
}
