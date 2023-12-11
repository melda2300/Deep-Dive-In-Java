import java.util.Scanner;
public class WordCountingProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = input.nextLine();
        System.out.println("Lütfen aramak istediğiniz kelimeyi giriniz: ");
        String aranacakKelime = input.nextLine();

        int kelimeSayisi = 0;
        String[] cumleParcalari = cumle.split(" ");

        for (String kelime : cumleParcalari) {
            if (kelime.equalsIgnoreCase(aranacakKelime)) {
                kelimeSayisi++;
            }
        }
        System.out.println("'" + aranacakKelime + "' kelimesi, girilen cümlede " + kelimeSayisi + " kez geçti.");

        input.close();
    }
}
