import java.util.Scanner;

// Kelas utama PemesananTiketApp dengan metode main untuk menjalankan program
public class PemesananTiketApp {
    public static void main(String[] args) {
                // Setup Scanner dan inisialisasi komponen
        Scanner scanner = new Scanner(System.in);
        AgenTiket agenTiket = new AgenTiket();
        ManajemenPemesananTiket manajemen = new ManajemenPemesananTiket(agenTiket);

        // Contoh menambahkan konser
        agenTiket.tambahKonser(new Konser("Konser Rock", "2023-12-10", 50000));
        
        // Loop untuk menu utama
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu Utama:");
            System.out.println("1. Lihat Daftar Konser");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Daftar Pemesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            
            // Switch case untuk menangani pilihan menu
            switch (pilihan) {
                case 1:
                    agenTiket.tampilkanDaftarKonser();
                    break;
                case 2:
    if (agenTiket.daftarKonser.isEmpty()) {
        System.out.println("Tidak ada konser yang tersedia saat ini.");
        break;
    }

    System.out.println("Daftar Konser:");
    int idx = 1;
    for (Konser konser : agenTiket.daftarKonser) {
        System.out.println(idx++ + ". " + konser.getInfo());
    }

    System.out.print("Pilih konser (nomor): ");
    int pilihanKonser = scanner.nextInt();

    if (pilihanKonser < 1 || pilihanKonser > agenTiket.daftarKonser.size()) {
        System.out.println("Pilihan tidak valid.");
        break;
    }

    Konser konserDipilih = agenTiket.daftarKonser.get(pilihanKonser - 1);

    System.out.print("Masukkan jumlah tiket: ");
    int jumlahTiket = scanner.nextInt();
    if (jumlahTiket < 1) {
        System.out.println("Jumlah tiket tidak valid.");
        break;
    }

    agenTiket.pesanTiket(konserDipilih.getNamaKonser(), jumlahTiket);
    System.out.println("Tiket berhasil dipesan.");
    break;
                case 3:
                    agenTiket.tampilkanDaftarPemesanan();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
