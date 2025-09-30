package model;
//Inheritance
public class AtletBasket extends Atlet {

    public AtletBasket(String nama, int umur) {
        super(nama, "Basket", umur);
    }

    //Polymorphism (Overriding)
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Atlet Basket ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Cabang: " + getCabangOlahraga());
        System.out.println("Umur: " + getUmur() + " tahun");
    }
}
