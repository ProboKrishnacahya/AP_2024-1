import java.util.Scanner;

public class BeasiswaConstant {
    // Mendeklarasikan konstanta
    public static final int MIN_KEHADIRAN = 70;
    public static final int MIN_POIN_KEAKTIFAN = 50;
    public static final int NILAI_A_MIN = 91;
    public static final int NILAI_A_MAX = 100;
    public static final int NILAI_B_MIN = 88;
    public static final int NILAI_B_MAX = 90;
    public static final int NILAI_C_MIN = 84;
    public static final int NILAI_C_MAX = 87;
    public static final int NILAI_D_MIN = 81;
    public static final int NILAI_D_MAX = 83;
    public static final int NILAI_E_MIN = 76;
    public static final int NILAI_E_MAX = 80;

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int nilaiRapor, persentaseKehadiran, poinKeaktifan;
        String kategori, beasiswa;

        // Input persentase kehadiran
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        persentaseKehadiran = input.nextInt();

        // Cek syarat kehadiran
        if (persentaseKehadiran < MIN_KEHADIRAN) {
            System.out.println("Tidak termasuk kategori karena persentase kehadiran di bawah " + MIN_KEHADIRAN + "%.");
            System.out.println("Tidak ada beasiswa karena persentase kehadiran di bawah " + MIN_KEHADIRAN + "%.");
            input.close();
            return;  // Menghentikan program jika syarat kehadiran tidak terpenuhi
        }

        // Input poin keaktifan
        System.out.print("Masukkan poin keaktifan (0-100): ");
        poinKeaktifan = input.nextInt();

        // Cek syarat poin keaktifan
        if (poinKeaktifan < MIN_POIN_KEAKTIFAN) {
            System.out.println("Tidak termasuk kategori karena poin keaktifan di bawah " + MIN_POIN_KEAKTIFAN + ".");
            System.out.println("Tidak ada beasiswa karena poin keaktifan di bawah " + MIN_POIN_KEAKTIFAN + ".");
            input.close();
            return;  // Menghentikan program jika syarat keaktifan tidak terpenuhi
        }

        // Input nilai rapor
        System.out.print("Masukkan nilai rata-rata rapor (0-100): ");
        nilaiRapor = input.nextInt();

        // Logika untuk menentukan kategori beasiswa
        if (nilaiRapor >= NILAI_A_MIN && nilaiRapor <= NILAI_A_MAX) {
            kategori = "A";
            beasiswa = "100% DPP + 100% SPP + 100% SKS";
        } else if (nilaiRapor >= NILAI_B_MIN && nilaiRapor <= NILAI_B_MAX) {
            kategori = "B";
            beasiswa = "100% DPP + 50% SPP";
        } else if (nilaiRapor >= NILAI_C_MIN && nilaiRapor <= NILAI_C_MAX) {
            kategori = "C";
            beasiswa = "100% DPP";
        } else if (nilaiRapor >= NILAI_D_MIN && nilaiRapor <= NILAI_D_MAX) {
            kategori = "D";
            beasiswa = "75% DPP";
        } else if (nilaiRapor >= NILAI_E_MIN && nilaiRapor <= NILAI_E_MAX) {
            kategori = "E";
            beasiswa = "50% DPP";
        } else {
            kategori = "Tidak termasuk kategori karena nilai di bawah " + NILAI_E_MIN + ".";
            beasiswa = "Tidak ada beasiswa karena nilai di bawah " + NILAI_E_MIN + ".";
        }

        // Output hasil kehadiran, keaktifan, dan kategori beasiswa
        System.out.println("\n** Hasil beasiswa **");
        System.out.println("Persentase kehadiran: " + persentaseKehadiran);
        System.out.println("Poin keaktifan: " + poinKeaktifan);
        System.out.println("Nilai rata-rata rapor: " + nilaiRapor);
        System.out.println("Kategori: " + kategori);
        System.out.println("Beasiswa: " + beasiswa);

        // Menutup scanner
        input.close();
    }
}