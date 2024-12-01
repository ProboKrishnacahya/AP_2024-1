import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nilai = new int[3][5]; // 3 mata pelajaran, 5 siswa
        String[] pelajaran = {"Fisika", "Kimia", "Biologi"};

        // Input data nilai
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai untuk mata pelajaran " + pelajaran[i] + " dari 5 siswa:");
            for (int j = 0; j < 5; j++) {
                nilai[i][j] = scanner.nextInt(); // Input nilai siswa ke-j pada mata pelajaran ke-i
            }
        }

        // Hitung rata-rata nilai per mata pelajaran
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 5; j++) {
                total += nilai[i][j]; // Tambahkan nilai siswa ke-j pada mata pelajaran ke-i ke total
            }
            double rataRata = total / 5.0;
            System.out.println("Rata-rata nilai " + pelajaran[i] + ": " + String.format("%.1f", rataRata));
        }

        scanner.close();
    }
}