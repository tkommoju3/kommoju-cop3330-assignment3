/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // main method

    public static void main(String[] args) throws IOException {

        // passing the path to the file as a parameter
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner sc = new Scanner(file);

        // scan for input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the name of output file : ");
        String output = input.next();

        // create a FileWriter object to write into a file
        FileWriter writer = new FileWriter("src/main/java/ex45/output.txt");

        // try catch for exception
        try
        {

            // using while loop for read file

            while(sc.hasNext())
            {
                // read line
                String user = sc.nextLine();
                // replace utilize by use
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }
        //close the writer file
        writer.close();
        System.out.println("\nModified!");
    }
}