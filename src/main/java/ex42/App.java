/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex42;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws IOException {

        ArrayList<Main> people = new ArrayList<Main>(); //create an array
        File inFile = new File("src/main/java/ex42/exercise42_input.txt"); //open input file
        people = FileH.readPeople(inFile); //read all the people in the file
        FileH.printPeople(people);
    }
}
