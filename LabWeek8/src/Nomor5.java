import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahSiswa = 5;
        int jumlahPelajaran = 3;

        // Array 2D untuk menyimpan nilai setiap siswa di 3 mata pelajaran
        int[][] nilai = new int[jumlahSiswa][jumlahPelajaran];

        // Meminta input nilai untuk setiap siswa di setiap mata pelajaran
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai untuk Siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPelajaran; j++) {
                System.out.print("Nilai untuk pelajaran ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan nilai tertinggi setiap siswa
        System.out.println("\nNilai tertinggi setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int nilaiTertinggi = nilai[i][0]; // Inisialisasi dengan nilai pertama sebagai nilai tertinggi sementara
            for (int j = 1; j < jumlahPelajaran; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                }
            }
            System.out.println("Nilai tertinggi Siswa " + (i + 1) + ": " + nilaiTertinggi);
        }

        scanner.close();
    }
}
