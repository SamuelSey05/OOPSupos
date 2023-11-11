package HiLoGame;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class ScoreBoard {
    private List<Player> scoreBoard = new ArrayList<Player>();

    void displayScoreBoard () {
        for (Player i : scoreBoard) {
            System.out.println(i.toString());
        }
    }

    void addToScoreBoard (int score) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to save your score? (Y/N)");
        String ans = input.nextLine();

        if (ans == "n") {return;}

        System.out.println("Enter your name: ");
        ans = input.nextLine();

        scoreBoard.add(new Player(ans, (10 - score)));

        scoreBoard.sort(new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p1.getScore() - p2.getScore();
            }
        });
    }
}
