public class Shops {
    public String shop;


    public void setShop(int sh) {
        Sulpak sulpak = new Sulpak();
        Evrika evrika = new Evrika();
        if(sh == 1){
            shop = sulpak.getShop();
        } else if (sh == 2) {
            shop = evrika.getShop();
        }

        this.shop = shop;
    }

    public String getShop() {
        return shop;
    }
}
