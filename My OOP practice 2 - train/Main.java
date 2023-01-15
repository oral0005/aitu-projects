//package kz.aitu.oop.practice.practice2;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//instance for class Vagon
        Vagon vagon1 = new Vagon();
        System.out.println("1)Lokomotiv");
        System.out.println("2)Coupe");
        System.out.println("3)Plaskart");
        System.out.println("4)Cargo");
        System.out.println("Enter Vagon number:1,2,3,4");
//input variable for use method
        int num = scan.nextInt();
//call method
        vagon1.start(num);

    }
}