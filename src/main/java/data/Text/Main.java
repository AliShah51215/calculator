package data.Text;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IIOException exception) {
            exception.printStackTrace();
        }

        String pathToFile = "C:\\Users\\Ali\\IdeaProjects\\Github\\target\\data.txt";
        String text = "The Course\n" +
                "Java\n" +
                "Lesson 6\n" +
                "Files\n" +
                "Exceptions\n" +
                "Files\n" +
                "End of Files";

        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeToFile(pathToFile, text);
    }
}
