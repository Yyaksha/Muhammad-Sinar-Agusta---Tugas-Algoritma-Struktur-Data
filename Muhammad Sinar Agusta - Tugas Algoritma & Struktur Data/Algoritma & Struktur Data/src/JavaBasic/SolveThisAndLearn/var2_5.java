package JavaBasic.SolveThisAndLearn;

 import java.util.Scanner;

public class var2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai coding (0-100): ");
        int nilaiCoding = input.nextInt();

        System.out.print("Masukkan nilai interview (A/B): ");
        String nilaiInterview = input.next();

        input.close();

        // Penilaian nilai coding
        String hasilCoding = "";
        if (nilaiCoding > 80) {
            hasilCoding = "LOLOS";
        } else if (nilaiCoding >= 60) {
            hasilCoding = "DIPERTIMBANGKAN";
        } else {
            hasilCoding = "GAGAL";
        }

        // Penilaian nilai interview
        String hasilInterview = "";
        if (nilaiInterview.equals("A") || nilaiInterview.equals("B")) {
            hasilInterview = "LOLOS";
        } else {
            hasilInterview = "GAGAL";
        }

        // Menentukan apakah calon programmer lulus
        if ((hasilCoding.equals("LOLOS") || hasilCoding.equals("DIPERTIMBANGKAN")) && hasilInterview.equals("LOLOS")) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        } else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
    }
}
        
    
    

