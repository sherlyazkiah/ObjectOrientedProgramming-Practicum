package assignment;

public class Main {
    public static void main(String[] args) {
        // Create Dosen objects
        Dosen dosen1 = new Dosen("12345", "Dr. Budi", "Malang");
        dosen1.setSKS(12);
        
        Dosen dosen2 = new Dosen("67890", "Prof. Siti", "Surabaya");
        dosen2.setSKS(10);

        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
