package json;

public class UsersConverterTests {
    public static final String USERS_FILE_FROM = "src/file1.txt";
    public static final String USERS_FILE_TO = "src/file1.json";

    public static void main(String[] args) {
        new UsersConverter().convert(USERS_FILE_FROM, USERS_FILE_TO);
    }
}
