import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name 1:");
        String name1 = scan.nextLine();
        System.out.println("Enter age 1:");
        int ag1 = scan.nextInt();




        Person person1 = new Person(name1,ag1);


        person1.move(name1);
        person1.talk(name1);








}
}