import java.util.Scanner;
public class ödev4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;

        // Türk alfabesindeki sesli harfler: a, e, ı, i, o, ö, u, ü
        String sesliHarfler = "aeıioöuü";

        // Her bir harfi kontrol et
        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            // Harf sesli ise sesli harf sayısını arttır, değilse sessiz harf sayısını arttır
            if (sesliHarfler.indexOf(harf) != -1) {
                sesliHarfSayisi++;
            } else if (Character.isLetter(harf)) {
                sessizHarfSayisi++;
            }
        }
        // Sonuçları ekrana yazdır
        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);
    }
}
