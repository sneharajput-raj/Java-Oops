public class InheritancePlusEncapsulation {
   public static void main(String[] args) {     //Inheritance + Encapsulaiton   (kisi bi type ka inheritance le skte, bs data ko private rkhna)
        student s = new student();              //or us private data ko setter & getter se public krna
        s.setName("Sneha");
        s.setGender("Female");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());
        teacher t = new teacher();
        t.setName("Abhay");
        t.setGender("Male");
        t.setAge(27);
        t.setSubject("Maths");
        System.out.println(t.getName());
        System.out.println(t.getGender());
        System.out.println(t.getAge());
        System.out.println(t.getSubject());
    }
}
class student{
  private  String name; 
  private String gender;
  private int age;
  public void setName(String name){
      this.name = name;
  }
  public String getName(){
      return name;
  }
  public void setGender(String gender){
      this.gender = gender;
  }
  public String getGender(){
      return gender;
  }
  public void setAge(int age){
      this.age = age;
  }
  public int getAge(){
      return age;
  }
}
class teacher extends student{      //4 properties
    private String subject;
    public void setSubject(String subject){
      this.subject = subject;
  }
    public String getSubject(){
      return subject;
  }
}
