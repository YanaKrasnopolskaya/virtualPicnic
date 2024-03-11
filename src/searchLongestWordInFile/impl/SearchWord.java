package searchLongestWordInFile.impl;

import searchLongestWordInFile.SearchWordable;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchWord implements SearchWordable<File> {
    @Override
    public void searchWord(File file) {
        String longestWord = null;
        String anotherLongestWord = null;
        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Scanner scanner = new Scanner(reader);
            ArrayList<String> list =  new ArrayList<>();
            while (scanner.hasNext()) {
                list.add(Arrays.toString(scanner.next().split(" +")));
            }

            for (String word: list) {
                if(count < word.length()){
                    count = word.length();
                    longestWord = word;
                }
                if(word.length() == count){
                    anotherLongestWord = word;
                }
            }
            System.out.println("The longest word in the file: " + longestWord);
            if(anotherLongestWord != null){
                System.out.println("Another Longest word in the file: " + anotherLongestWord);
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
