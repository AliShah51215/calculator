package url_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,3}$");
        Matcher matcher1 = pattern.matcher("http://www.onet.pl");
        Matcher matcher2 = pattern.matcher("http://onet.pl");
        Matcher matcher3 = pattern.matcher("www.onet.pl");
        Matcher matcher4 = pattern.matcher("www.google.  com");
        Matcher matcher5 = pattern.matcher("http://wiadmosci.onet.pl");
        Matcher matcher6 = pattern.matcher("https://mail.google.com");

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());
        System.out.println(matcher6.matches());
    }
}