package lenghtOftext;



public class TextLength {
    public static int getTextLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}