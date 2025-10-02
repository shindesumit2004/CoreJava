package OOPs.Static;

class Candidate{
    int serialNo;
    int vidhansabhaNo;
    String name;
    int age;
    static String partyName = "Shivsena";
    static String leader = "Eknath Shinde";
    String destigination;
    static String statePresident = "Eknath Shinde";

    Candidate(int s, int v, String n, int a, String d){
        serialNo = s;
        vidhansabhaNo = v;
        name = n;
        age = a;
        destigination = d;
    }

    void display(){
        System.out.println(serialNo);
        System.out.println(vidhansabhaNo);
        System.out.println(name);
        System.out.println(age);
        System.out.println(partyName);
        System.out.println(leader);
        System.out.println(destigination);
        System.out.println(statePresident);
    }

}

public class Leader {
    public static void main(String[] args) {


        Candidate c1 = new Candidate(1, 100, "Hikmat Udhan", 50, "MlA");
        Candidate c2 = new Candidate(2, 101, "Arjun Khotkar", 55, "MlA");
        Candidate c3 = new Candidate(3, 102, "Sanjay Shirshat", 56, "Minister");
        Candidate c4 = new Candidate(4, 103, "Sanjana Jadhav", 45, "MlA");
        Candidate c5 = new Candidate(5, 104, "Yogesh Kadam", 45, "Minister");
        Candidate c6 = new Candidate(6, 105, "Prakash Aabitkar", 60, "Minister");

        c1.display();
        System.out.println("----------------------------------------------");
        c2.display();
        System.out.println("-----------------------------------------------");
        c3.display();
        System.out.println("------------------------------------------------");
        c4.display();
        System.out.println("------------------------------------------------");
        c5.display();
        System.out.println("-------------------------------------------------");
        c6.display();



    }

}
