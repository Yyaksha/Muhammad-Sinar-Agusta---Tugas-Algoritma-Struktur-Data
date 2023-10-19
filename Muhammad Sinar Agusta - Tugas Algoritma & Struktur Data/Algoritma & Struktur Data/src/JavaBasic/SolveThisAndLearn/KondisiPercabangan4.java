package JavaBasic.SolveThisAndLearn;
// NAMA     : MUHAMMAD SINAR AGUSTA  TI23A
// NIM      : 20230040188
import javax.swing.JOptionPane;
public class KondisiPercabangan4 {
    public static void main(String[] args) {
        int waktu_lari = Integer.parseInt(JOptionPane.showInputDialog("Waktu Olahraga Lari:"));
        int waktu_plank = Integer.parseInt(JOptionPane.showInputDialog("Waktu Olahraga Plank:"));
        int waktu_pushup = Integer.parseInt(JOptionPane.showInputDialog("Waktu Olahraga push-up:"));

        int lari_per_menit = 60/5;
        double pushup_per_menit = 200.0/30.0;
        int plank_per_menit = 5;
        double total = 0;

        if(waktu_lari > 0){
            total += waktu_lari * lari_per_menit;
        }
        if(waktu_plank > 0){
            total += waktu_plank * plank_per_menit;
        }
        if(waktu_pushup > 0){
            total += waktu_pushup * pushup_per_menit;
        }
        System.out.println("Jumlah Kalori Terbakar:" + total);
    }
}
