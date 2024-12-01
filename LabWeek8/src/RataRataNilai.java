import java.util.Scanner;
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah mahasiswa: ");
        int jumlahSiswa = scanner.nextInt();
        System.out.println("Masukan berapa ujian: ");
        int jumlahUjian = scanner.nextInt();
    

        int[][] nilai = new int[jumlahSiswa][jumlahUjian];

        System.out.println("Masukkan nilai ulangan matematika untuk setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahUjian; j++) {
                System.out.print("Nilai ujian ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nRata-rata nilai setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahUjian; j++) {
                totalNilai += nilai[i][j];
            }
            double rataRata = (double) totalNilai / jumlahUjian;
            System.out.println("Rata-rata nilai siswa " + (i + 1) + ": " + rataRata);
        }

        scanner.close();
    }
}