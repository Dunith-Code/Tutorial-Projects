import java.util.Scanner;

public class Main {
    public static void guessNumberGame() {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        // Number of attemps
        int n = 5;

        System.out.println("A number is choosen between 1 and 100");
        System.out.println("You have " + n + " attempts to guess the correct number");

        // Loop for n attempts
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congrtulations! You guesses the correct number");
                sc.close();
                return;
            } else if (guess < number) {
                System.out.println(
                "The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess); 
            }
        }

        // if user runs out of attempts
        System.out.println("You have exhausted all atempts. The correct number was: " + number);
        sc.close();
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}