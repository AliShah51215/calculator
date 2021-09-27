package uppercase.lowercase;

public class ToLowerCase implements TextTransformer {
    @Override
    public String transformText(String text) {
        return text.toLowerCase();
    }
}
