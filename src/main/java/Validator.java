public class Validator {
    public static boolean validate(String password) {
        return lengthChecker(password)
                & capitalChecker(password)
                & lowercaseChecker(password)
                & numberChecker(password)
                & underscoreChecker(password);
    }

    public static boolean lengthChecker(String password) {
        return password.length() >= 8;
    }

    public static boolean capitalChecker(String password) {

        String[] split = password.split("");
        for (String character : split) {
            if (character.matches("[A-Z]")) {
                return true;
            }
        }
        return false;
    }

    public static boolean lowercaseChecker(String password) {

        String[] split = password.split("");
        for (String character : split) {
            if (character.matches("[a-z]")) {
                return true;
            }
        }
        return false;
    }

    public static boolean numberChecker(String password) {

        String[] split = password.split("");
        for (String character : split) {
            if (character.matches("[0-9]")) {
                return true;
            }
        }
        return false;
    }

    public static boolean underscoreChecker(String password) {

        String[] split = password.split("");
        for (String character : split) {
            if (character.matches("_")) {
                return true;
            }
        }
        return false;


    }
}
