import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] gaji = new int[4][3]; // 4 karyawan, 3 bulan

        // Input data gaji
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan gaji Karyawan " + (i + 1) + " untuk 3 bulan:");
            for (int j = 0; j < 3; j++) {
                gaji[i][j] = scanner.nextInt(); // gaji karyawan i bulan j
            }
        }

        // Hitung total gaji untuk masing-masing karyawan
        for (int i = 0; i < 4; i++) {
            int total = 0; // Inisialisasi total gaji karyawan i
            for (int j = 0; j < 3; j++) {
                total += gaji[i][j]; // Tambahkan gaji bulan j ke total
            }
            System.out.println("Total gaji Karyawan " + (i + 1) + ": " + total);
        }

        scanner.close();
    }
}