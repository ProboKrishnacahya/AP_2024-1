import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] penjualan = new int[3][7]; // 3 jenis kopi, 7 hari
        String[] jenisKopi = {"Kopi Hitam", "Kopi Latte", "Kopi Mocha"};

        // Input data penjualan
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan penjualan harian untuk " + jenisKopi[i] + ":");
            for (int j = 0; j < 7; j++) {
                penjualan[i][j] = scanner.nextInt(); // penjualan jenis kopi i pada hari j
            }
        }

        // Hitung rata-rata penjualan untuk setiap jenis kopi
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j]; // tambahkan penjualan jenis kopi i pada hari j ke total
            }
            double rataRata = total / 7.0;
            System.out.println("Rata-rata penjualan " + jenisKopi[i] + ": " + String.format("%.2f", rataRata));
        }

        scanner.close();
    }
}