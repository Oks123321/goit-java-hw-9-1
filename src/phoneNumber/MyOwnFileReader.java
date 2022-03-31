package phoneNumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyOwnFileReader {

        public static void main(String args[]) throws IOException {
            Scanner scanner = new Scanner(new FileInputStream("src/file.txt"));

            while (scanner.hasNextLine()) {
                String telNumber = scanner.nextLine();
                Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
                Pattern pattern1 = Pattern.compile("^\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}$");

                Matcher matcher = pattern.matcher(telNumber);
                Matcher matcher1 = pattern1.matcher(telNumber);

                if (matcher.matches()) {
                    System.out.println(telNumber);
                }
                if (matcher1.matches()) {
                    System.out.println(telNumber);
                }
            }
        }
    }


