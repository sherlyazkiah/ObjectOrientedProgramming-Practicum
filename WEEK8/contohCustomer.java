package WEEK8;

class contohCustomer {
    private String nama;
    private String preferensiMakanan;
    private int kesabaran;  // tingkat kesabaran dalam detik

    public contohCustomer(String nama, String preferensiMakanan, int kesabaran) {
        this.nama = nama;
        this.preferensiMakanan = preferensiMakanan;
        this.kesabaran = kesabaran;
    }

    public String getNama() {
        return nama;
    }

    public String getPreferensiMakanan() {
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
