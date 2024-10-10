import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, terendah = 100, tertinggi = 0;
        int lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }
            if (nilai < 60) {
                tidakLulus++;
            }
        }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " + terendah);
        System.out.println("jumlah lulus: " + lulus);
        System.out.println("jumlah tidak lulus: " + tidakLulus);
    }
}
