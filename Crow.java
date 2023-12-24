package Abstract_and_Interfaces;

public class Crow extends AnimalSound{

    @Override
    void Sound() {
        System.out.println("the Crow sound is the cow cow...");
    }
    @Override
    void run() {
        System.out.println("the crow is flying...");

    }
}
