import java.util.ArrayList;

public class AgenTiket implements PemesananTiket {
    public ArrayList<Konser> daftarKonser = new ArrayList<>();
    private ArrayList<String> daftarPemesanan = new ArrayList<>();

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

    public void tambahKonser(Konser konser) {
        daftarKonser.add(konser);
    }

    public void tampilkanDaftarKonser() {
        for (Konser konser : daftarKonser) {
            System.out.println(konser.getInfo());
        }
    }
}
