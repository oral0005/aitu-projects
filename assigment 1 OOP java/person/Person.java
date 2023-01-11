public class Person {

    public String fullName;
    public int age;

    public Person(){

    }
    public Person(String _fullName,int _age){

    }

    public String talk(String fullName){
        System.out.println(fullName + " and such Person is talking");
        return null;

    }

    public void move(String fullName){
        this.fullName = fullName;
    }


}
