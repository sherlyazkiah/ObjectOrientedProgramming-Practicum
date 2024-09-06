package WEEK2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        //Add more object
        mhs2.nim = 102;
        mhs2.nama = "Clara";
        mhs2.alamat = "Jl. Mawar No 3C";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "Nathan";
        mhs3.alamat = "Jl. Melati No 5D";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
    }
}
