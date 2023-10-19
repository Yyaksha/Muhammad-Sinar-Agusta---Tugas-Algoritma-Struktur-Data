package JavaBasic.SolveThisAndLearn;
// NAMA     : MUHAMMAD SINAR AGUSTA  TI23A
// NIM      : 20230040188
import java.util.Scanner;
public class KondisiPercabangan3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 

        System.out.println("Masukan nomor punggung anda ");
        int nomorPunggung = input.nextInt();

        if (nomorPunggung % 2 == 0){
            if (nomorPunggung >= 50 && nomorPunggung <= 100){
                System.out.println("Berhak dipilih manjadi Kapten.");
            } else {
                System.out.println("Posisi Anda adalah Attacker.");
            }
        }
        else if (nomorPunggung % 2 == 1){
            System.out.println("Posisi Anda adalah Defender.");
            if (nomorPunggung >= 90){
                System.out.println("Posisi Anda adalah Playmaker.");
            } else if (nomorPunggung >= 3 && nomorPunggung < 6){
                System.out.println("Posisi Anda adalah Kiper.");
                } 
        } 
        else {
            System.out.println("Anda dapat bermain di posisi mana saja.");
            } 

        input.close(); 
        } 
}
