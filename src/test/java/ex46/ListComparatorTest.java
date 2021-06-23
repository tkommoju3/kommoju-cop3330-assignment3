package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListComparatorTest {

    @Test
    void compare() {
        ArrayList<List> words = new ArrayList<>();
        List wordOne = new List(1, "snake");
        List wordTwo = new List(7, "badger");
        words.add(wordOne);
        words.add(wordTwo);
        words.sort(new ListComparator());
        assertEquals(7, words.get(0).getCount());
    }
}