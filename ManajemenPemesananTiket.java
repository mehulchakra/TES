// Kelas ManajemenPemesananTiket untuk mengelola pemesanan tiket
public class ManajemenPemesananTiket {
        // Atribut agenTiket untuk menyimpan informasi agen tiket
    private AgenTiket agenTiket;
    
    // Konstruktor kelas ManajemenPemesananTiket
    public ManajemenPemesananTiket(AgenTiket agenTiket) {
        this.agenTiket = agenTiket;
    }
    // Getter untuk agenTiket
    public AgenTiket getAgenTiket() {
        return agenTiket;
    }
}
