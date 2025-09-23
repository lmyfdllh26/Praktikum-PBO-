package main;

import service.AtletService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtletService service = new AtletService();
        int pilihan;

        do {
            System.out.println("\n=== Menu CRUD Atlet ===");
            System.out.println("1. Tambah Atlet");
            System.out.println("2. Tampilkan Atlet");
            System.out.println("3. Update Atlet");
            System.out.println("4. Hapus Atlet");
            System.out.println("5. Cari Atlet");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                sc.next();
            }
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan cabang (Basket/Voli): ");
                    String cabor = sc.nextLine();
                    System.out.print("Masukkan umur: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Umur harus berupa angka!");
                        sc.next();
                    }
                    int umur = sc.nextInt();
                    sc.nextLine();
                    service.tambahAtlet(nama, cabor, umur);
                }
                case 2 -> service.tampilkanAtlet();
                case 3 -> {
                    service.tampilkanAtlet();
                    System.out.print("Masukkan nomor atlet yang ingin diupdate: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan cabang baru: ");
                    String cabor = sc.nextLine();
                    System.out.print("Masukkan umur baru: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    service.updateAtlet(index, nama, cabor, umur);
                }
                case 4 -> {
                    service.tampilkanAtlet();
                    System.out.print("Masukkan nomor atlet yang ingin dihapus: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    service.hapusAtlet(index);
                }
                case 5 -> {
                    System.out.print("Masukkan nama atau cabang yang dicari: ");
                    String keyword = sc.nextLine();
                    service.cariAtlet(keyword);
                }
                case 0 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
