package staticvar;

public class Manager {
    // static variable salary
    public static double salary;
    public static String name = "smith";
    void method() {

    }
    public static void main(String[] args){
        Manager.salary = 900000;
        System.out.println("Manager.name");

    }
}


