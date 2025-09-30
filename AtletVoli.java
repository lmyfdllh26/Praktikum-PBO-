package model;
// Inheritance: AtletVoli mewarisi Atlet
public class AtletVoli extends Atlet {

    public AtletVoli(String nama, int umur) {
        super(nama, "Voli", umur);
    }

   // Polymorphism (Overriding) 
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Atlet Voli ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Cabang: " + getCabangOlahraga());
        System.out.println("Umur: " + getUmur() + " tahun");
    }
}
