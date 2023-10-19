package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class PenerimaanCalonProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai coding: ");
        int nilaiCoding = scanner.nextInt();

        System.out.print("Masukkan nilai interview (A/B): ");
        String nilaiInterview = scanner.next();

        if (nilaiCoding > 80) {
            System.out.println("LOLOS");
        } else if (nilaiCoding >= 60 && nilaiCoding <= 80 && (nilaiInterview.equals("A") || nilaiInterview.equals("B"))) {
            System.out.println("DIPERTIMBANGKAN");
        } else {
            System.out.println("GAGAL");
        }

        if ((nilaiCoding > 80 || (nilaiCoding >= 60 && nilaiCoding <= 80 && (nilaiInterview.equals("A") || nilaiInterview.equals("B"))))) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        } else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
        scanner.close();
    }
    
}
