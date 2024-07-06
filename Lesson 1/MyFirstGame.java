public class MyFirstGame {
    public static void main(String[] args) {
        int numberGuessed = 50;
        int numberPlayers = 100;
        while (numberPlayers != numberGuessed) {
            if (numberGuessed > numberPlayers) {
                System.out.println(numberPlayers + " меньше того, что загадал компьютер");
                numberPlayers += 1;
            } else {
                System.out.println(numberPlayers + " больше того, что загадал компьютер");
                numberPlayers -= 1;
            }
        } 
        System.out.println("Вы победили");
    }
}