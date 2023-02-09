import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main program = new Main();

        if (program.open()){
            //program.insert();
            program.select();
            program.close();}
    }
    Connection co;
    Connection so;
    String us = "";
    boolean open(){
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("1) Sulpak");
            System.out.println("2) Evrika");
            System.out.println("3) Mechta");
            System.out.print("Choose: ");
            int sh = scan.nextInt();
            if(sh == 1){
                us = "users";
            } else if (sh == 2) {
                us = "users1";
            } else if (sh == 3) {
                us = "users2";
            }
            Shops shop = new Shops();
            shop.setShop(sh);
            String shops = shop.getShop();

            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection(shops);
            so = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/basket.db");

            return true;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }


    }
    void insert(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter id: ");
            int id = scan.nextInt();
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter parent_id: ");
            int parent_id = scan.nextInt();
            System.out.print("Enter price: ");
            int price = scan.nextInt();
            String query = "INSERT INTO '"+ us +"'(id,name,parent_id,price)"+
                    "VALUES ('" + id + "','" + name + "','" + parent_id +"','" + price + "')";
            Statement statement = co.createStatement();
            statement.executeUpdate(query);
            System.out.println("Rows added");
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void select(){
        Scanner scan = new Scanner(System.in);
        try{
            String query = "SELECT id,name,price FROM '"+ us +"'";
            Statement statement = co.createStatement();
            Statement statement1 = so.createStatement();
            ResultSet rs = statement.executeQuery(query);


            int b = 0;
            while(rs.next()){
                if(b == 3) {
                    break;
                }else {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("price");
                    System.out.println(id +") " + name);
                    b++;
                }
            }
            while(true){

                System.out.print("Choose: ");
                int a = scan.nextInt();

                if(a > 0) {

                    String quer = "SELECT id,name,price FROM '"+ us +"' WHERE parent_id = '"+a+"'";

                    ResultSet rs3 = statement.executeQuery(quer);
                    int c = 0;

                    while(rs3.next()) {
                        String id = rs3.getString("id");
                        String name = rs3.getString("name");
                        String  price = rs3.getString("price");
                        int pric = Integer.parseInt(price);

                        if(pric > 0) {
                            System.out.println(id + ") " + name + " Price:" + pric + "$");
                        }else{
                            System.out.println(id + ") " + name);
                        }



                    }
                    String qeu = "SELECT name,price FROM '"+ us +"' WHERE id = '"+ a +"'";
                    ResultSet rs4 = statement.executeQuery(qeu);
                    String pri = rs4.getString("price");
                    c = Integer.parseInt(pri);
                    String na = rs4.getString("name");
                    if(c > 0){


                        String ins = "INSERT INTO basket(name,price)"+
                                "VALUES ('" + na + "','" + c + "')";

                        statement1.executeUpdate(ins);
                        statement1.close();
                    }





                } else if (a == 0) {
                    rs.close();
                    statement.close();

                    int check = 0;
                    String out = "SELECT id,name,price FROM basket";
                    ResultSet rs5 = statement1.executeQuery(out);
                    System.out.println("Your basket:");
                    while(rs5.next()){
                        String id = rs5.getString("id");
                        String name = rs5.getString("name");
                        String  price = rs5.getString("price");
                        System.out.println(name + " Price:" + price+"$");
                        int c = Integer.parseInt(price);
                        check += c;
                    }
                    statement1.close();
                    System.out.println("Your check: " + check +"$");
                    String del = "DELETE FROM basket";
                    statement1.executeUpdate(del);

                    break;
                }
            }

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