// eb uzun kelimeyi bulup kac harf sayan program
import java.util.Scanner;
public class odev2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println(" cüleyi giriniz: ");
        String kelimeListesi = scr.nextLine();
        String[] kelimeler = kelimeListesi.split(" ");
        int enUzunUzunluk = 0;
        String enUzunKelime = "";
        for (String kelime : kelimeler) {
            int kelimeUzunlugu = kelime.length();
            if (kelimeUzunlugu > enUzunUzunluk) {
                enUzunUzunluk = kelimeUzunlugu;
                enUzunKelime = kelime;
            }
        }
        System.out.println("En uzun kelime: " + enUzunKelime);
        System.out.println("En uzun kelimenin uzunluğu: " + enUzunUzunluk);
    }
}


