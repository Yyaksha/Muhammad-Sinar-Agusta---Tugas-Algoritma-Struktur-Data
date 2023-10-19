package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class var1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Tempat Tinggal: ");
        String tempatTinggal = input.nextLine();
        
        System.out.print("Masukkan Uang Tabungan dalam $: ");
        double tabungan = input.nextDouble();
        
        if (tabungan >= 10000000) {
            if (umur > 40 && (tempatTinggal.equalsIgnoreCase("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equalsIgnoreCase("Havana"))) {
                System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Don.");
            } else {
                System.out.println(nama + " tidak mencurigakan.");
            }
        } else if (tabungan >= 1000000 && tabungan <= 2000000) {
            if (umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey") || tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada"))) {
                System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Underboss.");
            } else {
                System.out.println(nama + " tidak mencurigakan.");
            }
        } else if (tabungan < 1000000) {
            if (umur >= 18 && umur <= 24 && (tempatTinggal.equalsIgnoreCase("California") || tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston"))) {
                System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Capo.");
            } else {
                System.out.println(nama + " tidak mencurigakan.");
            }
        } else {
            System.out.println("Input tidak valid.");
        }
        input.close();
    }
}
 
    

