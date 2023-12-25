import java.util.HashSet;
import java.util.Set;

public class dizikarma {
    public static int searchElement(int[] array, int element) {// Bir dizide belirli bir elemanı arayan metod
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {// İki dizinin kesişimini bulan ve sonucu yeni bir dizi olarak döndüren bir metod yazın.
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {// İki dizinin birleşimini bulan ve sonucu yeni bir dizi olarak döndüren medod
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }

        int[] result = new int[union.size()];
        int index = 0;
        for (int num : union) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {8, 10, 12, 4, 6, 3, 5, 26,};
        int elementToSearch = 5;
        int searchResult = searchElement(array, elementToSearch);
        if (searchResult != -1) {
            System.out.println("Dizinde bulunan öğe: " + searchResult);
        } else {
            System.out.println("Dizide öğe bulunamadı.");
        }
        int[] arr1 = {1, 3, 5, 4, 2, 6, 10};
        int[] arr2 = {4, 7, 9, 10, 2, 8, 6};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.print("Dizilerin kesişimi: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        int[] union = findUnion(arr1, arr2);
        System.out.print("\nDizilerin birliği: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}