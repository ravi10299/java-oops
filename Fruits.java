package Inheritance;

public class Fruits {
    String name;
    int weight;
    int rate;
    public Fruits(String name ,int weight,int rate){
        this.name = name;
        this.weight = weight;
        this.rate = rate;
        Display();
    }
    void Display(){
        System.out.println("Analysis the fruits .....");
        System.out.println(name);
        System.out.println(weight+" kg");
        System.out.println(rate+" Rupay");
    }
}
class Mango extends Fruits{
    public Mango(String name,int weight,int rate){
        super(name,weight,rate);
    }

}
class Apple extends Fruits{
    public Apple(String name,int weight,int rate){
        super(name,weight,rate);
    }

    public static void main(String[] args) {
        Mango m = new Mango("Mango",10,500);
        Apple a = new Apple("Apple",10,500);
    }
}