import java.util.Scanner;

public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String namaPelanggan;
        do {
            System.out.print("masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = ((kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti));
            System.out.println("total harga yang harus dibayar: " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai");
    }
}
