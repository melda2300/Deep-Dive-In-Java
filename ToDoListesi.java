import java.util.Scanner;

public class ToDoListesi {
    private static String[] list = new String[10];
    private static int itemCount = 0;

    private static void Menu() {
        System.out.println("SECİMİNİZİ GİRİNİZ:");
        System.out.println("1. Ekle ");
        System.out.println("2. Listele ");
        System.out.println("3. Sil");
        System.out.println("4. Çıkış yap");
    }

    private static void Öğeklemek(Scanner input) {
        System.out.println("Yapılacakları listesine eklenecek öğeyi girin:");
        String toDo = input.nextLine();

        if (itemCount < list.length) {
            list[itemCount] = toDo;
            itemCount++;
            System.out.println("Öğe eklendi.");
        } else {
            System.out.println("Liste dolu, yeni öğe eklenemedi.");
        }
        // itemCount, listenin içindeki mevcut öğe sayısını temsil eder.
        //list.length, listenin toplam kapasitesini gösterir. Bu, listenin kaç öğe alabileceğini belirler.
        //Koşul ifadesi, listenin mevcut öğe sayısının toplam kapasiteden küçük olup olmadığını kontrol eder.
        // Eğer küçükse, yeni bir öğe eklemek mümkündür.
    }

    private static void listeÖğeler() {
        System.out.println("Listedeki öğeler:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }

    private static void Öğeyisilmek(Scanner input) {
        System.out.println("Silinecek öğenin numarasını girin:");
        int indexToDelete = input.nextInt();
        input.nextLine();
// indexToDelete değişkeni, silinecek öğenin indeksini temsil eder.
//itemCount, listenin içindeki toplam öğe sayısını gösterir.
//Koşul ifadesi, silinecek indeksin geçerli olup olmadığını kontrol eder.
// Eğer geçerliyse, silme işlemi gerçekleştirilir. Aksi takdirde, geçersiz indeks durumuyla ilgili bir mesaj yazdırılır.
        if (indexToDelete >= 1 && indexToDelete <= itemCount) {
            System.arraycopy(list, indexToDelete, list, indexToDelete - 1, itemCount - indexToDelete);
            list[itemCount - 1] = null;
            itemCount--;
            System.out.println("Öğe silindi.");
        } else {
            System.out.println("Geçersiz öğe numarası, silme işlemi gerçekleştirilemedi.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Menu();
            int seçenek = input.nextInt();
            input.nextLine();
            switch (seçenek) {
                case 1:
                    Öğeklemek(input);
                    break;
                case 2:
                    listeÖğeler();
                    break;
                case 3:
                    Öğeyisilmek(input);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.out.println("tekrar bekleriz.");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        }
    }
}