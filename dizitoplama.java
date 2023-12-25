public class dizitoplama {
    public static int dizitoplama(int[] x) {
        int toplama = 0;
        for (int j : x) {
            toplama += j;
        }
        return toplama;
    }
    public static void main(String[] args) {
        int[] x = {4, 7, 23};
        int toplama = dizitoplama(x);
        System.out.println(toplama);

    }
}
