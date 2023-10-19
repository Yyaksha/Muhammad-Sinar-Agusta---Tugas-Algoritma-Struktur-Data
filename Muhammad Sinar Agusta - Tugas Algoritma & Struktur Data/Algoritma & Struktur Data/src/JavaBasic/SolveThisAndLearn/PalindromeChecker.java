 package JavaBasic.SolveThisAndLearn;
import java.util.Scanner;
  public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata1 = "Katak";
        String kata2 = "Makan";
        String kata3 = "Kasur";
        String kata4 = "Kasur ini rusak";

        System.out.println(kata1 + " adalah " + (isPalindrome(kata1) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata2 + " adalah " + (isPalindrome(kata2) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata3 + " adalah " + (isPalindrome(kata3) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata4 + " adalah " + (isPalindrome(kata4) ? "palindrome" : "bukan palindrome"));
    }

    public static boolean isPalindrome(String kata) {
        String tanpaSpasi = kata.replaceAll("\\s", "").toLowerCase();
        int panjang = tanpaSpasi.length();

        for (int i = 0; i < panjang / 2; i++) {
            if (tanpaSpasi.charAt(i) != tanpaSpasi.charAt(panjang - i - 1)) {
                return false;
            }
        }
        
        return true;
    } 
}
