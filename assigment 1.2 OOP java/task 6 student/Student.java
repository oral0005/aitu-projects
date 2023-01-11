public class Student{
    public String firstName,lastName;
    public int group;
    public double averageMark;

    public void getScholarship(String firstName,String lastName,double averageMark){
        System.out.println(firstName +" "+lastName+" "+averageMark);
        if(averageMark == 5){
            System.out.println("Scholarship 100$");
        }else{
            System.out.println("Scholarship 80$");
        }

    }

}






