import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print(" kac ay taksit olsun = ");
        int aylar = scr.nextInt();
        System.out.print("Kredi Tutarını Giriniz : ");
        double kredi = scr.nextDouble();
        double vergiOrani = 4.20 ;
        // Vergi hesaplaması yapılır
        double vergii = kredi / vergiOrani;
        // Anapara hesaplaması yapılır
        double anapara = kredi + vergii;
        System.out.println("vergi oranı =" + vergiOrani);
        System.out.println("vergi = " + vergii);
        System.out.println("kredi =" + kredi);
        System.out.println("anapara = " + anapara);
        for (int x = 0; x < aylar; x++) {
            System.out.println("aylık tutar = " + anapara / aylar);
            break;
        }
    }
}
