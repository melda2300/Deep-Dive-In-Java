import java.util.Scanner;
public class odev6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        StringBuilder yeniKelime = new StringBuilder();
        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);
            if (kelime.indexOf(karakter) == kelime.lastIndexOf(karakter)) {
                yeniKelime.append(karakter);
            }
        }
        System.out.println("Tekrar eden harfler kaldırıldıktan sonra: " + yeniKelime);
        scanner.close();
    }
}