package com.nima.module4.CSV;

import java.io.IOException;
import java.util.List;

public class Main {

    /**
     * Only using this Main class to test the if the code is working
     */
    public static void main(String[] args) {
        List<List<String>> content = List.of(
                List.of("Name", "Occupation", "Age"),
                List.of("Nima", "Student", "17"),
                List.of("George", "Student", "17"),
                List.of("Mr.Tang", "Teacher", "61")
        );
        try {
            Utility.createCSVFile("test.csv", content);
            System.out.println(Utility.getCSVFileContent("test.csv"));
            System.out.println(Utility.getRow("test.csv", 2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}