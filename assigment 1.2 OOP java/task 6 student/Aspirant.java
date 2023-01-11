public class Aspirant extends Student{



    public void getScholarship(String firstName,String lastName,double averageMark){
        System.out.println(firstName +" "+lastName+" "+averageMark);
        if(averageMark == 5){
            System.out.println("Scholarship 200$");
        }else{
            System.out.println("Scholarship 180$");
        }


}}
