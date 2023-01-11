import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rows:");
        int rows = scan.nextInt();
        System.out.println("Columns:");
        int column = scan.nextInt();
        System.out.println("Multiplication matrix:");
        int mul = scan.nextInt();

        Matrix mat1 = new Matrix();

        System.out.println("Print matrix:");
        mat1.print(rows,column);
        System.out.println();
        System.out.println("Print matrix with multiple:");
        mat1.printm(rows,column,mul);






}
}