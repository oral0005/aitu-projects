public class Library {

    public String name,faculty,birth;
    public long card,phone;


    public String takebook(String name, int amount){
        System.out.println(name + " took " + amount+" books");
        return null;
    }
     public String returnbook(String name,int amount){
         System.out.println(name + " returned " + amount+" books");

        return null;
     }


}
