public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.name = "wolfy";
        wolf.weight = 55;
        wolf.age = 10;
        wolf.colour = "Grey";
        System.out.println("Пол - " + wolf.gender);
        System.out.println("Имя - " + wolf.name);
        System.out.println("Вес - " + wolf.weight);
        System.out.println("Возраст - " + wolf.age);
        System.out.println("Цвет - " + wolf.colour);
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}