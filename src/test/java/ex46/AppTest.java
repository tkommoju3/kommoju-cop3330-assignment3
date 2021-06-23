package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @org.junit.jupiter.api.Test
    void getAnimals() throws FileNotFoundException {
        File file = new File("src/main/java/ex46/exercise46_input.txt");
        ArrayList<List> expectedWords = new ArrayList<>();
        ArrayList<List> animals = new ArrayList<>();
        List expectedBadger = new List(7, "badger");
        List expectedMushroom = new List(2, "mushroom");
        List expectedSnake = new List(1, "snake");
        expectedWords.add(expectedBadger);
        expectedWords.add(expectedMushroom);
        expectedWords.add(expectedSnake);
        String word;
        int badgerCount = 0;
        int mushroomCount = 0;
        int snakeCount = 0;
        Scanner reader = new Scanner(file);
        while(reader.hasNext()) {
            word = reader.next();
            if(word.equals("badger"))
                badgerCount++;
            if(word.equals("mushroom"))
                mushroomCount++;
            if(word.equals("snake"))
                snakeCount++;
        }
        List badger = new List(badgerCount, "badger");
        List mushroom = new List(mushroomCount, "mushroom");
        List snake = new List(snakeCount, "snake");
        animals.add(badger);
        animals.add(mushroom);
        animals.add(snake);
        for(int i = 0; i < animals.size(); i++) {
            assertEquals(expectedWords.get(i).getCount(), animals.get(i).getCount());
            assertEquals(expectedWords.get(i).getName(), animals.get(i).getName());
        }
    }
}