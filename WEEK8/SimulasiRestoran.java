package WEEK8;

import java.util.*;

class Makanan {
    private String nama;
    private double harga;
    private List<String> bahan;
    private int waktuMemasak;

    public Makanan(String nama, double harga, List<String> bahan, int waktuMemasak) {
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

    public int getWaktuMemasak() {
        return waktuMemasak;
    }
}

class Pelanggan {
    private String nama;
    private Makanan preferensiMakanan;
    private int kesabaran;

    public Pelanggan(String nama, Makanan preferensiMakanan, int kesabaran) {
        this.nama = nama;
        this.preferensiMakanan = preferensiMakanan;
        this.kesabaran = kesabaran;
    }

    public String getNama() {
        return nama;
    }

    public Makanan getPreferensiMakanan() {
        return preferensiMakanan;
    }

    public int getKesabaran() {
        return kesabaran;
    }

    public void kurangiKesabaran() {
        if (kesabaran > 0) {
            kesabaran--;
        }
    }

    public boolean isMarah() {
        return kesabaran <= 0;
    }
}

class Karyawan {
    private String nama;
    private String role;
    private int skillLevel;

    public Karyawan(String nama, String role, int skillLevel) {
        this.nama = nama;
        this.role = role;
        this.skillLevel = skillLevel;
    }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }

    public int getSkillLevel() {
        return skillLevel;
    }
}

class Restoran {
    private double uang;
    private int stokBurger;
    private int stokKentang;
    private int stokMinuman;
    private int reputasi;
    Queue<Pelanggan> antrianPelanggan;

    public Restoran(double uang, int stokBurger, int stokKentang, int stokMinuman, int reputasi) {
        this.uang = uang;
        this.stokBurger = stokBurger;
        this.stokKentang = stokKentang;
        this.stokMinuman = stokMinuman;
        this.reputasi = reputasi;
        this.antrianPelanggan = new LinkedList<>();
    }

    public void tambahPelangganKeAntrian(Pelanggan pelanggan) {
        antrianPelanggan.add(pelanggan);
        System.out.println("Pelanggan " + pelanggan.getNama() + " tiba dengan pesanan: " + pelanggan.getPreferensiMakanan().getNama());
    }

    public void kelolaStok(int jumlahBurger, int jumlahKentang, int jumlahMinuman) {
        stokBurger += jumlahBurger;
        stokKentang += jumlahKentang;
        stokMinuman += jumlahMinuman;
        System.out.println("Stok bahan saat ini: burger (" + stokBurger + "), kentang goreng (" + stokKentang + "), minuman (" + stokMinuman + ")");
    }

