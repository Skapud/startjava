import java.util.Scanner;

public class GuessNumber {
    private int arg1 = 1;
    private int arg2 = 100;
    private int guessedNum;
    private int typedNum;
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        guessedNum = arg1 + (int) (Math.random() * (arg2 - arg1 + 1));
        Player currentPlayer = player1;
        do {
            System.out.println("Игрок " + currentPlayer.getPlayerName() + 
                    ", введите число от 1 до 100:");
            checkNum(currentPlayer);
            if (typedNum == guessedNum) {
                System.out.println("Победил " + currentPlayer.getPlayerName());
                break;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        } while (true);
    }

    public void checkNum(Player currentPlayer) {
        do {
            typedNum = scanner.nextInt();
            currentPlayer.setPlayerNum(typedNum);
            if (typedNum < arg1 || typedNum > arg2) {
                System.out.println("Введено число в незаданном диапазоне, повторите ввод:");
                scanner.nextLine();
            }
        } while (typedNum < arg1 || typedNum > arg2);
    }
}