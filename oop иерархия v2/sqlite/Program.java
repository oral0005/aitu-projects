
import java.sql.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Program program = new Program();
        program.open();
        program.insert();
        program.close();
    }
    Connection co;
    void open(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:users1.db");
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    void insert(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter user name: ");
            String name = scan.nextLine();
            System.out.print("Enter user phone: ");
            String phone = scan.nextLine();
            String query = "INSERT INTO users(name,phone)"+
                    "VALUES ('" + name + "','" + phone +"')";
            Statement statement = co.createStatement();
            statement.executeUpdate(query);
            System.out.println("Rows added");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void close(){
        try {
            co.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }



}


}