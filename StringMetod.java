public class StringMetod {
    public static int calculateStringLength(String str) { // string'in uzunluğunu hesaplayan bir metod
        char[] charArray = str.toCharArray();
        int length = 0;
        for (char ignored : charArray) {
            length++;
        }
        return length;
    }

    public static String reverseString(String str) { // ters Dize oluşturan metod
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static String capitalizeWords(String sentence) { // Kelimeleri büyük harfle yazdıran metod
        char[] charArray = sentence.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                charArray[i] = Character.toTitleCase(charArray[i]);
                capitalizeNext = false;
            }
        }

        return new String(charArray);
    }
    public static boolean checkStringLength(String str, int length) { // Dize Uzunluğunu kontrol eden metod
        char[] charArray = str.toCharArray();
        int count = 0;
        for (char ignored : charArray) {
            count++;
        }
        return count == length;
    }
    public static void main(String[] args) {
        String metod = "Damlayla göl olmaz.";
        int length= calculateStringLength(metod);
        if (checkStringLength(metod, length)) {
            System.out.println("String uzunluğu doğru.");
            System.out.println("Ters çevrilmiş string: " + reverseString(metod));
            System.out.println("Büyük harfle yazılmış string: " + capitalizeWords(metod));
        } else {
            System.out.println("String uzunluğu yanlış.");

        }
    }
}
