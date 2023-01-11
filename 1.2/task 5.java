import java.util.Scanner;

public class Main {


    Scanner scan = new Scanner(System.in);

    static int a;
    static int b;
    static void p(int a,int b){
        a++;
        if(a < b){
            System.out.println(a);
            p(a,b);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        p(a,b);

}
}