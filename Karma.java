public class Karma {
    public static int[] dizi(int a, int b, int c, int d, int e) {
        int[] dizi = {a, b, c, d, e};
        int max = dizi[0];
        int mini = dizi[0];
        for (int j : dizi) {
            if (j > max) {
                max = j;
            }
            if (j < mini) {
                mini = j;
            }
        }
        System.out.println("Dizideki en büyük eleman: " + max);
        System.out.println("Dizideki en küçük eleman: " + mini);
        return dizi;
    }
    public static int[] tersCevirme(int[] cevir) {
        int i = 0;
        int j = cevir.length - 1;
        while (i < j) {
            int temp = cevir[i];
            cevir[i] = cevir[j];
            cevir[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        return cevir;
    }
    public static void main(String[] args) {
        int[] dizi = dizi(100, -43, 21, 54, 47);
        System.out.print("sayılar = ");
        for (int i : dizi) {
            System.out.print(i + ",");
        }
        int[] tersDizi = tersCevirme(dizi);
        System.out.print( "\nTers Çevrilen Diziler  ");
        for (int e : tersDizi) {
            System.out.print( e + ",");
        }
    }
}