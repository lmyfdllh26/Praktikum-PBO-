package service;

import model.Atlet;
import model.AtletBasket;
import model.AtletVoli;

import java.util.ArrayList;

public class AtletService {
    private ArrayList<Atlet> daftarAtlet = new ArrayList<>();

    // CREATE
    public void tambahAtlet(String nama, String cabor, int umur) {
        Atlet atlet;
        if (cabor.equalsIgnoreCase("Basket")) {
            atlet = new AtletBasket(nama, umur);
        } else if (cabor.equalsIgnoreCase("Voli")) {
            atlet = new AtletVoli(nama, umur);
        } else {
            atlet = new Atlet(nama, cabor, umur); // default superclass
        }
        daftarAtlet.add(atlet);
        System.out.println("Atlet berhasil ditambahkan!");
    }

    // READ
    public void tampilkanAtlet() {
        if (daftarAtlet.isEmpty()) {
            System.out.println("Belum ada data atlet.");
        } else {
            System.out.println("=== Daftar Atlet ===");
            for (int i = 0; i < daftarAtlet.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarAtlet.get(i).tampilkanInfo(); // POLYMORPHISM + OVERRIDING
            }
        }
    }

    // UPDATE
    public void updateAtlet(int index, String nama, String cabor, int umur) {
        if (index >= 0 && index < daftarAtlet.size()) {
            Atlet atlet;
            if (cabor.equalsIgnoreCase("Basket")) {
                atlet = new AtletBasket(nama, umur);
            } else if (cabor.equalsIgnoreCase("Voli")) {
                atlet = new AtletVoli(nama, umur);
            } else {
                atlet = new Atlet(nama, cabor, umur);
            }
            daftarAtlet.set(index, atlet);
            System.out.println("Data atlet berhasil diperbarui!");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // DELETE
    public void hapusAtlet(int index) {
        if (index >= 0 && index < daftarAtlet.size()) {
            daftarAtlet.remove(index);
            System.out.println("Atlet berhasil dihapus!");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // SEARCH
    public void cariAtlet(String keyword) {
        boolean ditemukan = false;
        for (Atlet atlet : daftarAtlet) {
            if (atlet.getNama().equalsIgnoreCase(keyword) || atlet.getCabor().equalsIgnoreCase(keyword)) {
                atlet.tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Atlet dengan kata kunci '" + keyword + "' tidak ditemukan.");
        }
    }
}

