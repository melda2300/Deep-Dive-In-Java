public class Strinkmetod2 {
    public static String combine(String str1, String str2) { // iki string'i birleştiren bir metod
        StringBuilder birlesmisString = new StringBuilder();
        birlesmisString.append(str1).append(str2);
        return birlesmisString.toString();
    }

    public static String StringCompression(String str) { // String Sıkıştırma
        StringBuilder sikistirilmisString = new StringBuilder();
        int sayac = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                sayac++;
            } else {
                sikistirilmisString.append(str.charAt(i)).append(sayac);
                sayac = 1;
            }
        }
        return sikistirilmisString.toString();
    }
    public static void main(String[] args) {
        String ad = "melda";
        String göbekadı = " yağmur";
        String ad1 = combine(ad, göbekadı);
        System.out.println(ad1);

        System.out.println("---------------------------------");
        String kelime = "aaaabbbbbbcccc";
        String sıkıştırma = StringCompression(kelime);
        System.out.println(sıkıştırma);


    }
}
