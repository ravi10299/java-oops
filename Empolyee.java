package Inheritance;

public class Empolyee extends Company{
    String E_name = "Employee1";
    int id = 1234;

    public static void main(String[] args) {
        Empolyee E2 = new Empolyee();
        System.out.println(E2.name);
        System.out.println(E2.add);

        System.out.println(E2.E_name);
        System.out.println(E2.id);

    }
}
