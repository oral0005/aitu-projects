public class Phone {

    public long number;
    public String model, name;
    public float weight;


    public Phone(long _number, String _model, float _weight){
        this(_number,_model);
    }
    public Phone (long _number,String _model){
        System.out.println("Number " + _number);
        System.out.println("Model " + _model);
    }
    public Phone (){

    }

    public String receiveCall(String name) {
        System.out.println(name + " is ringing" );
        System.out.println("Number: "+getNumber());
        return null;
    }

    public long sendMessage(long number){
        System.out.println("send message to-" + getNumber());
        return 0;
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
    this.number = number;
    }


}
