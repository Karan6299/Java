package MyPackage;

public class Student {  
    public static class Stude{
       String name;
       int rno;
       double percent;
   }
    public static void  fun(Stude x){
        System.out.println(x.name);
        return;
        
    }
    public static void change(Stude s){
        s.name = "Golu";
    }
    public static void main(String[] args) {
       
        Stude s1 = new Stude();
        s1.name = "karan";
        s1.rno = 24;
        s1.percent = 86;
        System.out.println(s1.name);
        s1.name ="manish";

        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);


        // fun(s1);

      


    }
    
}
