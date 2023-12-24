package Inheritance;

public class Person {
    String name;
    public Person(String name){
        this.name = name;

    }
    void DisplayInfo()
    {

        System.out.println("parson name "+name);
    }
}
class StudentId extends Person{
    int id;

    public StudentId(String name , int id) {
        super(name);
        this.id = id;
    }


    void Displayid(){
        System.out.println(id);
    }


}
class Student11 extends StudentId{
    String Studentname;

    public Student11(String name,int id,String Studentname) {
        super(name,id);
        this.Studentname = Studentname;
    }

    void Student111(){
        System.out.println(Studentname);

    }


    public static void main(String[] args) {
        Student11 s1 = new Student11("ravi",123,"kumar");
        s1.DisplayInfo();
        s1.Displayid();
        s1.Student111();

    }

}
