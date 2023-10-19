public class Percabangan_If {
    public static void main(String[] args) {
        int number = 7;

        if(number % 2 ==0){
            System.out.println(" adalah bilangan genap");
        }
        else{
            System.out.println(" adalah bilangan ganjil");
        }
         
        
        int nilai_mahasiswa = 85;

    if(nilai_mahasiswa <= 100 && nilai_mahasiswa >84){
        System.out.println(" nilai : A");
    }
    else if(nilai_mahasiswa <= 84 && nilai_mahasiswa >72){
        System.out.println(" nilai : B ");
    }
    else if(nilai_mahasiswa <= 72 && nilai_mahasiswa >54){
        System.out.println(" nilai : C");
    }
    else if(nilai_mahasiswa <= 54 && nilai_mahasiswa >44){
        System.out.println(" nilai : D");
    }
    else{
        System.out.println(" nilai : E");
    }
}

}
