// Kelas Konser menyimpan informasi dasar tentang konser
public class Konser {
        // Atribut-atribut kelas Konser
    private String namaKonser;
    private String tanggal;
    private double hargaTiket;
    
    // Konstruktor kelas Konser
    public Konser(String namaKonser, String tanggal, double hargaTiket) {
        this.namaKonser = namaKonser;
        this.tanggal = tanggal;
        this.hargaTiket = hargaTiket;
    }
    
    // Method getInfo() untuk mendapatkan informasi konser
    public String getInfo() {
        return "Konser: " + namaKonser + ", Tanggal: " + tanggal + ", Harga Tiket: " + hargaTiket;
    }


    // Setters and Getters
    public String getNamaKonser() {
        return namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}
