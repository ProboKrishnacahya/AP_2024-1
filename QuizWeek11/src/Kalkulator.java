import java.util.Scanner;

public class Kalkulator {
    String[][] riwayat = new String[100][2]; // Menyimpan 100 baris data (contoh) dan 2 kolom data yaitu jenis operasi dan hasil perhitungan
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

            switch (pilihan) {
                case 1: // Tambah
                    kalkulator.tambah();
                    break;
                case 2: // Kurang
                    kalkulator.kurang();
                    break;
                case 3: // Kali
                    kalkulator.kali();
                    break;
                case 4: // Bagi
                    kalkulator.bagi();
                    break;
                case 5: // Lihat riwayat
                    kalkulator.lihatRiwayat();
                    break;
                case 6: // Hapus seluruh riwayat
                    kalkulator.hapusRiwayat();
                    break;
                case 7: // Keluar
                    kalkulator.keluar();
                default:
                    System.out.println("Pilihan tidak valid. Harus angka 1-7.");
            }
        }
    }

    public void tambah() {
        double[] angka = inputAngka();
        double hasil = angka[0] + angka[1];
        simpanRiwayat("Penjumlahan", hasil);
        System.out.println("Hasil Penjumlahan: " + hasil);
    }

    public void kurang() {
        double[] angka = inputAngka();
        double hasil = angka[0] - angka[1];
        simpanRiwayat("Pengurangan", hasil);
        System.out.println("Hasil Pengurangan: " + hasil);
    }

    public void kali() {
        double[] angka = inputAngka();
        double hasil = angka[0] * angka[1];
        simpanRiwayat("Perkalian", hasil);
        System.out.println("Hasil Perkalian: " + hasil);
    }

    public void bagi() {
        double[] angka = inputAngka();
        if (angka[1] == 0) {
            System.out.println("Pembagi tidak boleh 0.");
            return;
        }
        double hasil = angka[0] / angka[1];
        simpanRiwayat("Pembagian", hasil);
        System.out.println("Hasil Pembagian: " + hasil);
    }

    public double[] inputAngka() {
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        return new double[] { angka1, angka2 }; // Mengembalikan array double dengan 2 angka yang dimasukkan
    }

    public void simpanRiwayat(String operasi, double hasil) {
        riwayat[indexRiwayat][0] = operasi; // Menyimpan jenis operasi
        riwayat[indexRiwayat][1] = String.valueOf(hasil); // Menyimpan dan casting hasil perhitungan dari double ke string
        indexRiwayat++; // Menambahkan index untuk riwayat perhitungan
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

        // Membuat array baru untuk menghapus seluruh data lama
        riwayat = new String[100][2];
        indexRiwayat = 0;
        System.out.println("Seluruh riwayat telah dihapus.");
    }

    public void keluar() {
        System.out.println("Program selesai.");
        System.exit(0);
    }
}