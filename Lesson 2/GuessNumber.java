import java.util.Scanner;

public class GuessNumber {
    private int a = 0;
    private int b = 100;
    private int playerNum;
    private int guessedNum;
    Scanner scanner = new Scanner(System.in);

    public void playGame(Player player1, Player player2) {
        guessedNum = a + (int)(Math.random() * (b + 1));
        do {
            System.out.println("Игрок " + player1.getPlayerName() + ", введите число от 1 до 100:");
            checkNum();
            if (playerNum == guessedNum) {
                System.out.println("Победил " + player1.getPlayerName());
                break;
            }
            System.out.println("Игрок " + player2.getPlayerName() + ", введите число от 1 до 100:");
            checkNum();
            if (playerNum == guessedNum) {
                System.out.println("Победил " + player2.getPlayerName());
                break;
            }
        } while (true);
    }

    public void checkNum() {
            do {
                playerNum = scanner.nextInt();
                if (playerNum < 0 || playerNum > 100) {
                    System.out.println("Введено число в незаданном диапазоне, повторите ввод:");
                    scanner.nextLine();
                }
            } while (playerNum < 0 || playerNum > 100);
    }
}