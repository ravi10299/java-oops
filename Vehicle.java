package Inheritance;

import java.sql.SQLOutput;

public interface Vehicle {
   void Start();
   void Stop();

}
interface MusicPlayer{
    void Start1();
    void Stop1();

}
class car implements Vehicle,MusicPlayer{
    @Override
    public void Start() {
        System.out.println("Start the car");

    }

    @Override
    public void Stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void Start1() {
        System.out.println("Start the music player");
    }

    @Override
    public void Stop1() {
        System.out.println("Stop the music player");

    }


}
class client{
    public static void main(String[] args) {
        car c = new car();
        c.Start();
        c.Stop();
        c.Start1();
        c.Stop1();
    }
}
