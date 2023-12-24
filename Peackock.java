package Abstract_and_Interfaces;

public class Peackock extends Crow{

    @Override
    void Sound() {
        System.out.println("the peackock sound is peackock peackock....");
    }

    public static void main(String[] args) {
        AnimalSound a1 = new Peackock();
        a1.Sound();
        AnimalSound a2 = new Crow();
        a2.Sound();



    }
}
