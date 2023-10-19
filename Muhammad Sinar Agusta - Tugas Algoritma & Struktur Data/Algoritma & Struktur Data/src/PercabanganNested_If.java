public class PercabanganNested_If {
    public static void main(String[] args) {
        
        String username = "javaprogrammer";
        String password = "12345678";

        if(username =="javaprogrammer"){
            if(password =="12345678"){
                System.out.println(" Selamat Datang");
            }
            else{
                System.out.println(" Password anda salah");
            }
        }
        else{
            System.out.println(" Username anda salah");
        }
    }
}
