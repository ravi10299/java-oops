package Inheritance;

public class Eat {
    void Eating(){
        System.out.println("Animal is eating...");
    }

}
interface run{
    void Runing();
}
interface lags{
    void led();
}
class Dogs extends Eat implements run,lags{

    @Override
    public void led() {
        System.out.println("dogs is the 4 legs");

    }

    @Override
    public void Runing() {
        System.out.println("running the dogs");

    }

    @Override
    void Eating() {
        System.out.println("eating the dogs. ");
    }
}
class puppy extends Dogs{
    void Display(){
        System.out.println("*******************************");
        System.out.println("the Puppy info");
    }

    @Override
    public void led() {
        super.led();
    }

    @Override
    public void Runing() {
        super.Runing();
    }

    @Override
    void Eating() {
        super.Eating();
    }
}
class Animal{
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.Eating();
        d1.led();
        d1.Runing();
        puppy d2 = new puppy();
        d2.Display();
        d2.Eating();
        d2.led();
        d2.Runing();


    }
}
