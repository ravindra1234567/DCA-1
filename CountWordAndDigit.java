import java.util.*;

public class CountWordAndDigit {

    public static void main(String[] args) {

        String[] arr = { "aa", "abc", "52222222d", "5", "sjkfjslkjlkjl" };

        int digit = 0, alpha = 0;
        boolean isAlphaDigit = false;
        for (String y : arr) {
            boolean isdigit = false, isAlpha = false;
            char[] arr1 = y.toCharArray();
            for (char c : arr1) {
                if (Character.isDigit(c))
                    isdigit = true;
                else if (Character.isLetter(c))
                    isAlpha = true;
            }

            if (isAlpha && isdigit) {
                isAlphaDigit = true;
                break;
            }
            if (isAlpha)
                alpha = alpha + 1;
            if (isdigit)
                digit = digit + 1;
        }
        if (isAlphaDigit)
            System.out.println("Invelid Input");
        else
            System.out.println("Alpha = " + alpha + "  Digit = " + digit);

    }
}
