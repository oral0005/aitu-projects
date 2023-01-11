import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        long num = scan.nextLong();
        System.out.println("Enter weight:");
        float wei = scan.nextFloat();
        System.out.println("Enter Model:");
        String mod = scan.next();


        Phone phone1 = new Phone(num, mod, wei);
        Phone phone2 = new Phone(num, mod);

        String name1 = "Bob";

        phone1.setNumber(num);
        phone1.receiveCall(name1);
        phone1.sendMessage(num);






}
}