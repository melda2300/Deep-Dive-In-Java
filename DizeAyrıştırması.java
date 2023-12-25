import java.util.Scanner;
public class DizeAyrıştırması {
    public static void main(String[] args) {
        int[] liste = new int[4];
        Scanner scr = new Scanner(System.in);
        System.out.print("4 tane sayı giriniz: ");
        for (int i = 0; i < 4; i++) {
            liste[i] = scr.nextInt();
        }
        System.out.print("\ncift sayı: ");
        for (int i = 0; i < 4; i++) {
            if (liste[i] % 2 == 0) {
                System.out.print(liste[i]+" ");
            }
        }
        System.out.print("\nTek Sayılar :");
        for (int j = 0; j < 4; j++){
            if (liste[j] % 2 != 0) {
                System.out.print( liste[j]+" ");
            }
        }
    }
}