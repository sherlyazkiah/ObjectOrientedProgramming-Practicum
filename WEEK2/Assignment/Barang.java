package WEEK2.Assignment;

public class Barang {
    public String kode;
    public String namaBarang;
    public double hargaDasar;
    public double diskon;

    public double hitungHargaJual(){
        return hargaDasar - (diskon / 100 * hargaDasar);
    }

    public void tampilData(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp" + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : Rp" + hitungHargaJual());
    }
}
