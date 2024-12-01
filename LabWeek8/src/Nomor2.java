import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahProduk = 3;
        int jumlahHari = 7;

        // Array untuk menyimpan nama produk
        String[] namaProduk = new String[jumlahProduk];
        // Array 2D untuk menyimpan data penjualan setiap produk selama 7 hari
        int[][] penjualan = new int[jumlahProduk][jumlahHari];

        // Meminta input nama produk dari pengguna
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print("Masukkan nama produk ke-" + (i + 1) + ": ");
            namaProduk[i] = scanner.nextLine();
        }

        // Meminta input penjualan dari pengguna untuk setiap produk selama 7 hari
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Masukkan penjualan untuk " + namaProduk[i] + " selama 7 hari:");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nTotal penjualan setiap produk selama 7 hari:");
        // Menghitung dan menampilkan total penjualan setiap produk
        for (int i = 0; i < jumlahProduk; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            System.out.println("Total penjualan " + namaProduk[i] + ": " + totalPenjualan);
        }

        scanner.close();
    }
}
