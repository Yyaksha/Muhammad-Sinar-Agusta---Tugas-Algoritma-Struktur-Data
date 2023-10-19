package JavaBasic.SolveThisAndLearn;
// NAMA     : MUHAMMAD SINAR AGUSTA  TI23A
// NIM      : 20230040188
import java.util.Scanner;
public class KondisiPercabangan5 {
    public static void main(String[] args) {
        
        System.out.println("Selamat datang di Disney Island!");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur anda: ");
        int age = input.nextInt();
        int bil = 0;

        if (age < 1) {
            System.out.println("Mohon maaf Anda dilarang masuk");
        } else if (age <= 2) {
            int tarif = 30000;
            System.out.println("Tarif kamu Rp. " + tarif);
            System.out.print("Masukkan tinggi anda: ");
            int tinggi = input.nextInt();
            if ((age >= 2 && age <=3 && tinggi >= 70)) {
                tarif += 10000;
                System.out.println("Tarif bertambah menjadi Rp. " + tarif);
            } else {
                System.out.println("Tarif kamu tetap Rp. " + tarif);
            }

        } else if(age <= 7){
            int tarif = 40000;
            System.out.println("Tarif kamu Rp. " + tarif);
            System.out.println("Masukkan tinggi anda: ");
            int tinggi = input.nextInt();
            if ((age >= 4 && age <= 7 ) && (tinggi >= 120)) {
                tarif += 15000;
                System.out.println("Tarif bertambah menjadi Rp. " + tarif);
            } else {
                System.out.println("Tarif kamu tetap Rp. " + tarif);
            }
        } else if (age <= 10) {
            bil = 5000;
            System.out.println("Tarif kamu Rp. " + bil);
            System.out.print("Masukkan tinggi anda: ");
            int tinggi = input.nextInt();
            if ((age >= 8 && age <= 10 ) && (tinggi >= 130)) {
                bil += 20000;
                System.out.println("Tarif bertambah menjadi Rp. " + bil);
            } else {
                System.out.println("Tarif kamu tetap Rp. " + bil);
            }

        } else {
            int tarif = 80000;
            System.out.println("Tarif kamu Rp. " + tarif);
        }
        
        input.close();
    }
}
