# The code of Example 01
~~~
public class Teacher{
    String Name,Gender;
    int phone;
//    void setInformation(String n,String g,int p){
//        Name=n; this method will not be needed while using construcor
//        Gender=g;
//        phone=p;
//    }
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
public class Main{
    public static void main(String[] args){
        Teacher t1=new Teacher("Dr.Ziaur Rahman","Male",1721539084);
//        t1.setInformation("Dr.Ziaur Rahman","Male",1721539084);
//        t1.Name="Dr.Ziaur Rahman";
//        t1.Gender="Male";
//        t1.phone=1721539084;
        t1.displayInformation();
        Teacher t2=new Teacher("MSt. Nargis Akter","Female",1721539084);
//        t2.setInformation("MSt. Nargis Akter","Female",1721539084);
//        t2.Name="MST. NArgis Akter";
//        t2.Gender="Female";
//        t2.phone=1721539084;
        t2.displayInformation();

    }
}
~~~
