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
