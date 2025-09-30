package model;
//Abstraction
public abstract class Atlet {
    //Encapsulation
    private String nama;
    private String cabangOlahraga;
    private int umur;

    //Constructor
     public Atlet(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
     
    public Atlet(String nama, String cabangOlahraga, int umur) {
        this.nama = nama;
        this.cabangOlahraga = cabangOlahraga;
        this.umur = umur;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCabangOlahraga() {
        return cabangOlahraga;
    }

    public void setCabangOlahraga(String cabangOlahraga) {
        this.cabangOlahraga = cabangOlahraga;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method abstract → wajib di-override subclass
    public abstract void tampilkanInfo();
}
