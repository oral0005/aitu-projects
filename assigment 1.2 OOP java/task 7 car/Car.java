public class Car {
    public String brand;
    public String klass,drivertype,engintype;
    public double weight;


    public void start(){
        System.out.println("Let's go");
    }
    public void stop(){
        System.out.println("Let's stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDrivertype(String drivertype) {
        this.drivertype = drivertype;
    }

    public void setEngintype(String engintype) {
        this.engintype = engintype;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void toStrings(){
        System.out.println("Brand "+brand);
        System.out.println(klass);
        System.out.println("Engine "+engintype);
        System.out.println("weight in KG "+weight);
        System.out.println("Driver "+drivertype);

    }

}
