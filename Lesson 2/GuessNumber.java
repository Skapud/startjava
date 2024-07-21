import java.util.Scanner;

public class GuessNumber {
    private int min = 1;
    private int max = 100;
    private int guessedNum;
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessedNum = min + (int) (Math.random() * (max - min + 1));
        Player currentPlayer = player1;
        do {
            System.out.println("Игрок " + currentPlayer.getName() + 
                    ", введите число от 1 до 100:");
            enterNum(currentPlayer);
            if (currentPlayer.getNum() == guessedNum) {
                System.out.println("Победил " + currentPlayer.getName());
                break;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        } while (true);
    }

    public void enterNum(Player currentPlayer) {
        do {
            int enteredNum = scanner.nextInt();
            currentPlayer.setNum(enteredNum);
            if (currentPlayer.getNum() == guessedNum) { 
                break;
            } else if (currentPlayer.getNum() < min || currentPlayer.getNum() > max) {
                System.out.println("Введено число в незаданном диапазоне, повторите ввод:");
                scanner.nextLine();
            } else {
                System.out.println(currentPlayer.getNum() + " " + 
                        (currentPlayer.getNum() > guessedNum ? "больше" : "меньше") + 
                        " того, что загадал компьютер");
                break;
            }
        } while (true);
    }
}