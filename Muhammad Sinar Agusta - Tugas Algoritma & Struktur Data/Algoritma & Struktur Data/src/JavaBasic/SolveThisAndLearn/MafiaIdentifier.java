package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class MafiaIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character
        System.out.print("Tempat Tinggal: ");
        String tempatTinggal = scanner.nextLine();
        System.out.print("Uang Tabungan dalam dollar: ");
        double uangTabungan = scanner.nextDouble();

        // Melakukan analisis berdasarkan kriteria yang telah diberikan
        String pangkat = null;

        if (umur > 40 && (tempatTinggal.equalsIgnoreCase("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equalsIgnoreCase("Havana")) && uangTabungan > 10000000) {
            pangkat = "Don";
        } else if (umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey") || tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada")) && uangTabungan >= 1000000 && uangTabungan <= 2000000) {
            pangkat = "Underboss";
        } else if (umur >= 18 && umur <= 24 && (tempatTinggal.equalsIgnoreCase("California") || tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston")) && uangTabungan < 1000000) {
            pangkat = "Capo";
        }

        // Menampilkan output berdasarkan hasil analisis
        if (pangkat != null) {
            System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + pangkat + ".");
        } else {
            System.out.println(nama + " tidak mencurigakan.");
        } 
        scanner.close();
    }
    
}
