public class dizidekiOrtalama {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int[] liste = {1,32,23,43,21,33,5,43,23,65,23 };
        int[] duplicate = new int[liste.length];
        int startIndex = 0;
        for (int a = 0; a < liste.length; a++) {
            for (int b = 0; b < liste.length; b++) {
                if ((a != b) && (liste[a] == liste[b])) {
                    if (!isFind(duplicate, liste[a])) {
                        duplicate[startIndex++] = liste[a];
                    }
                    break;
                }
            }
        }
        for (int vaule :duplicate) {
            if (vaule!=0){
                System.out.println(vaule);
            }
        }
    }
}
