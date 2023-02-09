public class Shops {
    public String shop;
    public String basket;

    public void setShop(int sh) {
        Sulpak sulpak = new Sulpak();
        Evrika evrika = new Evrika();
        Mechta mechta = new Mechta();
        if(sh == 1){
            shop = sulpak.getShop();

        } else if (sh == 2) {
            shop = evrika.getShop();

        } else if (sh == 3) {
            shop = mechta.getShop();
        }

        this.shop = shop;

    }

    public String getShop() {
        return shop;

    }

}
