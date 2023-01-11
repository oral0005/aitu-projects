import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Animal ani = new Animal();
        Veterinary vet = new Veterinary();
        System.out.println("Enter animal name:");
        String anim = scan.nextLine();
        ani.makeNoise(anim);
        ani.eat(anim);
        ani.sleep(anim);
        String[] anima = new String[3];
        anima[0] = "Dog";
        anima[1] = "Cat";
        anima[2] = "Horse";
        String[] food = new String[3];
        food[0] = "meat";
        food[1] = "milk";
        food[2] = "grass";
        String[] loc = new String[3];
        loc[0] = "house dog";
        loc[1] = "house";
        loc[2] = "barn";
        for(int i = 0;i < 3;i++){
            vet.treatAnimal(anima[i],food[i],loc[i]);
        }





    }}