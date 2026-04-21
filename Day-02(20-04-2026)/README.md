# The code of Example 01
~~~
class Student{
    private int age;
    public void setAge(int newAge){
        if(newAge>0){
            age=newAge;
        }else{
            System.out.println("It's a wrong age value");
        }
    }
    public int getAge(){
        return age;
    }
}public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setAge(-5);
        s1.setAge(10);
        System.out.println("Student's Age"+s1.getAge);
    }
}
~~~
