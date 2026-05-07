public class Student{
    String name;
    int id;
    static String UniversityName="MBSTU";
    Student(String n,int i){
        name =n;
        id=i;
    }
    void displayInfo(){
        System.out.println("The name of the Student :"+name);
        System.out.println("The id of the Student :"+id);
        System.out.println("The name of the university : "+UniversityName);
    }
}