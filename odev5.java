import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("yazı giriniz");
        String kelime = imput.nextLine();
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        System.out.println("Ters kelime: " + tersKelime);
    }
}