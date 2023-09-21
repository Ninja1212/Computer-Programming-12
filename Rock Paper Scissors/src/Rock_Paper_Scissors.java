import java.util.Objects;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play rock, paper, scissors? (y/n)");
        String wantsToPlay = input.nextLine();

        if (Objects.equals(wantsToPlay, "y")) {
            System.out.println();
            System.out.println("Cool! Rock is 'r', paper is 'p', scissors is 's' and quit is 'q'.\t");

            while (true) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("What is your pick?");
                String playersPick = input2.nextLine();
                int computersPick = (int) (Math.random() * 3) + 1;

                if (Objects.equals(playersPick, "r") && computersPick == 1) {
                    System.out.println();
                    System.out.println("Tie");
                    System.out.println("You and the computer both chose rock.");
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "p") && computersPick == 2) {
                    System.out.println();
                    System.out.println("Tie");
                    System.out.println("You and the computer both chose paper.");
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "s") && computersPick == 3) {
                    System.out.println();
                    System.out.println("Tie");
                    System.out.println("You and the computer both chose scissors.");
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "r") && computersPick == 2) {
                    System.out.println();
                    System.out.println("You lose!");
                    System.out.println("You chose rock while the computer chose paper.");
                    computerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "r") && computersPick == 3) {
                    System.out.println();
                    System.out.println("You win!");
                    System.out.println("You chose rock while the computer chose scissors.");
                    playerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "p") && computersPick == 1) {
                    System.out.println();
                    System.out.println("You win!");
                    System.out.println("You chose paper while the computer chose rock.");
                    playerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "p") && computersPick == 3) {
                    System.out.println();
                    System.out.println("You lose!");
                    System.out.println("You chose paper while the computer chose scissors.");
                    computerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "s") && computersPick == 1) {
                    System.out.println();
                    System.out.println("You lose!");
                    System.out.println("You chose scissors while the computer chose rock.");
                    computerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "s") && computersPick == 2) {
                    System.out.println();
                    System.out.println("You win!");
                    System.out.println("You chose scissors while the computer chose paper.");
                    playerScore += 1;
                    System.out.println("Your score: " + playerScore + "\t Computer's score: " + computerScore);
                } else if (Objects.equals(playersPick, "q")) {
                    System.out.println();
                    System.out.println("Farewell friend.");
                    break;
                } else {
                    System.out.println();
                    System.out.println("That is not a proper input. Please try again.");
                }
            }
        } else if (Objects.equals(wantsToPlay, "n")) {
            System.out.println();
            System.out.println("Okay, goodbye!");
        } else {
            System.out.println();
            System.out.println("That is not a proper input. Please rerun this code and try again.");
        }
    }
}