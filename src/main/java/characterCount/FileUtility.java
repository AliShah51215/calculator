package characterCount;

import java.io.*;

public class FileUtility implements Closeable {
    static BufferedReader reader = null;

    public FileUtility(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        reader = new BufferedReader(inputStreamReader);
    }

    public static int countCharacters() throws IOException {
        int numOfCharacters = 0;
        String data;
        while ((data = reader.readLine()) != null) {
            numOfCharacters += data.length();
        }
        return numOfCharacters;
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}