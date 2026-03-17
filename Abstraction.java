public class Abstraction {       //private the class using 'abstract' keyword
    public static void main(String[] args) {
        SBI c1 = new SBI();    //created in individual banks 
        c1.interestRate();
        c1.interestOnRd();
        c1.setName("Naman");
        System.out.println(c1.getName());
        PNB c2 = new PNB();
        c2.interestRate();
        c2.interestOnRd();
        BOB c3 = new BOB();
        c3.interestRate();
        c3.interestOnRd();
        c3.repoRate();
        c3.setName("Pretii");
        System.out.println(c3.getName());
    }
}
abstract class RBI{        //controller 
    abstract void interestRate();    //these are functions--> functions privated using abstract keyword --> variable/string private using private keyword
    abstract void interestOnRd();
    abstract void repoRate();
    private String name;            //private data --> ka setter/getter abstract class mein hi banega -->now it will public so hum directly main function me call ke skte
     public void setName(String name){
        this.name = name;
     }
     public String getName(){
        return name;
     }
}
class SBI extends RBI{
    void interestRate(){      //fixed and decided by RBI
        System.out.println("8 % on home loan");
    }
    void interestOnRd(){
        System.out.println("7 % on RD");
    }
    void repoRate(){
        System.out.println("7.90 % ");
    }
}
class PNB extends RBI{
    void interestRate(){      
        System.out.println("6 % on home loan");
    }
    void interestOnRd(){
        System.out.println("6.5 % RD");
    }
    void repoRate(){
        System.out.println("7.30 %");
    }
}
  //jitne function abstract class mein hai untne sabhi function sari extends class mein banane honge -->else override error occur
class BOB extends RBI{
    void interestRate(){
        System.out.println("10 % on home loan");
    }
    void interestOnRd(){
        System.out.println("9.5 % on RD");
    }
    void repoRate(){
        System.out.println("8.7 % ");
    }
}