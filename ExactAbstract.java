abstract class Bank{                      //Moniter to all extends classes
    abstract void getInterestRate();      //abstract method -->no body inside abstract function(nothing will be declared here)
    void welcomeNote(){                   //non-abstract method -->it will represent the working -->No change can be possible for non-abstract class in extends classes
        System.out.println("Welcome!!");    
    }
}
class PNB extends Bank{
    void getInterestRate(){
          System.out.println("PNB interest rate is 6.5%");
     }
}
class SBI extends Bank{
     void getInterestRate(){
          System.out.println("SBI interest rate is 8%");
     }
}
public class ExactAbstract {
  public static void main (String[] args){
    Bank c1 = new PNB();                     //properties PNB ki pr blueprint BANK ka
    c1.getInterestRate();
    c1.welcomeNote();
    Bank c2 = new SBI();
    c2.getInterestRate();
    c2.welcomeNote();
  }
}
