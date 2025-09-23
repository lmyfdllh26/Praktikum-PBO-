package service;

import model.DataAtlet;
import model.AtletBasket;
import model.AtletVolly;
import java.util.ArrayList;
import java.util.Scanner;

public class AtletService {
    private ArrayList<DataAtlet> daftarAtlet = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE
    public void tambahAtlet() {
        System.out.print("Masukkan nama atlet: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan cabang olahraga: ");
        String cabor = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine();

        daftarAtlet.add(new DataAtlet(nama, cabor, umur));
        System.out.println("✅ Atlet berhasil ditambahkan!");
    }

    // READ
    public void lihatDaftarAtlet() {
        System.out.println("=== Daftar Atlet ===");
        if (daftarAtlet.isEmpty()) {
            System.out.println("Belum ada atlet yang terdaftar.");
        } else {
            for (int i = 0; i < daftarAtlet.size(); i++) {
                System.out.println((i + 1) + ". " + daftarAtlet.get(i));
            }
        }
    }

    // UPDATE
    public void ubahAtlet() {
        System.out.print("Masukkan nomor atlet yang ingin diubah: ");
        int indexUbah = scanner.nextInt();
        scanner.nextLine();
        if (indexUbah > 0 && indexUbah <= daftarAtlet.size()) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            System.out.print("Masukkan cabor baru: ");
            String caborBaru = scanner.nextLine();
            System.out.print("Masukkan umur baru: ");
            int umurBaru = scanner.nextInt();
            scanner.nextLine();

            daftarAtlet.set(indexUbah - 1, new DataAtlet(namaBaru, caborBaru, umurBaru));
            System.out.println("✅ Data atlet berhasil diubah!");
        } else {
            System.out.println("❌ Nomor tidak valid!");
        }
    }

    // DELETE
    public void hapusAtlet() {
        System.out.print("Masukkan nomor atlet yang ingin dihapus: ");
        int indexHapus = scanner.nextInt();
        scanner.nextLine();
        if (indexHapus > 0 && indexHapus <= daftarAtlet.size()) {
            daftarAtlet.remove(indexHapus - 1);
            System.out.println("✅ Atlet berhasil dihapus!");
        } else {
            System.out.println("❌ Nomor tidak valid!");
        }
    }

    // SEARCH
    public void cariAtlet() {
        System.out.print("Masukkan nama atau cabor yang ingin dicari: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (DataAtlet atlet : daftarAtlet) {
            if (atlet.getNama().toLowerCase().contains(keyword) || atlet.getCabor().toLowerCase().contains(keyword)) {
                System.out.println(atlet);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("⚠️ Atlet tidak ditemukan.");
        }
    }
}
