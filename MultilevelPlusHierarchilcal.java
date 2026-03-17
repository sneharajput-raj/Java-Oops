public class MultilevelPlusHierarchilcal {
    public static void main(String[] args) {    //Multilevel + Hierarchical Inheritance 
       grandParent g = new grandParent();
       g.name = "Samrat";
       System.out.println(g.name);
       parent p = new parent();
       p.gender = "Male";
       p.occupation = "Farming";
       System.out.println(p.gender);
       System.out.println(p.occupation);
       child c = new child();
       c.age = 21;
       c.hobby = "Traveling";
       System.out.println(c.age);
       System.out.println(c.hobby);
       child1 c1 = new child1();
       c1.town = "Narmadapuram";
       c1.marks = 93.33;
       System.out.println(c1.town);
       System.out.println(c1.marks);
       child2 c2 = new child2();
       c2.name = "Lucky";
       c2.mobNo = "5267482943";
       System.out.println(c2.name);
       System.out.println(c2.mobNo);
       child3 c3 = new child3();
       c3.qualification = "12th";
       c3.age = 18;
       c3.hobby = "Gardening";
       System.out.println(c3.qualification);
       System.out.println(c3.age);
       System.out.println(c3.hobby);
    }
}
class grandParent{
    String name; 
    int age; 
    String gender;
}
class parent extends grandParent{
    String occupation;
    String town; 
    String mobNo;
    String qualification;
}
class child extends parent{
    double marks;
    String hobby;
}
class child1 extends child{}
class child2 extends child{}
class child3 extends child{}
