/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex44;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class App
{

    public static void main( String[] args ) throws FileNotFoundException {

        boolean productFound = true;

        String productOfInterest;
        File file = new File("src/main/java/ex44/exercise44_input.json"); // read json file
        ArrayList<Product> products;
        products = Product.getProducts(file);

        while(productFound) {
            System.out.print("What is the product name: "); // ask user for input
            Scanner input = new Scanner(System.in);
            productOfInterest = input.nextLine().toLowerCase(Locale.ROOT);


            for (Product product : products) { //check if object exists
                if (product.getName().toLowerCase(Locale.ROOT).equals(productOfInterest)) {
                    Product.printProduct(product);
                    productFound = false;
                    break;
                }
                }

            }

        }


    }

