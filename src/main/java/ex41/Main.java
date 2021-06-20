package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> read(File file) throws FileNotFoundException {
        ArrayList<String> people = new ArrayList<String>();
        Scanner content = new Scanner(file);
        while (content.hasNextLine()) { //check next line until content is available
            String data = content.nextLine();
            people.add(data);
        }
        content.close();
        return people;
    }
    public static void output(ArrayList<String> people, FileWriter myWriter) throws IOException {
        myWriter.write("Total of " + people.size() + " names\n"); //write into output file
        myWriter.write("-------------------------\n");
        for(String person : people) {
            myWriter.write(person + "\n"); //loop to write all people
        }
        myWriter.close();

    }
}
