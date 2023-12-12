// boşluk sayısını bulan program

public class odev1 {
    public static void main(String[] args) {
        String sentence = "yıl bası yaklaşıyor";
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Boşluk sayısı: " + spaceCount);
    }
}
