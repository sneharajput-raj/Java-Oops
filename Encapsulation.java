public class Encapsulation {            //data hiding
    public static void main(String[] args) {
        bankDetails bd = new bankDetails();
        bd.setName("Sneha");
        System.out.println(bd.getName());
        bd.setIFSCcode("FSCD3246");
        System.out.println(bd.getIFSCcode());
        bd.setMobno("6527672367");
        System.out.println(bd.getMobno());
        bd.setAccountno("9190009234787");
        System.out.println(bd.getAccountno());
        bd.age = 22;
        System.out.println(bd.age);
    }
}
class bankDetails{
    private String name;
    private String ifscCode;              //secure data
    private String mobNo;
    private String accountNo;
    int age;                      // age public hai toh setter or getter function ki need nhi h
    public void setName(String name){             //setter-->change or update value
        this.name = name;
    }
    public String getName(){                       //getter--> read or return value
        return name;
    }
    public void setIFSCcode(String ifscCode){
        this.ifscCode = ifscCode;
    }
    public String getIFSCcode(){
        return ifscCode;
    }
    public void setMobno(String mobNo){
        this.mobNo = mobNo;
    }
    public String getMobno(){
        return mobNo;
    }
    public void setAccountno(String accountNo){
        this.accountNo = accountNo;
    }
    public String getAccountno(){
        return accountNo;
    }
}