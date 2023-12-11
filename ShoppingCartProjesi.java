import java.util.Scanner;
public class ShoppingCartProjesi {
    private static final int MAX_ITEMS = 100;
    private String[] itenNames;
    private double[] itemPrices;
    private int itemCount;
    public void ShoppingCart() {
        this.itemCount = 0;
        this.itenNames = new String[MAX_ITEMS];
        this.itemPrices = new double[MAX_ITEMS];
    }
    private void addItenToCart(String itenName, double itemPrice) {
        if (itemCount < MAX_ITEMS) {
            itenNames[itemCount] = itenName;
            itemPrices[itemCount] = itemPrice;
            itemCount++;
            System.out.println(itemCount + " added to the cart. "); // Sepete eklendi.
        } else {
            System.out.println("sorry, the cart is full ");//Üzgünüm, sepet dolu
        }
    }
    private void viewCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");//Sepet boş.
        } else {
            System.out.println("Cart content:");//Sepet içeriği:
            for (int i = 0; i < itemCount; i++) {
                System.out.println(itenNames[i] + ": $" + itemPrices[i]);
            }
        }
    }
    private void colculatetotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += itemPrices[i];
        }
        System.out.println("total price of items in the cart $ :" + total);//sepetteki ürünlerin toplam fiyatı
    }
    public static void main(String[] args) {
        ShoppingCartProjesi ShoppingCartProjesi = new ShoppingCartProjesi();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome tı the Shopping Cart! ");//Alışveriş Sepetine Hoş Geldiniz!
        while (true) {
            System.out.println("\n Choose and option");//seç
            System.out.println("1. Add item to cart ");//Ürünü sepete ekle
            System.out.println("2. view cart ");//sepeti görüntüle
            System.out.println("3. Calculate total ");//Toplamı hesapla
            System.out.println("\n 4. Exit"); // cıkış
            System.out.println("Your chice");//Senin şıkın
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter iten name: ");//Öğe adını girin:
                    String itemName = scanner.next();
                    System.out.println("Enter iten price: ");//Öğe fiyatını girin
                    double itemprice = scanner.nextDouble();
                    ShoppingCartProjesi.addItenToCart(itemName, itemprice);
                    break;
                case 2:
                    ShoppingCartProjesi.viewCart();
                    break;
                case 3:
                    ShoppingCartProjesi.colculatetotal();
                    break;
                case 4:
                    System.out.println("Exiting the shopping cart. Have a nice day..");//Alışveriş sepetinden çık. İyi günler..
                    System.out.println(0);
                default:
                    System.out.println("Invalid choice..");// Geçersiz seçim..
            }
        }
    }

}