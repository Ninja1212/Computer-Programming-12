package com.nima.module2.four;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // illiad.txt is put in the Module 2 folder for easy access
        Set<String> unique = new HashSet<>();
        Scanner scanner = new Scanner(new File("illiad.txt"));

        while (scanner.hasNext()) {
            // Makes the word lowercase and filters out all special characters
            String word = scanner.next().toLowerCase().replaceAll("[^a-z0-9]", "");
            unique.add(word);
        }
        scanner.close();
        System.out.println("There are " + unique.size() + " unique words.");
    }
}