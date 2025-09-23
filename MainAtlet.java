package main;

import java.util.Scanner;
import service.AtletService;

public class MainAtlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtletService service = new AtletService();

        int pilihan;
        do {
            System.out.println("\n=== Menu Manajemen Daftar Atlet ===");
            System.out.println("1. Tambah Atlet");
            System.out.println("2. Lihat Daftar Atlet");
            System.out.println("3. Ubah Data Atlet");
            System.out.println("4. Hapus Atlet");
            System.out.println("5. Cari Atlet");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahAtlet();
                case 2 -> service.lihatDaftarAtlet();
                case 3 -> service.ubahAtlet();
                case 4 -> service.hapusAtlet();
                case 5 -> service.cariAtlet();
                case 0 -> System.out.println("👋 Keluar dari program. Terima kasih!");
                default -> System.out.println("❌ Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
