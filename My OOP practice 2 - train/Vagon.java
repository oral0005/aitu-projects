public class Vagon {
    //variables
    public String type;
    public int carry;
    public int replacement;
    public int power;
    public int windows;
//method
    public void start(int num) {
        System.out.println("Characteristics");
        if (num == 1){
            //call Lokomotiv constructor
            Lokomotiv lokomotiv = new Lokomotiv("Engine", 0, 2, 1000, 4);
        } else if (num == 2) {
            //call Coupe constructor
            Coupe coupe = new Coupe("Passenger", 500, 30, 0, 20);
        } else if (num == 3) {
            //call Plaskart constructor
            Plaskart plaskart = new Plaskart("Passenger", 700, 50, 0, 20);
        } else if (num == 4) {
            //call Cargo constructor
            Cargo cargo = new Cargo("Cargo", 10000, 0, 0, 0);
        }
    }




}
