/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

// Class untuk merepresentasikan data Atlet
class DataAtlet {
    private String nama;
    private String cabor;
    private int umur;

    public DataAtlet(String nama, String cabor, int umur) {
        this.nama = nama;
        this.cabor = cabor;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Cabor: " + cabor + ", Umur: " + umur;
    }
}

public class Atlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DataAtlet> daftarAtlet = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== Menu Manajemen Daftar Atlet ===");
            System.out.println("1. Tambah Atlet");
            System.out.println("2. Lihat Daftar Atlet");
            System.out.println("3. Ubah Data Atlet");
            System.out.println("4. Hapus Atlet");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    // Tambah Atlet
                    System.out.print("Masukkan nama atlet: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan cabang olahraga: ");
                    String cabor = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();

                    daftarAtlet.add(new DataAtlet(nama, cabor, umur));
                    System.out.println("Atlet berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat Daftar Atlet
                    System.out.println("\n=== Daftar Atlet ===");
                    if (daftarAtlet.isEmpty()) {
                        System.out.println("Belum ada atlet yang terdaftar.");
                    } else {
                        for (int i = 0; i < daftarAtlet.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarAtlet.get(i));
                        }
                    }
                    break;

                case 3:
                    // Ubah Data Atlet
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
                        System.out.println("Data atlet berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 4:
                    // Hapus Atlet
                    System.out.print("Masukkan nomor atlet yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt();
                    scanner.nextLine();
                    if (indexHapus > 0 && indexHapus <= daftarAtlet.size()) {
                        daftarAtlet.remove(indexHapus - 1);
                        System.out.println("Atlet berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}

