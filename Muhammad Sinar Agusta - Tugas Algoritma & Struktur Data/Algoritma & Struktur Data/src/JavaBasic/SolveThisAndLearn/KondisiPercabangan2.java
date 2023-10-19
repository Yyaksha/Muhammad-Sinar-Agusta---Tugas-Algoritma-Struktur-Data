package JavaBasic.SolveThisAndLearn;
// NAMA     : MUHAMMAD SINAR AGUSTA  TI23A
// NIM      : 20230040188
import java.util.Scanner;
public class KondisiPercabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Coding:");
        int nilaiCoding = input.nextInt();
        String hasilCoding = "";

        if(nilaiCoding >= 80){
            hasilCoding = "Anda Lolos";
        }
        else if(nilaiCoding >= 60 && nilaiCoding <= 80){
            hasilCoding = "Dapat dipertimbangkan";
        }
        else{
            hasilCoding = "Anda Gagal";
        }
        
        System.out.print("Masukkan Nilai Interview:"); 
        String nilaiInterview = input.next();
        String hasilInterview = "";

        if(nilaiInterview.equals("A") || nilaiInterview.equals("B")){
            hasilInterview = "Lolos";
        } else {
            hasilInterview = "Gagal";
        }
        
        if((hasilCoding.equals("Anda Lolos") || hasilCoding.equals("Dapat dipertimbangkan")) && hasilInterview.equals("Lolos")) {
            System.out.println("Selamat Anda Lolos menjadi calon Programmer");
        } else {
            System.out.println("Maaf Anda Gagal menjadi calon Programmer");
        }
        input.close();
        }
        
    }
