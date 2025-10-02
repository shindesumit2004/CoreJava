package basicprogram;

import java.util.Scanner;

public class Mla {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a number (1-6):");
        int Mla = Scanner.nextInt();

        switch(Mla){
            case 1:
                System.out.println("Mla Arjun Panditrao Khotkar \n jalna \n SHS");
                break;
            case 2:
                System.out.println("Mla Babanrao lonikar \n Mantha-Partur \n BJP");
                break;
            case 3:
                System.out.println("Mla Dr.Hikmat Baliram Udhan \n Ghansawangi \n SHS");
                break;
            case 4:
                System.out.println("Mla Narayan Tilakchand Kuche \n Ambad-Badnapur \n BJP");
                break;
            case 5:
                System.out.println("Mla Santosh Raosaheb Danve \n Jafrabad-Bhokardhan \n BJP");
                break;
            case 6:
                System.out.println("mr. Chandrakant D Khetri \n ZP Member6 \n ZP Beed \n Gangamasala ZP circle \n Mothewadi \n National Congress Party \n Mo NO:- 7-507-707-808 ");
                break;

            default:
                System.out.println("Number is not valid");
        }

    }
}
