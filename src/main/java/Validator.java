public class Validator {
    public static boolean validator1(String password) {
        return lengthAboveEight(password)
                & capitalChecker(password)
                & lowercaseChecker(password)
                & numberChecker(password)
                & underscoreChecker(password);
    }

    public static boolean validator2(String password) {
        return lengthAboveSix(password)
                & capitalChecker(password)
                & lowercaseChecker(password)
                & numberChecker(password);
    }

    public static boolean lengthAboveEight(String password) {
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

    public static boolean lengthAboveSix(String password) {
        return password.length() >= 6;
    }

    public static boolean lengthAboveSixteen(String password) {
        return password.length() >= 16;
    }

    public static boolean validator3(String password) {
        return lengthAboveSixteen(password)
                & capitalChecker(password)
                & lowercaseChecker(password)
                & underscoreChecker(password);
    }
}
