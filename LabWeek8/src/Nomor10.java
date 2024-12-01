import java.util.Scanner;

public class Nomor10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] penjualan = new int[4][7]; // 4 kategori makanan, 7 hari
        String[] kategori = {"Makanan Pembuka", "Makanan Utama", "Makanan Penutup", "Minuman"};

        // Input data penjualan
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan jumlah penjualan harian untuk " + kategori[i] + ":");
            for (int j = 0; j < 7; j++) {
                penjualan[i][j] = scanner.nextInt(); // Input penjualan harian ke-j untuk kategori ke-i
            }
        }

        // Hitung total penjualan setiap kategori
        for (int i = 0; i < 4; i++) {
            int total = 0;
            // Tambahkan penjualan harian ke-j untuk kategori ke-i ke total penjualan kategori ke-i
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j]; // Tambahkan penjualan harian ke-j untuk kategori ke-i ke total penjualan kategori ke-i
            }
            System.out.println("Total penjualan " + kategori[i] + ": " + total);
        }

        scanner.close();
    }
}