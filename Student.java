package Inheritance;

import java.sql.Struct;

public class Student {
    public static void main(String[] args) {
        Student1 s1  =new Student1();
        Student1 s2 = new Student1();
        s1.Display();
        s1.StudentDetails("ravi kumar verma",8001);
        s2.StudentDetails("Suresh",5001);


    }
}
class Colleges{
    String college_name = "Kashi institute of technology";
    String S_name;
    int roll;
    public void Display(){
        System.out.println("Student details....");
    }
}
class Student1 extends Colleges{
    public void StudentDetails(String S_name,int roll){
        System.out.println(college_name);
        System.out.println(this.S_name = S_name);
        System.out.println(this.roll = roll);
    }

}
