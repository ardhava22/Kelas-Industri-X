// Definisi class
class Jaket {
    // Atribut
    String merk;
    String warna;
    int Ukuran;

    // Konstruktor
    public Jaket(String merk, String warna, int Ukuran) {
        this.merk = merk;
        this.warna = warna;
        this.Ukuran = Ukuran;
    }

    // Metode
    public void displayInfo() {
        System.out.println("Jenis Kendaraan: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + Ukuran);
    }
}

public class Jaketkeren {
    public static void main(String[] args) {
        // Membuat objek dari class Kendaraan
        Jaket ellese = new Jaket("ellese", "Hitam", 95);

        // Memanggil metode untuk menampilkan informasi
        ellese.displayInfo();
    }
}