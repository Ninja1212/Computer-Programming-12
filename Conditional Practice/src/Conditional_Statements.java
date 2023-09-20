import java.util.Objects;
import java.util.Scanner;
public class Conditional_Statements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you " + name + "?");
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("You can't drive.");
        }
        else if (age > 15 && age < 18) {
            System.out.println("You can drive but not vote.");
        }
        else if (age > 17 && age < 25) {
            System.out.println("You can vote but not rent a car.");
        }
        else if (age > 24) {
            System.out.println("You can do pretty much anything.");
        }


        Scanner input2 = new Scanner(System.in);
        System.out.println("How many pounds do you currently weigh on Earth?");
        double earth_Weight = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Which planet do you want to fight on?");
        System.out.println("1) Venus   2) Mars   3) Jupiter");
        System.out.println("4) Saturn   5) Uranus   6) Neptune");
        int chosen_Planet = input3.nextInt();

        if (chosen_Planet == 1) {
            System.out.println("Your weight on Venus is " + earth_Weight * 0.78 + " lbs.");
        }
        else if (chosen_Planet == 2) {
            System.out.println("Your weight on Mars is " + earth_Weight * 0.39 + " lbs.");
        }
        else if (chosen_Planet == 3) {
            System.out.println("Your weight on Jupiter is " + earth_Weight * 2.65 + " lbs.");
        }
        else if (chosen_Planet == 4) {
            System.out.println("Your weight on Saturn is " + earth_Weight * 1.17 + " lbs.");
        }
        else if (chosen_Planet == 5) {
            System.out.println("Your weight on Uranus is " + earth_Weight * 1.05 + " lbs.");
        }
        else if (chosen_Planet == 6) {
            System.out.println("Your weight on Neptune is " + earth_Weight * 1.23 + " lbs.");
        }


        int total_Score = 0;
        Scanner input4 = new Scanner(System.in);
        System.out.println("Do you want to take a Math quiz? (Y/N)");
        String answer = input4.nextLine();

        if (Objects.equals(answer, "Y")) {
            System.out.println("Ok, get ready!\t");
            Scanner input5 = new Scanner(System.in);
            System.out.println("Question 1: What is (2.6 - 10 * 7.2 / 3)?");
            System.out.println("a) -22");
            System.out.println("b) -21.4");
            System.out.println("c) 21.4");
            System.out.println("d) 17.76\t");
            String answer2 = input5.nextLine();

            if (Objects.equals(answer2, "b")) {
                System.out.println("Correct!");
                System.out.println();
                total_Score += 1;
            }
            else {
                System.out.println("Sorry, that's incorrect.");
                System.out.println();
            }

            Scanner input6 = new Scanner(System.in);
            System.out.println("Question 2: What is 2sin30?");
            System.out.println("a) 0.5");
            System.out.println("b) No Solution");
            System.out.println("c) -1");
            System.out.println("d) 1");
            System.out.println();
            String answer3 = input6.nextLine();

            if (Objects.equals(answer3, "d")) {
                System.out.println("Correct!");
                System.out.println();
                total_Score += 1;
            }

            else {
                System.out.println("Sorry, that's incorrect.");
                System.out.println();
            }

            Scanner input7 = new Scanner(System.in);
            System.out.println("Question 3: Dividing is the same as multiplying by the reciprocal.");
            System.out.println("a) True");
            System.out.println("b) False");
            System.out.println();
            String answer4 = input7.nextLine();

            if (Objects.equals(answer4, "a")) {
                System.out.println("Correct!");
                System.out.println();
                total_Score += 1;
            }
            else {
                System.out.println("Sorry, that's incorrect.");
                System.out.println();
            }

            System.out.println("You got " + total_Score + "/3 correct.");
            System.out.println("Thank you for playing!");
        }

        else if (Objects.equals(answer, "N")) {
            System.out.println("Alright, have a good day!");
        }


    }
}



