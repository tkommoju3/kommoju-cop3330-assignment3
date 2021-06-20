/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App
{

    public static void main( String[] args ) throws IOException {

        ArrayList<String> people = new ArrayList<String>();  // create array to hold people
        File inFile = new File("src/main/java/ex41/exercise41_input.txt"); // open input file
        FileWriter myWriter = new FileWriter("src/main/java/ex41/output.txt");
        people = Main.read(inFile); // read string from input file
        Collections.sort(people); // sorting array
        Main.output(people, myWriter);

    }
}