    public void masakMakanan(Makanan makanan) {
        if (makanan.getNama().equals("Burger") && stokBurger > 0) {
            stokBurger--;
            System.out.println("Memasak " + makanan.getNama() + "... (Waktu: " + makanan.getWaktuMemasak() + " detik)");
            try {
                Thread.sleep(makanan.getWaktuMemasak() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(makanan.getNama() + " telah selesai dimasak.");
        } else if (makanan.getNama().equals("Kentang Goreng") && stokKentang > 0) {
            stokKentang--;
            System.out.println("Memasak " + makanan.getNama() + "... (Waktu: " + makanan.getWaktuMemasak() + " detik)");
            try {
                Thread.sleep(makanan.getWaktuMemasak() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(makanan.getNama() + " telah selesai dimasak.");
        } else if (makanan.getNama().equals("Minuman") && stokMinuman > 0) {
            stokMinuman--;
            System.out.println("Membuat " + makanan.getNama() + "... (Waktu: " + makanan.getWaktuMemasak() + " detik)");
            try {
                Thread.sleep(makanan.getWaktuMemasak() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(makanan.getNama() + " telah selesai dibuat.");
        } else {
            System.out.println("Stok bahan habis, tidak bisa memasak!");
        }
    }

    public void layaniPelanggan() {
        if (!antrianPelanggan.isEmpty()) {
            Pelanggan pelanggan = antrianPelanggan.poll();
            System.out.println("Melayani pelanggan: " + pelanggan.getNama());
            System.out.println("Kesabaran awal: " + pelanggan.getKesabaran() + " detik");

            // Proses memasak
            if (stokBurger == 0 && pelanggan.getPreferensiMakanan().getNama().equals("Burger")) {
                System.out.println("Stok bahan habis!\n" + pelanggan.getNama() + " pergi meninggalkan restoran.");
                reputasi -= 1;
                System.out.println("Reputasi menurun.");
                return;
            } else if (stokKentang == 0 && pelanggan.getPreferensiMakanan().getNama().equals("Kentang Goreng")) {
                System.out.println("Stok bahan habis!\n" + pelanggan.getNama() + " pergi meninggalkan restoran.");
                reputasi -= 1;
                System.out.println("Reputasi menurun.");
                return;
            } else if (stokMinuman == 0 && pelanggan.getPreferensiMakanan().getNama().equals("Minuman")) {
                System.out.println("Stok bahan habis!\n" + pelanggan.getNama() + " pergi meninggalkan restoran.");
                reputasi -= 1;
                System.out.println("Reputasi menurun.");
                return;
            }

            masakMakanan(pelanggan.getPreferensiMakanan());

            // Sajikan pesanan
            System.out.println("Pesanan " + pelanggan.getPreferensiMakanan().getNama() + " telah disajikan kepada " + pelanggan.getNama());

            // Pembayaran
            uang += pelanggan.getPreferensiMakanan().getHarga();
            System.out.println(pelanggan.getNama() + " telah membayar Rp. " + pelanggan.getPreferensiMakanan().getHarga());

            // Menampilkan kesabaran tersisa
            int kesabaranTersisa = pelanggan.getKesabaran() - pelanggan.getPreferensiMakanan().getWaktuMemasak();
            System.out.println("Kesabaran tersisa: " + kesabaranTersisa + " detik");

            // Ukur kepuasan
            ukurKepuasanPelanggan(pelanggan);
        } else {
            System.out.println("Tidak ada pelanggan dalam antrian.");
        }
    }

    public void ukurKepuasanPelanggan(Pelanggan pelanggan) {
        if (pelanggan.isMarah()) {
            reputasi -= 10;
            System.out.println("Pelanggan " + pelanggan.getNama() + " marah! Reputasi menurun.");
        } else {
            reputasi += 5;
            System.out.println("Pelanggan " + pelanggan.getNama() + " puas! Reputasi meningkat.");
        }
    }

    public void tampilkanStatus() {
        System.out.println("Total uang: " + uang + " | Stok Bahan: burger (" + stokBurger + "), kentang goreng (" + stokKentang + "), minuman (" + stokMinuman + ") | Reputasi: " + reputasi);
    }
}

public class SimulasiRestoran {
    public static void main(String[] args) {
        // Menampilkan informasi awal restoran
        System.out.println("--------------------------------------------------------");
        System.out.println("               SELAMAT DATANG DI RESTORAN               ");
        System.out.println("--------------------------------------------------------");
        Restoran restoran = new Restoran(0, 2, 3, 2, 60);  // Uang awal 0, stok bahan burger 2, kentang goreng 3, minuman 2, reputasi 60
        restoran.kelolaStok(0, 0, 0); // Menampilkan stok bahan

        Random random = new Random();
        String[] namaPelanggan = {"Ali", "Budi", "Citra", "Dedi", "Eka"};

        // Daftar makanan yang tersedia
        Makanan burger = new Makanan("Burger", 45000, Arrays.asList("Roti", "Daging", "Selada"), 2);
        Makanan kentang = new Makanan("Kentang Goreng", 20000, Arrays.asList("Kentang", "Garam"), 1);
        Makanan minuman = new Makanan("Minuman", 10000, Arrays.asList("Air", "Sirup"), 1);
        List<Makanan> menu = Arrays.asList(burger, kentang, minuman);

        // Simulasi kedatangan pelanggan secara acak
        for (int i = 0; i < 7; i++) {  // 7 pelanggan untuk contoh
            int kesabaran = random.nextInt(1) + 1;  // Kesabaran antara 5-15 detik

            Pelanggan pelanggan = new Pelanggan(namaPelanggan[random.nextInt(namaPelanggan.length)],
                                                menu.get(random.nextInt(menu.size())),
                                                kesabaran);
            restoran.tambahPelangganKeAntrian(pelanggan);
        }

        // Layani semua pelanggan dalam antrian
        while (!restoran.antrianPelanggan.isEmpty()) {
            restoran.layaniPelanggan();
            System.out.println("--------------------------------------------------------");
        }

        // Tampilkan status akhir
        restoran.tampilkanStatus();
    }
}