import java.util.Scanner;

public class Beasiswa {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int persentaseKehadiran, poinKeaktifan, nilaiRapor;
        String kategori, beasiswa;

        // Input persentase kehadiran
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        persentaseKehadiran = input.nextInt();

        // Cek syarat kehadiran
        if (persentaseKehadiran < 70) {
            // Jika syarat kehadiran tidak terpenuhi, program dihentikan
            System.out.println("\n*****");
            System.out.println("Tidak termasuk kategori karena persentase kehadiran di bawah 70%.");
            System.out.println("Tidak ada beasiswa karena persentase kehadiran di bawah 70%.");

            // Menutup scanner
            input.close();
            return; // Hentikan program
        }

        // Input poin keaktifan
        System.out.print("Masukkan poin keaktifan (0-100): ");
        poinKeaktifan = input.nextInt();

        // Cek syarat poin keaktifan
        if (poinKeaktifan < 50) {
            // Jika syarat keaktifan tidak terpenuhi, program dihentikan
            System.out.println("\n*****");
            System.out.println("Tidak termasuk kategori karena poin keaktifan di bawah 50.");
            System.out.println("Tidak ada beasiswa karena poin keaktifan di bawah 50.");

            input.close();
            return;
        }

        // Jika syarat kehadiran dan keaktifan terpenuhi, lanjutkan ke input nilai rapor
        System.out.print("Masukkan nilai rata-rata rapor (0-100): ");
        nilaiRapor = input.nextInt();

        // Logika untuk menentukan kategori beasiswa
        if (nilaiRapor >= 91 && nilaiRapor <= 100) {
            kategori = "A";
            beasiswa = "100% DPP + 100% SPP + 100% SKS";
        } else if (nilaiRapor >= 88 && nilaiRapor <= 90) {
            kategori = "B";
            beasiswa = "100% DPP + 50% SPP";
        } else if (nilaiRapor >= 84 && nilaiRapor <= 87) {
            kategori = "C";
            beasiswa = "100% DPP";
        } else if (nilaiRapor >= 81 && nilaiRapor <= 83) {
            kategori = "D";
            beasiswa = "75% DPP";
        } else if (nilaiRapor >= 76 && nilaiRapor <= 80) {
            kategori = "E";
            beasiswa = "50% DPP";
        } else {
            kategori = "Tidak termasuk kategori karena nilai di bawah 76.";
            beasiswa = "Tidak ada beasiswa karena nilai di bawah 76.";
        }

        // Output hasil kehadiran, poin keaktifan, nilai rapor, dan beasiswa
        System.out.println("\n*****");
        System.out.println("Persentase kehadiran: " + persentaseKehadiran);
        System.out.println("Poin keaktifan: " + poinKeaktifan);
        System.out.println("Nilai rata-rata rapor: " + nilaiRapor);
        System.out.println("Kategori: " + kategori);
        System.out.println("Beasiswa: " + beasiswa);

        input.close();
    }
}