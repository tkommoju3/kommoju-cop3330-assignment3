/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */


package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) throws IOException {

        String siteName, siteAuthor;
        Scanner input = new Scanner(System.in); //scan for user input
        System.out.print("Site name: ");
        siteName = input.nextLine();
        System.out.print("Author: ");
        siteAuthor = input.nextLine();
        File websiteDirectory = new File("./website/" + siteName);
        websiteDirectory.mkdirs();

        System.out.print("Do you want a folder for JavaScript? ");
        if(input.next().toLowerCase(Locale.ROOT).equals("y")) //code for accepting lowercase y
            new File("./website/" + siteName + "/js").mkdirs();

        System.out.print("Do you want a folder for CSS? ");
        if(input.next().toLowerCase(Locale.ROOT).equals("y")) //code for accepting lowercase y
            new File("./website/" + siteName + "/css").mkdirs();

        FileWriter myWriter = new FileWriter(websiteDirectory + "/index.html");
        myWriter.write("<head>\n");
        myWriter.write("<meta name=\"title\" content=\""+ siteName + "\">\n"); //write output for completed website
        myWriter.write("<meta name=\"author\" content=\""+ siteAuthor + "\">\n");
        myWriter.write("</head>\n");
        myWriter.close();




    }
}
