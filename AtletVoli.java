package model;

public class AtletVoli extends Atlet {
    public AtletVoli(String nama, int umur) {
        super(nama, "Voli", umur);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Atlet Voli ===");
        super.tampilkanInfo();
    }
}

