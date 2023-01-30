public class Sulpak extends Shops{
   String shop1 = "jdbc:sqlite:C:/sqlite/users.db";

    @Override
    public String getShop() {
        return shop1;
    }
}
