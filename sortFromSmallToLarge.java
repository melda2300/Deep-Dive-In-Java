
import java.util.Arrays;
import java.util.Scanner;
public class sortFromSmallToLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        // Dizi oluşturma
        int[] dizi = new int[n];

        // Elemanları kullanıcıdan alma
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            dizi[i] = scanner.nextInt();
        }
        // Diziyi sıralama
        Arrays.sort(dizi);

        // Sıralanmış diziyi yazdırma
        System.out.print("Sıralama : ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        scanner.close();

    }
}


