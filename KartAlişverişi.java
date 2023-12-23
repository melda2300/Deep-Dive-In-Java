import java.util.Scanner;
public class KartAlişverişi {
    private static final int MAX_ITEMS = 100;
    private String[] itemNames;
    private double[] itemPrices;
    private int itemCount;

    public void ShoppingCart() {
        this.itemCount = 0;
        this.itemNames = new String[MAX_ITEMS];
        this.itemPrices = new double[MAX_ITEMS];
    }
    private void AddItenToCart(String itemName, double itemPrice) {
        if (itemCount < MAX_ITEMS) {
            itemNames[itemCount] = itemName;
            itemPrices[itemCount] = itemPrice;
            itemCount++;
            System.out.println(itemCount + " added to the cart. ");
        } else {
            System.out.println("sorry, the cart is full ");
        }
    }

    private void viewCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart content:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(itemNames[i] + ": $" + itemPrices[i]);
            }
        }
    }

    private void CalculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += itemPrices[i];
        }
        System.out.println("total price of items in the cart $ :" + total);
    }

    private void RemoveItemFromCart(String itemName) {
        boolean isFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (itemNames[i].equals(itemName)) {
                isFound = true;
                for (int j = i; j < itemCount - 1; j++) {
                    itemNames[j] = itemNames[j + 1];
                    itemPrices[j] = itemPrices[j + 1];
                }
                itemCount--;
                System.out.println(itemName + " removed from the cart."); //sepetten çıkarıldı.
                break;
            }
        }
        if (!isFound) {
            System.out.println("Item not found in the cart."); //Ürün sepette bulunamadı."
        }
    }

    public static void main(String[] args) {

    KartAlişverişi kartAlişverişi= new KartAlişverişi();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome tı the Shopping Cart! ");
        while (true) {
            System.out.println("\n Choose and option");
            System.out.println("1. Add item to cart ");
            System.out.println("2. view cart ");
            System.out.println("3. Calculate total ");
            System.out.println("4. Remove item from cart ");
            System.out.println("5. View your shopping cart ");// alışveriş sepetin görüntüle
            System.out.println("\n 6. Exit");
            System.out.println("Your chice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter iten name: ");
                    String itemName = scanner.next();
                    System.out.println("Enter iten price: ");
                    double itemprice = scanner.nextDouble();
                   kartAlişverişi.AddItenToCart(itemName, itemprice);
                    break;
                case 2:
                    kartAlişverişi.viewCart();
                    break;
                case 3:
                    kartAlişverişi.CalculateTotal();
                    break;
                case 4:
                    System.out.println("Enter iten name: ");
                    String itemToRemove = scanner.next();
                    kartAlişverişi.RemoveItemFromCart(itemToRemove);
                    break;
                case 5:
                    System.out.println("Thank you for using the Shopping Cart! ");
                    scanner.close();
                    break;
                case 6:
                    kartAlişverişi.ShoppingCart();
                    System.out.println("your shopping cart");// alışveriş sepetiniz
                    break;
                default:
                    System.out.println("Invalid choice, please try again. ");
            }
        }
    }
}

