package uppercase.lowercase;

public class ToUpperCase implements TextTransformer {

    @Override
    public String transformText(String text) {
        return text.toUpperCase();
    }
}
