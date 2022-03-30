package wordsCounter;

public class WordsCounterTests {
    public static final String FILE_WITH_WORDS = "src/words.txt";

    public static void main(String[] args) {
        new WordsCounter().countWordsIn(FILE_WITH_WORDS);
    }
}
