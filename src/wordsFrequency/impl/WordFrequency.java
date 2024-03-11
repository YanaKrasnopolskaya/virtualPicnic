package wordsFrequency.impl;

import wordsFrequency.WordsFrequencyable;

import java.io.*;
import java.util.*;

public class WordFrequency implements WordsFrequencyable<File> {
    @Override
    public void wordsFrequency(File file) {
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!wordFrequency.containsKey(word)) {
                    wordFrequency.put(word, 1);
                } else {
                    wordFrequency.put(word, wordFrequency.get(word) + 1);
                }
            }
            System.out.println("Frequency of words in the file:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
