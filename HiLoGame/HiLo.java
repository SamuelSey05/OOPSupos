package HiLoGame;

import java.util.Scanner;

public class HiLo {


    static int getDiff() {
        Scanner input = new Scanner(System.in); 

        System.out.println("Select your difficulty 1 - up to 50, 2 - up to 100, 3 - up to 200.");
            int choice = Integer.valueOf(input.nextLine());
            switch (choice) {
                case 1:
                    return 50;
                case 2:
                    return 100;
                case 3:
                   return 200;
                default:
                    System.out.println("Invalid choice. Ending game.");
                    System.exit(0);
            }
        return 0;
    }

    int PlayGame(int max, int num) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Guess a number between 1 and " + max + ".");
        boolean again = true;
        int nOfGuess = 1;

        do {
            int guess = Integer.valueOf(input.nextLine());

            if (guess == num) {
                again = false;
                System.out.println("Congrats! Your number of guesses: " + nOfGuess);
            } else if (guess > max || guess < 0) {
                System.out.println("Guess out of range!");
            } else if (guess > num) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            
            if (again && nOfGuess < 10) {
                nOfGuess += 1;
                System.out.println("Guess again! Guess a number between 1 and " + max + ".");
            }
        } while (again && nOfGuess < 10);
        
        if (again) {
            System.out.println("You lose!");
            return -1;
        }
        return nOfGuess;
    }
}