import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r, a;
        double  pi = 3.14 ;
         ;

        Scanner inp = new Scanner(System.in);
        System.out.print(" Dairenin yaricapini giriniz  : ");
        r = inp.nextInt();

        Scanner inputa = new Scanner(System.in);
        System.out.print(" Merkez acisini  giriniz : ");
        a = inp.nextInt();

        double alan = ( pi * (r * r) * a ) / 360 ;
        System.out.println(" Dairenin alani : " +alan);




    }
}
