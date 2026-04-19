public class Hybrid_Inheri {
    public static void main(String[] args) {
        //hybrid inheritance can be possible in java by --> 'class + interface'
        C c = new C();
        c.show();
    }
}
class A{
    void msg(){
        System.out.println("class A");
    }
}
interface B{
    void show();
}
class C extends A implements B{
    public void show(){
        System.out.println("Interface b");
    }
}