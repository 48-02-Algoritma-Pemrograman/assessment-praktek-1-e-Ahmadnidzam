import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
    int anak = 0;
    float tunjangan;
    
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Jumlah anggota keluarga :");
    anak = scanner.nextInt();

    if (anak >=1 && anak <= 3){
        tunjangan = anak * 100000;

    }else if (anak > 3){
        tunjangan = 300000 + ((anak - 3) * 50000);

    }else{
        tunjangan = 0;
    }
    System.out.println("Besar tunjangan kesehatan =" + tunjangan);
    scanner.close();
    
    
    }
}
