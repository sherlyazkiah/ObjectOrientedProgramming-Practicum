package assignment;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index = 0;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        }
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println("Nama: " + pegawai.getNama() + ", Gaji: " + pegawai.getGaji());
            }
        }
    }
}
