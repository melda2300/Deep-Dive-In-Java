import java.util.*;
public class diziarama {
    public static int indexOfElement(int[] array, int target) { // Eleman indeksi bulan metod
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) { // diziyi sırala
        Arrays.sort(array);
    }
    public static int[] removeDuplicates(int[] array) { // kopyaları kaldıran metod
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }
        return uniqueElements.stream().mapToInt(Integer::intValue).toArray();
    }
    public static Map<Integer, Integer> elementFrequencies(int[] array) { // eleman Frekansları bulan medot
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
    public static double calculateArrayAverage(int[] array) { // Dizi Ortalamasını hesapla
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }


    public static void main(String[] args) {
        int[] dizi = {4, 1, 5, 3, 2, 30, 8,2,4,1,8,12,4,6};

        System.out.println("Hedef öğenin dizini: " + indexOfElement(dizi, 12));
        System.out.println("-----------------------");
        sortArray(dizi);
        System.out.print("Sıralanmış dizi:");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
            System.out.println("\n-----------------------");

        int[] uniqueArray = removeDuplicates(dizi);

        System.out.println("Tekrar edenleri kaldırılmış dizi:");
        for (int i : uniqueArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------");

        Map<Integer, Integer> frequencies = elementFrequencies(dizi);// elemanınları frekansını sayan ve sonuçları döndüren koddur

        System.out.println("Her öğenin frekansları: ");
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---------------------");

        double[] uniqueArray1 = new double[]{calculateArrayAverage(dizi)};
        System.out.println("Dizi Ortalamasını hesapla:");
        for (double i : uniqueArray1) {
            System.out.print(i + " ");
        }

    }
}