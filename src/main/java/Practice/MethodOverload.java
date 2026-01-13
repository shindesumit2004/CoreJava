package Practice;

public class MethodOverload {

        void overloaded(){

        }
        void overloaded(int i){
            System.out.println(i);

        }
        void overloaded(double d){

        }
        void overloaded(float f){

        }
        void overloaded(byte b1){

        }
        void overloaded(byte b, int i){

        }
        void differentMethod(){

        }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.overloaded(10);
        obj.overloaded(1.1);
        obj.overloaded(0.f);
        obj.overloaded(10);
       // System.out.println(obj);

    }


}
