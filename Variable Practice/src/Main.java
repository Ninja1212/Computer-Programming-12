
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 113;
        double y = 2.71828;
        String z = "Computer Science";

        System.out.println("He died at " + x + " years of age!");
        System.out.println("Her answer was " + y + " for the last question on the Math test.");
        System.out.println("One of the most difficult fields to study is " + z + ".");
        System.out.println();


        String subject1 = "Free Block";
        String subject2 = "Physics";
        String subject3 = "Computer Programming";
        String subject4 = "Pre-Calculus";
        String subject5 = "Chemistry";
        String subject6 = "Calculus";
        String subject7 = "English Studies";
        String subject8 = "Economics";
        String subject1Teacher = "N/A";
        String subject2Teacher = "Mr. Tang";
        String subject3Teacher = "Mr. Zaremba";
        String subject4Teacher = "Ms. Reid";
        String subject5Teacher = "Mr. Slapsys";
        String subject6Teacher = "Mr. Grabowski";
        String subject7Teacher = "Ms. Au";
        String subject8Teacher = "Mr. Nyhus";

        System.out.println("+-------------------------------+");
        System.out.println("| 1) " + subject1 + "      | " + subject1Teacher + " |");
        System.out.println("| 2) " + subject2 + "   | " + subject2Teacher + "   |");
        System.out.println("| 3) " + subject3 + "     | " + subject3Teacher + "       |");
        System.out.println("| 4) " + subject4 + "     | " + subject4Teacher + "     |");
        System.out.println("| 5) " + subject5 + " | " + subject5Teacher + "    |");
        System.out.println("| 6) " + subject6 + "        | " + subject6Teacher + "   |");
        System.out.println("| 7) " + subject7 + "     | " + subject7Teacher + "    |");
        System.out.println("| 8) " + subject8 + "   | " + subject8Teacher + "  |");
        System.out.println("+-------------------------------+");


        Scanner order = new Scanner(System.in);
        int drinkPrice = 2;
        double hotdogPrice = 5.50;
        double tax = 1.12;
        double totalPrice = 0;

        System.out.println("How many drinks would you like? ($2 each)");
        totalPrice += drinkPrice * order.nextInt();
        System.out.println("How many hotdogs would you like? ($5.50 each)");
        totalPrice += hotdogPrice * order.nextInt();
        System.out.println("Please pay $" + totalPrice * tax);


    }
}