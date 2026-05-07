# The code of Example 01
~~~
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
System.out.println("The nid of the Student :"+id);
System.out.println("The name of the university : "+UniversityName);
}
}
public class Main{
public static void main(String[] args) {
Student s1=new Student("Anisul Islam",10);
s1.displayInfo();
}
}
~~~
# The Code of Example 02
~~~
public class staticVariable{
    static String UniversityName="MBSTU";
}
ublic class staticVariableTest{
    public static void main(String[] args) {
        System.out.println("The name of the Student's University : "+staticVariable.UniversityName);
    }
}
~~~