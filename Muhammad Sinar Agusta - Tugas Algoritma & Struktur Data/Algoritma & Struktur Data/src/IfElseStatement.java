public class IfElseStatement {
    public static void main(String[] args) {
        
        var nilai = 70;
        var absen = 70;

        if(nilai >=75 && absen >=75){
            System.out.println("kamu lulus");   
        }
        else if(nilai <=75 && absen >=75){
            System.out.println("kamu lulus bersyarat");
        }
        else{
            System.out.println("kamu DO");
        }
    //TERNARY OPERATION
        var nilai2 = 75;
        String hasil2 = nilai2 >= 75 ? "selamat anda lulus" : "silahkan coba lagi";

        System.out.println(hasil2);




        

    }
}
