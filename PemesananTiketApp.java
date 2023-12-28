import java.util.Scanner;

public class PemesananTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgenTiket agenTiket = new AgenTiket();
        ManajemenPemesananTiket manajemen = new ManajemenPemesananTiket(agenTiket);

        // Contoh menambahkan konser
        agenTiket.tambahKonser(new Konser("Konser Rock", "2023-12-10", 50000));

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu Utama:");
            System.out.println("1. Lihat Daftar Konser");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Daftar Pemesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    agenTiket.tampilkanDaftarKonser();
                    break;
                case 2:
                    // Implementasi pilihan menu 2
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
