package JavaBasic.SolveThisAndLearn;
// NAMA     : MUHAMMAD SINAR AGUSTA  TI23A
// NIM      : 20230040188
import java.util.Scanner;
public class KondisiPercabangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama =input.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tempat tinggal: ");
        String tempatTinggal =input.nextLine();
        System.out.print("Masukkan Uang dalam Dollar: ");
        double tabungan = input.nextDouble();

        if(umur > 40 && tempatTinggal.equals("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equals("Havana") && tabungan >= 10000000){
            System.out.println(nama + " Kemungkinan adalah anggota Mafia dengan pangkat Don.");
        } else if(umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey") || tempatTinggal.equals("Manhattan") || tempatTinggal.equals("Nedava")) && tabungan >= 1000000 && tabungan <= 2000000){
            System.out.println(nama + " Kemungkinan adalah anggota Mafia dengan pangkat Underboss.");
        } else if(umur >= 18 && umur <= 24 && (tempatTinggal.equals("California") || tempatTinggal.equals("Detroit") || tempatTinggal.equals("Boston")) && tabungan <= 1000000){
            System.out.println(nama + " Kemungkinan adalah anggota Mafia dengan pangkat Capo.");
        } else {
            System.out.println(nama + " Tidak Mencurigakan");
        }
        input.close();
    } 
}
