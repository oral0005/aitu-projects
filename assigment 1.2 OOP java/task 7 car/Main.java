import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car = new Car();
        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();
        car.setBrand("Mercedes");
        car.setKlass("S-klass");
        car.setEngintype("turbo");
        car.setWeight(2200);
        car.setDrivertype("Racer");
        car.toStrings();

    }
}