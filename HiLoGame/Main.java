package HiLoGame;

import java.util.Scanner;

class Main {

    

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
        int answer ;
        int max;
        int num;
        int guesses;
        ScoreBoard scoreBoard = new ScoreBoard(); 
        
        System.out.println("Would you like to play a game of HiLo? (1/2)");
        answer = Integer.valueOf(input.nextLine());

        while (answer == 1) {
            HiLo game = new HiLo();

            max = HiLo.getDiff();
            num = Randomizer.generateRan(max);
            guesses = game.PlayGame(max, num);
            scoreBoard.addToScoreBoard(guesses);
            scoreBoard.displayScoreBoard();

            System.out.println("Would you like to play a rematch? (Y/N)");
            answer = Integer.valueOf(input.nextLine());
        }
    }
}
