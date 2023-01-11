import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String[] fname = new String[3];
        fname[0] = "Peter";
        fname[1] = "Robin";
        fname[2] = "Tony";
        String[] lname = new String[3];
        lname[0] = "Parker";
        lname[1] = "Good";
        lname[2] = "Stark";
        double[] mark = new double[3];
        mark[0] = 3;
        mark[1] = 4;
        mark[2] = 5;

        Student stu1 = new Student();
        for(int i = 0;i < 3;i++){
            stu1.getScholarship(fname[i],lname[i],mark[i]);
        }
        Aspirant asp1 = new Aspirant();
        for(int i = 0;i < 3;i++){
            asp1.getScholarship(fname[i],lname[i],mark[i]);
        }






    }}