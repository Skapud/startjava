import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerRating;
    private String playerCountry;
    Scanner scanner = new Scanner(System.in);

    public String getPlayerName() {
        return playerName;
    }

    public void newPlayer() {
        System.out.println("Введите имя игрока");
        playerName = scanner.nextLine();
        System.out.println("Введите рейтинг игрока");
        playerRating = scanner.nextInt();
        System.out.println("Введите страну игрока");
        scanner.nextLine();
        playerCountry = scanner.nextLine();
    }

    public void playerInfo() {
        System.out.println("Имя игрока: " + playerName + 
                ". Рейтинг: " + playerRating + 
                ". Страна: " + playerCountry);
    }
}