import searchLongestWordInFile.impl.SearchWord;
import wordsFrequency.impl.WordFrequency;
import wordСount.impl.WordCount;

import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("src/input.txt");

        WordCount wordCount = new WordCount();
        wordCount.countWord(file);
        System.out.println();

        SearchWord searchWord = new SearchWord();
        searchWord.searchWord(file);
        System.out.println();

        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.wordsFrequency(file);

    }
}