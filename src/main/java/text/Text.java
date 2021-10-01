package text;

public class Text {

    private static String removeSpaces(String phrase) {
        return phrase.replaceAll(" ", "");
    }

    public static int lengthOfPhrase(String phrase) {
        return phrase.length();
    }

    public static boolean isPalindrome(String phrase) {
        String modifiedPhrase = removeSpaces(phrase).toLowerCase();
        int t = modifiedPhrase.length();
        StringBuilder convertedPhrase = new StringBuilder();

        for (int i = t - 1; i >= 0; i--) convertedPhrase.append(modifiedPhrase.charAt(i));

        return modifiedPhrase.equals(convertedPhrase.toString());
    }


}
