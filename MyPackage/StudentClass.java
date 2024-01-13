package MyPackage;
public class StudentClass{
    public static class Student{
        String name;//user define dataType
        int rno;
        double percent;
    }
    public static void main(String [] args){
        Student s = new Student(); //declaration //create a object
        s.name = "karan";//inilization
        s.rno = 23;
        s.percent = 58.9;
        System.out.println(s.name);

        Student s1 = new Student();
        s1.name ="Manish";
        s1.rno = 24;
        s1.percent = 87;
        System.out.println(s.percent);

    }
}