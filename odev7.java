import java.util.Scanner;
public class odev7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. String ifadeyi giriniz :");
        String str1 = scan.next();
        System.out.print("2. String ifadeyi giriniz :");
        String str2 = scan.next();
        boolean result = true;
        if(str1.length() == str2.length()){
            for(int i=0 ; i<str1.length() ;i++){
                if (str1.toLowerCase().contains(str2.toLowerCase().substring(i,i+1))){
                }else{
                    result = false;
                    break;
                }
            }
        }else {
            result = false;
        }
        if(result){
            System.out.println("İfadeler Anagram dır.");
        }else {
            System.out.println("İfadeler Anagram Degildir.");
        }
    }
}
