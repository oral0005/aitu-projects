//inheritance
public class Cargo extends Vagon{
    //constructor
    public Cargo(String type, int carry, int replacement, int power, int windows) {
        //set variables
        this.type = type;
        this.carry = carry;
        this.replacement = replacement;
        this.power = power;
        this.windows = windows;
        //print Vagon Characteristics
        System.out.println("Type "+type);
        System.out.println("Carry weight "+carry);
        System.out.println("Replacement of people " +replacement);
        System.out.println("Power "+power);
        System.out.println("Windows "+windows);
    }
}
