public class StringMethods {
    public static void main(String[] args) {
        String text = " hello world ";

        // substring(int, beginIndeks)
        String subString1 = text.substring(7);
        System.out.println("substring(7) = " + subString1);
        System.out.println("---------------------------------------------------");

        // substring( int beginIndex, int endIndex)
        String subString2 = text.substring(7, 12);
        System.out.println("substring(7,12) = " + subString2);
        System.out.println("---------------------------------------------------");

        // indexof( String  str)
        int index = text.indexOf("world");
        System.out.println("index(\"world\")" + index);
        System.out.println("---------------------------------------------------");

        //  replace ( oldchar,newchar
        String nextext = text.replace('o', 'O');
        System.out.println("replace('o', 'O')" + nextext);
        System.out.println("---------------------------------------------------");

        // split (String regex )
        String fruitext = "muz,elma,armut,ananas,kivi";
        String[] fruits = fruitext.split(",");
        System.out.println("split(\",\" ) ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------------------------------------");

        // trim()
        String trimtext = "hello world";
        String trimmed = trimtext.trim();
        System.out.println("tirim() " + trimmed);
        System.out.println("--------------------------------------------------");

        //  endwish (String suffix)
        boolean endwishworld = text.endsWith("Wordl!");
        System.out.println("endwish(\" World\") " + endwishworld);
        System.out.println("--------------------------------------------------");

        // startwith( String prefix)
        boolean startwihtHello = text.startsWith("world");
        System.out.println("startwith(\" hello \") " + startwihtHello);
        System.out.println("--------------------------------------------------");

        // isEmty()
        String emptyString = "";
        String nonEmtyString = "Hello worlk";
        boolean isEmty1 = emptyString.isEmpty();// true
        boolean isEmty2 = nonEmtyString.isEmpty();// false
        System.out.println("isEmpty() - emptyString " + isEmty1);
        System.out.println("isEmpty() - nonEmtyString " + isEmty2);
        System.out.println("--------------------------------------------------");

        // eguls(Object anatherString)
        String text1 = "hello";
        String text2 = "world";
        boolean iseguls = text1.equals(text2);
        System.out.println("equals(text2) " + iseguls);
        System.out.println("---------------------------------------------------");

        // isEqualIgnorCase(String anatherString)
        boolean isEqualIgnorCase = text1.equalsIgnoreCase("hello"); // ture
        System.out.println("isEqualIgnorCase(\"hello\") " + isEqualIgnorCase);
        System.out.println("---------------------------------------------------");

        // concat(String str)
        String text3 = "hello";
        String text4 = "hello";
        String combined = text3.concat(text4);
        System.out.println("concat(text4) " + combined);
        System.out.println("-----------------------------------------------------");

        //matches(String regex )
        String numarictext = "12345";
        boolean isnumaric = numarictext.matches("[0-9]+"); // ture
        System.out.println("matches(\"[0-9]+\"): " + isnumaric);
        System.out.println("---------------------------------------------------");

        //replaceAll(String regex, String replacement)
        String texts = "The quick brown fox jumps over the lazy dog.";
        String replacedText = texts.replaceAll("fox", "cat");
        System.out.println("replaceAll(\"fox\", \"cat\"): " + replacedText);
        System.out.println("---------------------------------------------------");

         // join(CharSequence delimiter, CharSequence... elements)
        String[] words = {"The","quick", "brown", "fox"};
        String joined = String.join("", words);
        System.out.println(" Sing.join(\" \", words): "+joined);


    }
}
