package OOPs.Static;

class Employee{
    int empId;
    String name;
    static String companyName = "TekUp SKills Pvt Ltd";

    Employee(int e, String n){
        empId = e;
        name = n;
    }

    void display(){
        System.out.println(companyName);
        System.out.println(empId);
        System.out.println(name);
    }
}

public class Company {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Sumit");
        Employee e2 = new Employee(102, "Amit");

        e1.display();
        System.out.println("-------------------------------------------------------");
        e2.display();

    }
 }
