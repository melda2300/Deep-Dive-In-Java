import java.util.Scanner;

public class RecapProject {
    private static void add(double num1, double num2) {
        System.out.println("Result: " + (num1 + num2));
    }
    private static void Sub(double num1, double num2) {
        System.out.println("Result: " + (num1 - num2));
    }
    private static void Multip(double num1, double num2) {
        System.out.println("Result: " + (num1 * num2));
    }
    private static void Dıv(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Result: " + (num1 % num2));
        } else {
            System.out.println("ERROR: division by zero not allowed"); // HATA: sıfıra bölmeye izin verilmiyor
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("-Simple calculator-");
        while (true) {
            System.out.println("\n choose an operat");
            System.out.println("1. Addition"); // toplama
            System.out.println("2. Subtraction");  // Çıkarma
            System.out.println("3. Multiplication"); // çarpma
            System.out.println("4. Dıvıson"); // bölme
            System.out.println("5. Exit");
            int chice = scr.nextInt();
            if (chice == 5) {
                System.out.println("Exiting the calculator. goodbye"); // Hesap makinesinden çıkılıyor. hoşçakalın
                break;
            }
            System.out.println("Enter the first number: "); // İlk sayıyı giriniz
            double num1 = scr.nextDouble();
            System.out.println("Enter the second number: "); // İkinci sayıyı giriniz
            double num2 = scr.nextDouble();
            switch (chice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    Sub(num1, num2);
                    break;
                case 3:
                    Multip(num1, num2);
                    break;
                case 4:
                    Dıv(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice"); // Geçersiz seçim
            }
        }
    }
}