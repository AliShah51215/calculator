package MessageClass;

public class MainMessage {
    public static void main(String[] args) {
        WindowsMessage windowMessage = new WindowsMessage();
        System.out.println(windowMessage.getMessage());
        ConsoleMessage consoleMessage = new ConsoleMessage();
        System.out.println(consoleMessage.getMessage());
    }
}
