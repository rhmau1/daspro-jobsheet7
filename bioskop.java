import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, diskon, totalPendapatanSehari = 0, totalBayar;
        int totalTiketSehari = 0, jumlahTiketDibeli;

        System.out.println("============BIOSKOP===============");

        while (true) {
            System.out.print("masukkan jumlah tiket yang dibeli (masukkan 0 untuk keluar): ");
            jumlahTiketDibeli = sc.nextInt();

            if (jumlahTiketDibeli == 0) {
                break;
            }

            if (jumlahTiketDibeli < 0) {
                System.out.println("jumlah tiket tidak valid");
                continue;
            }

            if (jumlahTiketDibeli > 10) {
                diskon = 0.15;
                totalBayar = (jumlahTiketDibeli * hargaTiket) - (diskon * (jumlahTiketDibeli * hargaTiket));
                System.out.println("diskon yang anda dapatkan: " + diskon * 100 + "%");
                System.out.println("total yang harus dibayar: " + totalBayar);
            } else if (jumlahTiketDibeli > 4) {
                diskon = 0.10;
                totalBayar = (jumlahTiketDibeli * hargaTiket) - (diskon * (jumlahTiketDibeli * hargaTiket));
                System.out.println("diskon yang anda dapatkan: " + diskon * 100 + "%");
                System.out.println("total yang harus dibayar: " + totalBayar);
            } else {
                totalBayar = (jumlahTiketDibeli * hargaTiket);
                System.out.println("anda tidak mendapatkan diskon");
                System.out.println("total yang harus dibayar: " + totalBayar);
            }
            totalTiketSehari += jumlahTiketDibeli;
            totalPendapatanSehari += totalBayar;
        }

        System.out.println("==================================");
        System.out.println("Total tiket terjual hari ini: " + totalTiketSehari);
        System.out.println("Total pendapatan hari ini: " + totalPendapatanSehari);
    }
}
