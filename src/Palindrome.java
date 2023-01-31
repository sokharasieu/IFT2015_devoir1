
public class Palindrome {

    public static String toSubstring(int start, int end, String str) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean checker(String input) {
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checker_recursive(String input) {

        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            String resultString = "";
            for (int i = 1; i < input.length() - 1; i++) {
                resultString += input.charAt(i);
            }

            return checker_recursive(resultString);
        }

        return false;
    }

    public static String reverse(String input) {
        String result = "";
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            result = ch + result;
        }
        return result;
    }

    public static String transforme_palindrome(String input) {
        return input + reverse(input);
    }

    public static String transforme_palindrome_compacte(String input) {
        if (checker(input)) {
            return input;
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (checker(toSubstring(i, input.length(), input))) {
                    return input + reverse(toSubstring(0, i, input));
                }
            }

        }

        return input;
    }
}
