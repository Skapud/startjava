import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerNum;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public String getPlayerName() {
        return playerName;
    }
}