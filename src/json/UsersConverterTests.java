package json;

public class UsersConverterTests {
    public static final String USERS_FILE_FROM = "src/file1.txt";
    public static final String USERS_FILE_TO = "src/file1.json";
//"./src/main/java/goit/hw_9_2/file.txt"
    public static void main(String[] args) {
        new UsersConverter().convert(USERS_FILE_FROM, USERS_FILE_TO);
    }
}
