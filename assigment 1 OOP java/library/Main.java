import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
         System.out.println("Enter name:");
        String nam = scan.nextLine();
        System.out.println("Enter card number:");
        long card = scan.nextLong();
        System.out.println("Enter faculty:");
        String facul = scan.next();
        System.out.println("Enter birthday:");
        String birth = scan.next();
        System.out.println("Enter phone:");
        long phone = scan.nextLong();
        System.out.println("Enter amount of books:");
        int amo = scan.nextInt();









        System.out.println(nam);
        System.out.println(card);
        System.out.println(facul);
        System.out.println(birth);
        System.out.println(phone);

        lib.takebook(nam,amo);
        lib.returnbook(nam,amo);




}
}