# The code of Example 01
~~~
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
public class Main{
    public static void main(String[] args){
        Teacher teacher1=new Teacher();
        teacher1.displayInformation();
        Teacher teacher2=new Teacher("Anisul Islam","Male");
        teacher2.displayInformation();
        Teacher teacher3=new Teacher("Md Mahmudur Rahman","Male",1749272722);
        teacher3.displayInformation();
    }
}
~~~
