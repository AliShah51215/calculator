package data.Text;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String text = "The Course\n" +
                "Java\n" +
                "Lesson 6\n" +
                "Files\n" +
                "Exceptions\n" +
                "Files\n" +
                "End of Files";

        TextFileWriter textFileWriter = new TextFileWriter();
        String pathToFile = "src/main/java/data/Text/data.txt";
        textFileWriter.writeToFile(pathToFile, text);
    }
}
