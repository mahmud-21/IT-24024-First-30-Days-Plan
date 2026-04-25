public class Teacher{
    String Name,Gender;
    int phone;
    Teacher(String n,String g,int p){
        Name=n;
        Gender=g;
        phone=p;
    }
    void displayInformation(){
        System.out.println("Teacher's Name : "+Name);
        System.out.println("Teacher's Name : "+Gender);
        System.out.println("Teacher's Name : "+phone);
        System.out.println("\n\n");
    }
}
