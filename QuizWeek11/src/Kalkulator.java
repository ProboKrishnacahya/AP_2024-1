import java.util.Scanner;

public class Kalkulator {
    String[][] riwayat = new String[100][2]; // Menyimpan jenis operasi dan hasil
    int indexRiwayat = 0; // Index untuk riwayat perhitungan
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        while (true) {
            System.out.println("\n--- Kalkulator ---");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Lihat riwayat");
            System.out.println("6. Hapus seluruh riwayat");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = kalkulator.scanner.nextInt();

            if (pilihan == 7) {
                System.out.println("Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1: // Tambah
                case 2: // Kurang
                case 3: // Kali
                case 4: // Bagi
                    kalkulator.operasi(pilihan); // Panggil operasi sesuai pilihan
                    break;
                case 5: // Lihat riwayat
                    kalkulator.lihatRiwayat();
                    break;
                case 6: // Hapus seluruh riwayat
                    kalkulator.hapusRiwayat();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void operasi(int pilihan) {
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;
        String operasi = "";

        switch (pilihan) {
            case 1: // Tambah
                hasil = angka1 + angka2;
                operasi = "Penjumlahan";
                break;
            case 2: // Kurang
                hasil = angka1 - angka2;
                operasi = "Pengurangan";
                break;
            case 3: // Kali
                hasil = angka1 * angka2;
                operasi = "Perkalian";
                break;
            case 4: // Bagi
                if (angka2 == 0) {
                    System.out.println("Pembagi tidak boleh 0.");
                    return;
                }
                hasil = angka1 / angka2;
                operasi = "Pembagian";
                break;
        }

        // Simpan riwayat
        riwayat[indexRiwayat][0] = operasi;
        riwayat[indexRiwayat][1] = String.valueOf(hasil);
        indexRiwayat++;

        System.out.println("Hasil " + operasi + ": " + hasil);
    }

    public void lihatRiwayat() {
        if (indexRiwayat == 0) {
            System.out.println("Belum ada riwayat perhitungan.");
            return;
        }

        System.out.println("\n--- Riwayat Perhitungan ---");
        for (int i = 0; i < indexRiwayat; i++) {
            System.out.println(riwayat[i][0] + " = " + riwayat[i][1]);
        }
    }

    public void hapusRiwayat() {
        if (indexRiwayat == 0) {
            System.out.println("Belum ada riwayat perhitungan untuk dihapus.");
            return;
        }

        // Mengosongkan riwayat
        for (int i = 0; i < indexRiwayat; i++) {
            riwayat[i][0] = null;
            riwayat[i][1] = null;
        }
        indexRiwayat = 0;
        System.out.println("Seluruh riwayat telah dihapus.");
    }
}