import java.util.ArrayList;

// Kelas AgenTiket mengimplementasikan interface PemesananTiket
public class AgenTiket implements PemesananTiket {
        // Daftar konser dan pemesanan yang tersedia
    public ArrayList<Konser> daftarKonser = new ArrayList<>();
    private ArrayList<String> daftarPemesanan = new ArrayList<>();
    
    // Implementasi metode dari interface PemesananTiket
    @Override
    public void pesanTiket(String namaKonser, int jumlahTiket) {
        daftarPemesanan.add("Pemesanan: " + namaKonser + ", Jumlah: " + jumlahTiket);
    }

    @Override
    public void tampilkanDaftarPemesanan() {
        for (String pemesanan : daftarPemesanan) {
            System.out.println(pemesanan);
        }
    }
    
    // Metode untuk menambahkan konser ke daftar
    public void tambahKonser(Konser konser) {
        daftarKonser.add(konser);
    }
    
    // Metode untuk menampilkan daftar konser
    public void tampilkanDaftarKonser() {
        for (Konser konser : daftarKonser) {
            System.out.println(konser.getInfo());
        }
    }
}
