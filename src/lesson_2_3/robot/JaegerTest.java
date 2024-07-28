package startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger("Striker Eureka", "Mark-5", "Destroyed", "Australia", 
                76.2, 41792, 10, 10, 9);
        robot1.displayInfo();
        robot1.setPowerMove("Six Shooter");
        robot1.powerMove();
        robot1.move();
        System.out.println();

        Jaeger robot2 = new Jaeger();
        robot2.setModelName("Cherno Alpha");
        robot2.setMark("Mark-1");
        robot2.setStatus("Destroyed");
        robot2.setOrigin("Russia");
        robot2.setHeight(85.34);
        robot2.setWeight(54487);
        robot2.setSpeed(3);
        robot2.setStrength(10);
        robot2.setArmor(10);
        robot2.displayInfo();
        robot2.setPowerMove("Sluggernaut Headshock");
        robot2.powerMove();
        robot2.move();
    }
}