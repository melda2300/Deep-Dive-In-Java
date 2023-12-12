import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.print("kelimeyi giriniz: ");
        String syr = str.nextLine();
        String  tep = "";
        for (int i = syr.length() - 1; i >= 0; i--) {
            tep += syr.charAt(i);
        }
        if (tep.equalsIgnoreCase(syr)) {
            System.out.println("polindrom : "+syr);
        } else {
            System.out.println("polindrom deyildir");
        }
    }
}
