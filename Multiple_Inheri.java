public class Multiple_Inheri {
    public static void main(String[] args) {
        //multiple inheritance can be possible in java using 'interface' -->'implements'
        C c = new C();
        c.color();
    }
}
interface A{
    void color();
}
interface B{
    void color();
}
class C implements A,B{
    public void color(){
        System.out.println("Black color");
    }
}