package WEEK8;

import java.util.Queue;
import java.util.LinkedList;

class contohRestaurant {
    private double uang;
    private int stokBahan;  // jumlah total bahan yang ada
    private int reputasi;  // reputasi restoran dari 0-100
    private Queue<contohCustomer> antrianPelanggan;  // Antrian pelanggan

    public contohRestaurant(double uang, int stokBahan, int reputasi) {
        this.uang = uang;
        this.stokBahan = stokBahan;
        this.reputasi = reputasi;
        this.antrianPelanggan = new LinkedList<>();
    }

    public void tambahPelangganKeAntrian(contohCustomer pelanggan) {
        antrianPelanggan.add(pelanggan);
        System.out.println(pelanggan.getNama() + " telah datang ke restoran.");
    }

    public void layaniPelanggan() {
        if (!antrianPelanggan.isEmpty()) {
            contohCustomer pelanggan = antrianPelanggan.poll();
            System.out.println("Melayani pelanggan: " + pelanggan.getNama());
            // Simulasi pemesanan dan pembayaran
        } else {
            System.out.println("Tidak ada pelanggan dalam antrian.");
        }
    }

    public void kelolaStok(int jumlah) {
        stokBahan += jumlah;
        System.out.println("Stok bahan saat ini: " + stokBahan);
    }

    public void ukurKepuasanPelanggan(contohCustomer pelanggan) {
        if (pelanggan.isMarah()) {
            reputasi -= 10;
            System.out.println(pelanggan.getNama() + " marah! Reputasi menurun.");
        } else {
            reputasi += 5;
            System.out.println(pelanggan.getNama() + " puas! Reputasi meningkat.");
        }
    }
    
    public void tampilkanStatus() {
        System.out.println("Uang: " + uang + " | Stok Bahan: " + stokBahan + " | Reputasi: " + reputasi);
    }
}
