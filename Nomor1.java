public class Nomor1{
    public static void main(String[] args){
            int anak = 0;
    float tunjangan;
    
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Jumlah anggota keluarga :");
    anak = scanner.nextInt();

    if (anak <= 3){
        tunjangan = anak * 100000;
        System.out.println("besar tunjangan kesehatan =" + tunjangan);

    }else if (anak > 3){
        tunjangan = 300000 + (anak * 50000);
        System.out.println("besar tunjangan kesehatan =" + tunjangan);
    }
    

    }
}
