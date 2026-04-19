
public class MultiLevelInheri {
    public static void main(String[] args) {
        grandParent g = new grandParent();
        g.name = "Chotan Patel";
        g.age = 66;
        g.gender = "Male";
        System.out.println(g.name);
        System.out.println(g.age);
        parent p = new parent();
        p.name = "Rajkumar";
        p.age = 45;
        p.occupation = "Farming";
        p.gender = "Male";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.occupation);
        child c = new child();
        c.name = "Nehal";
        c.age = 20;
        c.gender = "Male";
        c.qulification = "12th";
        c.occupation = "Berojgar";
        System.out.println(c.name);
        System.out.println(c.occupation);
        System.out.println(c.qulification);
    }
}
class grandParent{
    String name;
    int age;
    String occupation;
    String gender;
}
class parent extends grandParent{}
class child extends parent{
    String qulification;
}