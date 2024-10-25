package WEEK8;

import java.util.List;

class contohFood {
    private String nama;
    private double harga;
    private List<String> bahan;  // Komposisi dengan bahan
    private int waktuMemasak;  // waktu memasak dalam detik

    public contohFood(String nama, double harga, List<String> bahan, int waktuMemasak) {
        this.nama = nama;
        this.harga = harga;
        this.bahan = bahan;
        this.waktuMemasak = waktuMemasak;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public List<String> getBahan() {
        return bahan;
    }

    public int getWaktuMemasak() {
        return waktuMemasak;
    }
    
    public void tampilkanMakanan() {
        System.out.println("Makanan: " + nama + " | Harga: " + harga);
        System.out.println("Bahan-bahan: " + bahan);
        System.out.println("Waktu memasak: " + waktuMemasak + " detik");
    }
}
