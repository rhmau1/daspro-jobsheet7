import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.println("==================================");
            System.out.print("masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("masukkan durasi parkir: ");
                durasi = sc.nextInt();
                if (durasi < 0) {
                    System.out.println("durasi parkir tidak valid");
                    continue;
                }
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
            } else if (jenis == 0) {
                System.out.println("keluar");
            } else {
                System.out.println("jenis kendaraan tidak valid");
            }
        } while (jenis != 0);
        System.out.println("==================================");
        System.out.println("total biaya parkir: " + total);
    }
}
