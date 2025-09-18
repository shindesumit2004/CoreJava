package sumit.Loops;

public class Pyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int t = 1; t <= n - i; t++){
                System.out.print(" ");
            }
             for (int k = 1; k <= (2*i-1); k++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}

/* public class StarPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/