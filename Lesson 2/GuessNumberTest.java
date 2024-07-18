import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        Player player1 = new Player();
        player1.newPlayer();
        player1.playerInfo();
        Player player2 = new Player();
        player2.newPlayer();
        player2.playerInfo();
        String answer;
        do {
            guessNumber.playGame(player1, player2);
            do { 
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
