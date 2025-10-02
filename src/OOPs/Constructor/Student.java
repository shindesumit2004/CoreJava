package OOPs.Constructor;

public class Student {

    String name;
    int rollno;

    public Student(String n, int rn){

        name=n;
        rollno=rn;
        System.out.println("name : "+name+" roll no :"+rollno);
    }

    public static void main(String[] args) {
        Student std1 = new Student("Deepak", 101);
        Student std2 = new Student("Sumit", 102);


    }
}
