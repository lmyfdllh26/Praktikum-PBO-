
package model;

public class AtletVolly extends DataAtlet {
    private String cabor;

    public AtletVolly (String nama, String cabor, int umur) {
        super(nama, cabor, umur);
        this.cabor = cabor;
    }

    public String getPosisi() {
        return cabor;
    }

    public void setPosisi(String posisi) {
        this.cabor = cabor;
    }

    // Overriding displayInfo
    public void displayInfo() {
        System.out.println("Atlet Volly: " + getNama() + 
                           " | Cabang Olahraga: " + getCabor() + 
                           " | Umur : " + getUmur());
    }
}


