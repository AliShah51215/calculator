package text;

public class Main {
    public static void main(String[] args) {

        String phrase = "Never odd Or Even";
        boolean b = phrase.isEmpty();
        if (b) {
            System.out.println("Phrase is Empty");
        } else {
            System.out.println("Phrase is palindrome? \n" + Text.isPalindrome(phrase));
            System.out.println("Text length \n" + Text.lengthOfPhrase(phrase));
        }
    }
}
