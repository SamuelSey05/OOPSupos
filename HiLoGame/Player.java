package HiLoGame;


public class Player {
    private String name;
    private int score;

    public Player(String nName, int nScore) {
        name = nName;
        score = nScore;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int compare(Player p1, Player p2) {
        return p2.getScore() - p1.getScore();
    }

    public String toString () {
        return ("Player: " + name + "  Score: " + score);
    }
}