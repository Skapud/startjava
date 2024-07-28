package startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        System.out.println("Игрок 1: " + player1.getName() + 
                " против Игрока 2: " + player2.getName());
        String answer;
        do {
            game.start();
            do { 
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
