package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Atlet;        // ✅ ini wajib ada
import model.AtletBasket;
import model.AtletVoli;

public class AtletService {
    private final List<Atlet> atletList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method untuk menambahkan data awal (seed)
    public void seedData() {
        atletList.add(new AtletBasket("Michael Jordan", 35));
        atletList.add(new AtletBasket("Kobe Bryant", 30));
        atletList.add(new AtletVoli("Agus", 25));
        atletList.add(new AtletVoli("Rina", 22));
    }

    // Polymorphism
    public void tampilkanAtlet() {
        if (atletList.isEmpty()) {
            System.out.println("Belum ada data atlet.");
        } else {
           for (Atlet atlet : atletList) {
                atlet.tampilkanInfo(); 
                System.out.println("----------------------");
            }
        }
    }

    // Tambah atlet baru
    public void tambahAtlet() {
        System.out.print("Masukkan nama atlet: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur atlet: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // flush newline
        System.out.print("Pilih jenis olahraga (1. Basket, 2. Voli): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        Atlet atletBaru;
        if (pilihan == 1) {
            atletBaru = new AtletBasket(nama, umur);
        } else {
            atletBaru = new AtletVoli(nama, umur);
        }

        atletList.add(atletBaru);
        System.out.println("Atlet berhasil ditambahkan!");
    }

    // Cari atlet
    public void cariAtlet() {
        System.out.print("Masukkan nama atlet yang dicari: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;

       for (Atlet atlet : atletList) {
            if (atlet.getNama().equalsIgnoreCase(nama)) {
                atlet.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Atlet tidak ditemukan.");
        }
    }

    // Update atlet
    public void updateAtlet() {
        System.out.print("Masukkan nama atlet yang ingin diupdate: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;

        for (Atlet atlet : atletList) {
            if (atlet.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan umur baru: ");
                int umurBaru = scanner.nextInt();
                scanner.nextLine();

                atlet.setNama(namaBaru);
                atlet.setUmur(umurBaru);

                System.out.println("Data atlet berhasil diupdate.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Atlet tidak ditemukan.");
        }
    }

    // Hapus atlet
    public void hapusAtlet() {
        System.out.print("Masukkan nama atlet yang ingin dihapus: ");
        String nama = scanner.nextLine();
        Atlet atletDihapus = null;

       for (Atlet atlet : atletList) {
            if (atlet.getNama().equalsIgnoreCase(nama)) {
                atletDihapus = atlet;
                break;
            }
        }

        if (atletDihapus != null) {
            atletList.remove(atletDihapus);
            System.out.println("Atlet berhasil dihapus.");
        } else {
            System.out.println("Atlet tidak ditemukan.");
        }
    }
}

