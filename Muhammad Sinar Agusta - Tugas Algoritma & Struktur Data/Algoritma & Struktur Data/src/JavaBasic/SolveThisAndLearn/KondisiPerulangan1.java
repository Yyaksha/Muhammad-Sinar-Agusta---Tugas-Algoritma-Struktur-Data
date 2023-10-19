package JavaBasic.SolveThisAndLearn;
import java.util.Scanner;
public class KondisiPerulangan1 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String kata = input.next();
        String kalimat [] = {"Katak","Makan","Kasur","Kasur ini rusak"};
        
        for(int i = 0; i < kalimat.length; i++) {
            if(kalimat [i] == "Katak") {
                System.out.println(kata);
            }
            else{
                System.out.println("");
            }

    }
}
}
