
package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileH {
    public static ArrayList<Main> readPeople(File file) throws FileNotFoundException {
        ArrayList<Main> people = new ArrayList<>();
        Scanner input = new Scanner(file);
        String line;
        while(input.hasNextLine()) { //while loop for checking content
            line = input.nextLine();
            Scanner lineReader = new Scanner(line).useDelimiter(",");
            String lName = lineReader.next();
            String fName = lineReader.next();
            int salary = Integer.parseInt(lineReader.next());
            Main person = new Main(lName, fName, salary); //the components for a person
            people.add(person);
            lineReader.close();
        }
        input.close();
        return people;
    }

    public static void printPeople(ArrayList<Main> people) {
        System.out.printf("%-15s %-15s %-15s%n", "Last", "First", "Salary"); //print statements for people
        System.out.println("--------------------------------------");
        for(Main person : people) {
            System.out.printf("%-15s %-15s %-15d%n", person.getLastName(), person.getFirstName(), person.getSalary());
        }


    }
}
