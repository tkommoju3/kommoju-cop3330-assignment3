package ex46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class WordCounter {
    private TreeSet<Main> wordInventory = new TreeSet<>();

    public TreeSet<Main> getWordInventory() {
        return wordInventory;
    }

    public void count() throws IOException {
        File file = new File("exercise46_input.txt");
        if (file.length() == 0) {
            throw new IllegalArgumentException("File is empty.");
        }

        try (Scanner s = new Scanner(new BufferedReader(new FileReader("exercise46_input.txt")))) {
            while (s.hasNext()) {
                String input = s.next();
                Main word = new Main(input, 0);

                if (!wordInventory.contains(word)) {
                    word.setCount(1);
                    wordInventory.add(word);
                } else {
                    int currentCount = wordInventory.floor(word).getCount();
                    wordInventory.floor(word).setCount(currentCount + 1);
                }
            }
        }
    }

    public String generateHistogram(){
        TreeSet<Main> sortedWordInventory = new TreeSet<>(new DescendingCount());
        sortedWordInventory.addAll(wordInventory);

        StringBuilder report = new StringBuilder();
        for(Main w: sortedWordInventory){
            report.append(String.format("%-12s: ", w.getName()));

            int count = w.getCount();
            for(int i = 1; i <= count; i++){
                report.append("*");
            }

            report.append("\n");
        }
        return report.toString();
    }

    class DescendingCount implements Comparator<Main> {
        @Override
        public int compare(Main e1, Main e2) {
            int countComparison =  e2.getCount() - e1.getCount();
            if(countComparison != 0){
                return countComparison;
            }
            return e1.getName().compareTo(e2.getName());
        }
    }
}