public class Uzunluk {
    // Tamsayılar için hesaplama
    public static int ortalamaHesapla(int[] dizi) {
        int toplam = 0;
        for (int sayi : dizi) {
            toplam += sayi;
        }
        return toplam / dizi.length;
    }
    // String'ler için farklı bir hesaplama
    public static int ortalamaHesapla(String[] dizi) {
        int toplamUzunluk = 0;
        for (String kelime : dizi) {
            toplamUzunluk += kelime.length();
        }
        return toplamUzunluk / dizi.length;
    }
    public static void main(String[] args) {
        String[] kelimeDizisi = {"Merhaba", "Dünya"};
        int[] sayiDizisi = {5, 7, 9};

        int stringOrtalamaUzunluk = ortalamaHesapla(kelimeDizisi);
        int intOrtalama = ortalamaHesapla(sayiDizisi);

        System.out.println("String dizisinin ortalama uzunluğu: " + stringOrtalamaUzunluk);
        System.out.println("Tamsayı dizisinin ortalama değeri: " + intOrtalama);
    }
}



