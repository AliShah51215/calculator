package sum_of_integers;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1080);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(Instant.now() + " Message to the server: " + list);

        outputStream.writeObject(list);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        String messageFromServer = (String) inputStream.readObject();
        System.out.println(Instant.now() + " Message from the server: " +  messageFromServer);
    }
}
