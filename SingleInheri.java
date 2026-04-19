
public class SingleInheri {           //inheritance--> share properties-->using extends keyword-->reuseable code-->make code shorter
      public static void main(String[] args) {
       
      Student var1 = new Student();
      var1.name = "Sneha";
      var1.age = 21;
      var1.gender = "Female";
      var1.marks = 93.33;
      var1.fav();    //method
      System.out.println(var1.name);
      System.out.println(var1.age);
      System.out.println(var1.gender);
      Teacher var2 = new Teacher();
      var2.name = "Avinash sir";
      var2.age = 25;
      var2.subject = "Java";
      var2.gender = "Male";
      var2.fav();
      System.out.println(var2.name);
      System.out.println(var2.age);
      System.out.println(var2.subject);
      }
}
class Student{
    String name;
    int age;
    String gender;
    double marks;
    void fav(){   //method
        System.out.println("Studying");
    }
}
class Teacher extends Student{
    String subject;
    
}
