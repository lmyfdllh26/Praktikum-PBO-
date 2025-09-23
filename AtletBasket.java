package model;

public class AtletBasket extends Atlet {
    public AtletBasket(String nama, int umur) {
        super(nama, "Basket", umur);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Atlet Basket ===");
        super.tampilkanInfo();
    }
}
