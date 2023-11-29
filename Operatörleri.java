public class Operatörleri {
    public static void main(String[] args) {
        System.out.println(25 + 5 - 10 * 2 / 2);
        System.out.println((25 + 10) - 5 * 4 / 2);

        System.out.println("-------------------");

        int s = 9;
        s++;
        System.out.println(s);
        s--;

        System.out.println(s);
        System.out.println("-------------------");

        int p = 5, c;
        c = p++;
        System.out.println("p: " + p);
        System.out.println("c: " + c);

        System.out.println("-------------------");

        float number = 14.5f;
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        System.out.println("-------------------");

        char harf = 'B';
        harf++;
        System.out.println(harf);
        harf--;
        System.out.println(harf);
    }
}
/*
Operatörler ve İfadeler
Toplama (+): İki operantı toplar.
Çıkarma (-): İlk operanttan ikinciyi çıkarır.
Çarpma (*): İki operantı çarpar.
Bölme (/): İlk operantı ikinci operanta böler.
Modülüs (%): Bölme işleminin kalanını verir.
Unary eksiltme (-): Tek bir operantın değerini tersine çevirir.
int,short,byte,long,double,char olur
aritmatik operotöler sadece "boolelan" daişlem yapılmaz

Artırma ve Azaltma Operatörleri
x++; = 1 er tane ekliyor
x--; = 1 er tane cıkarıyor
 */