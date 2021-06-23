package ex46;

import java.util.Comparator;

public  class ListComparator implements Comparator<List> {
    public int compare(List wordOne, List wordTwo) {
        return wordTwo.getCount() - wordOne.getCount();
    }
}