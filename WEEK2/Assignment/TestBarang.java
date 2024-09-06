package WEEK2.Assignment;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();

        brg1.kode = "HP215";
        brg1.namaBarang = "Handphone";
        brg1.hargaDasar = 8900000;
        brg1.diskon = 5;
        brg1.tampilData();
    }
}
