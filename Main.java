
package main;

import service.AtletService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtletService atletService = new AtletService();

        // isi data awal
        atletService.seedData();

        int pilihan;
        do {
            System.out.println("\n=== MENU ATLET ===");
            System.out.println("1. Lihat Atlet");
            System.out.println("2. Tambah Atlet");
            System.out.println("3. Update Atlet");
            System.out.println("4. Hapus Atlet");
            System.out.println("5. Cari Atlet");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // flush enter

            switch (pilihan) {
                case 1:
                    atletService.tampilkanAtlet();
                    break;
                case 2:
                    atletService.tambahAtlet();
                    break;
                case 3:
                    atletService.updateAtlet();
                    break;
                case 4:
                    atletService.hapusAtlet();
                    break;
                case 5:
                    atletService.cariAtlet();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}

