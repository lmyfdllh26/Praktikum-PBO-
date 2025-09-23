package model;

public class Atlet {
    private String nama;
    private String cabor;
    private int umur;

    // Constructor
    public Atlet(String nama, String cabor, int umur) {
        this.nama = nama;
        this.cabor = cabor;
        this.umur = umur;
    }

    // Getter & Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCabor() {
        return cabor;
    }

    public void setCabor(String cabor) {
        this.cabor = cabor;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method yang bisa dioverride
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Cabang: " + cabor + ", Umur: " + umur);
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Cabang: " + cabor + ", Umur: " + umur;
    }
}

