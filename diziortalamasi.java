public class diziortalamasi {
    public static double ortalama(double[] a) {
        int ortalama = 0;
        for (double v : a) {
            ortalama += (int) v;
        }
        return (double) ortalama /a.length;
    }
    public static void main(String[] args) {
        double[] array = {132.40, 25.20, 32.50, 98.10, 54.20};
        double sonuc = ortalama(array);
        System.out.println("Ortalama: " + sonuc);
    }
}
