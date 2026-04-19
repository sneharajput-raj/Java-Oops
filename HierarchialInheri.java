
public class HierarchialInheri {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.model = "Cycle";
        v.color = "Green";
        v.speed = 10;
        System.out.println(v.model);
        System.out.println(v.speed);
        car c = new car();
        c.model = "Mahindra Thar 4X4";
        c.color = "Black";
        c.speed = 160;
        c.price = "20Lakh";
        System.out.println(c.model);
        System.out.println(c.color);
        System.out.println(c.price);
        bike b = new bike();
        b.model = "Royal Enfield 350";
        b.color = "Grey";
        b.speed = 80;
        b.price = "2Lakh";
        System.out.println(b.model);
        System.out.println(b.color);
        System.out.println(b.speed);
        System.out.println(b.price);
        tractor t = new tractor();
        t.model = "John Deer 5050";
        t.color = "Green";
        t.price = "18Lakh";
        System.out.println(t.model);
        System.out.println(t.color);
        System.out.println(t.price);
    }
}
class vehicle{
    String model;
    String color;
    int speed;
    String price;
}
class car extends vehicle{}
class bike extends vehicle{}
class tractor extends vehicle{}