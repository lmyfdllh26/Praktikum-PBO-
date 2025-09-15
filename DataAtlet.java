package model;

public class DataAtlet {
    private String nama;
    private String cabor;
    private int umur;

    // Constructor
    public DataAtlet(String nama, String cabor, int umur) {
        this.nama = nama;
        this.cabor = cabor;
        this.umur = umur;
    }

    // Getter & Setter
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

    @Override
    public String toString() {
        return "Nama: " + nama + ", Cabor: " + cabor + ", Umur: " + umur;
    }
}
