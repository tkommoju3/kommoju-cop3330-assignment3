package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileHTest {

    @Test
    void readPeople() throws FileNotFoundException {
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        ArrayList<Main> people = new ArrayList<>();
        ArrayList<Main> testPeople = new ArrayList<>();
        Main personOne = new Main("Ling","Mai",55900);
        Main personTwo = new Main("Johnson","Jim",56500);
        Main personThree = new Main("Jones","Aaron",46000);
        Main personFour = new Main("Jones","Chris",34500);
        Main personFive = new Main("Swift","Geoffrey",14200);
        Main personSix = new Main("Xiong","Fong",65000);
        Main personSeven = new Main("Zarnecki","Sabrina",51500);
        testPeople.add(personOne);
        testPeople.add(personTwo);
        testPeople.add(personThree);
        testPeople.add(personFour);
        testPeople.add(personFive);
        testPeople.add(personSix);
        testPeople.add(personSeven);
        Scanner fileReader = new Scanner(file);
        String line;
        while(fileReader.hasNextLine()) {
            line = fileReader.nextLine();
            Scanner lineReader = new Scanner(line).useDelimiter(",");
            String lastName = lineReader.next();
            String firstName = lineReader.next();
            int salary = Integer.parseInt(lineReader.next());
            Main person = new Main(lastName, firstName, salary);
            people.add(person);
            lineReader.close();
        }
        fileReader.close();
        for(int i = 0; i < testPeople.size(); i++) {
            assertEquals(testPeople.get(i).getLastName(), people.get(i).getLastName());
            assertEquals(testPeople.get(i).getFirstName(), people.get(i).getFirstName());
            assertEquals(testPeople.get(i).getSalary(), people.get(i).getSalary());
        }

    }

}
