package wordСount.impl;

import wordСount.Countable;
import java.io.*;
import java.util.Scanner;

public class WordCount implements Countable<File> {

    @Override
    public void countWord(File file) {
        int words = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(" +");
                words = words + array.length;
            }

            System.out.println("Number of words: " + words);
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
