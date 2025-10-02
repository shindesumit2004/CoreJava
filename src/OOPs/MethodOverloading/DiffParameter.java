package OOPs.MethodOverloading;



public class DiffParameter {
    void print(int a, String b){
        System.out.println("Integer : "+ a + ", String : " + b);

        }
        void print(String a, int b){
            System.out.println("String : " + b + ", Integer : " + a);
        }

        public static void main(String[] args){

            DiffParameter obj = new DiffParameter();
            obj.print(100, "Hello");

            obj.print("World", 200);
        }
    }

