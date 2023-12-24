package Inheritance;

public class PrentCompany {
    String ParentCompany = "GooGle";
}

class HrCompany extends PrentCompany{
    String HrName  = "HrCompany";
    void print(){
        System.out.println(HrName+ " "+ ParentCompany);
    }
}
class ItCompany extends PrentCompany{
    String ItName = "ItCompany";
    void Display(){
        System.out.println(ItName+ " "+ ParentCompany);
    }

    public static void main(String[] args) {
        ItCompany t1 = new ItCompany();
        t1.Display();
        HrCompany h1 = new HrCompany();
        h1.print();
    }
}
 