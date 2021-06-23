/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex46;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{

    public static ArrayList<List> getWords(File file) throws FileNotFoundException {
        ArrayList<List> words = new ArrayList<>();
        String word;
        int badgerCount = 0;
        int mushroomCount = 0;
        int snakeCount = 0;
        Scanner reader = new Scanner(file);
        while(reader.hasNext()) { // reading file word by word
            word = reader.next();
            if(word.equals("badger")) //// add count of each word every time it is read
                badgerCount++;
            if(word.equals("mushroom"))
                mushroomCount++;
            if(word.equals("snake"))
                snakeCount++;
        }
        List badger = new List(badgerCount, "badger");
        List mushroom = new List(mushroomCount, "mushroom");
        List snake = new List(snakeCount, "snake");
        words.add(badger); //add words to list
        words.add(mushroom);
        words.add(snake);
        return words;
    }

    public static void main( String[] args ) throws IOException {
        File file = new File("src/main/java/ex46/exercise46_input.txt");

        ArrayList<List> words = getWords(file);
        words.sort(new ListComparator()); // sort words

        for(List Word : words) { // loop through word count

            System.out.print(Word.getName() + ": ");
            for(int i = 0; i < Word.getCount(); i++)
                System.out.print("*"); // print
            System.out.print("\n");
        }

    }
}
