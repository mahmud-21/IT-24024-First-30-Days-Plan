public class Teacher{
    String Name,Gender;
    int phone;
    Teacher(){
        System.out.println("No Data Received !");
    }
    Teacher(String n,String g){
        Name=n;
        Gender=g;
    }
    Teacher(String n,String g,int p) {
        Name = n;
        Gender = g;
        phone=p;
    }
    void displayInformation(){
        System.out.println("Teacher's Name : "+Name);
        System.out.println("Teacher's Gender : "+Gender);
        System.out.println("Teacher's Phone : "+phone);
        System.out.println("\n\n");
    }
}
