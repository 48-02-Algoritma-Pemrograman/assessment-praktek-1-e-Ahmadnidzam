public class Nomor2{
    public static void main(String[] args){
        double hargaLabubu = 300000;
        double hargaJenglot = 250000;
        double hargaVoodo = 200000;
        int totalTransaksi = 0;
        double totalUangDiterima = 0;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Masukan nama produk [Labubu/Jenglot/Voodo]: ");
            String produk = input.nextLine().toUpperCase();


            if (!produk.equals("LABUBU") && !produk.equals("JENGLOT") && !produk.equals("VOODO")) {
                System.out.println("Produk tidak valid. Silakan coba lagi.");
                continue;
            }


            System.out.print("Jumlah pembelian: ");
            int jumlahPembelian = input.nextInt();
            input.nextLine();


            double subtotal = 0;
            switch (produk) {
                case "LABUBU":
                    subtotal = hargaLabubu * jumlahPembelian;
                    break;
                case "JENGLOT":
                    subtotal = hargaJenglot * jumlahPembelian;
                    break;
                case "VOODO":
                    subtotal = hargaVoodo * jumlahPembelian;
                    break;
            }

            double diskon = 0;
            if (subtotal >= 1000000) {
                diskon = 0.15;
            } else if (subtotal >= 500000) {
                diskon = 0.10;
            }

            double totalSetelahDiskon = subtotal * (1 - diskon);
            totalUangDiterima += totalSetelahDiskon;
            totalTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            String inputLagi = input.nextLine().toUpperCase();
            if (!inputLagi.equals("Y")) {
                break;
            }
        }

        System.out.println("Total transaksi yang terjadi = " + totalTransaksi);
        System.out.printf("Jumlah uang yang diterima =" + totalUangDiterima);


        input.close();
    }
}
