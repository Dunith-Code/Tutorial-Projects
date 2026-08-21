import java.util.Scanner;

public class Main {
    public static void guessNumberGame() {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        // track the numbrt of attempts
        int attempts = 0;

        // Number of attemps
        int n = 5;
        boolean guessCorrectly = false;

        System.out.println("A number is choosen between 1 and 100");
        System.out.println("You have " + n + " attempts to guess the correct number");

        while (!guessCorrectly) {

            // Loop for n attempts
            for (int i = 0; i < n; i++) {
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number in "
                            + attempts + " attempts.");
                    guessCorrectly = true;
                    break;

                } else if (guess < number) {
                    System.out.println(
                    "The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess); 
                }
            }
            
            if (!guessCorrectly) { 
                // ask from the user if they want to continue
                System.out.println("You have used all " + attempts + " attempts");

                System.out.print("Do you want continue guessing? (yes/no): ");
                String response = sc.next();

                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Game Over! The correct number was: " + number);
                    break;
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}