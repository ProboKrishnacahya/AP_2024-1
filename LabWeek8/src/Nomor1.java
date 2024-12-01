import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahSiswa = 5;
        int jumlahUjian = 4;
        
        int[][] nilai = new int[jumlahSiswa][jumlahUjian];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai untuk Siswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahUjian; j++) {
                System.out.print("Nilai ujian ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nRata-rata nilai setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahUjian; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / jumlahUjian;
            System.out.println("Rata-rata nilai siswa " + (i + 1) + ": " + rataRata);
        }

        scanner.close();
    }
}
