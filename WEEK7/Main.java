package WEEK7;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen(); // Dynamic method dispatch
        manusia1.makan(); // Will call Dosen's makan()

        Manusia manusia2 = new Mahasiswa(); // Dynamic method dispatch
        manusia2.makan(); // Will call Mahasiswa's makan()
    }
}
