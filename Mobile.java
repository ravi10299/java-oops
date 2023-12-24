package Inheritance;

public class Mobile {
    String CompanyName;
    String Model;
    int Ram,Rom;
    int rate;
    public void MobileSpecification(String CompanyName,String model,int Ram,int Rom,int rate){
        this.CompanyName = CompanyName;
        this.Model = model;
        this.Ram = Ram;
        this.Rom= Rom;
        this.rate = rate;
        Display();


    }
    void Display(){
        System.out.println("parent company name is "+CompanyName);
        System.out.println("mobile name is "+Model);
        System.out.println("ram = "+Ram);
        System.out.println("rom = "+Rom);
        System.out.println("rate = "+rate);
    }

}
class Xiaomi extends Mobile{
    public void Redmi(String CompanyName,String model,int Ram,int Rom,int rate){
        super.MobileSpecification(CompanyName,model,Ram,Rom,rate);
    }

}
class Oppo extends Mobile{
    public void Realme(String CompanyName,String model,int Ram,int rom,int rate){
        super.MobileSpecification(CompanyName,model,Ram,Rom,rate);
    }

}
class Manufacturing{
    public static void main(String[] args) {
        Xiaomi x = new Xiaomi();
        x.Redmi("Xiaomi","MI 11x 5g",6,128,30000);
    }
}
