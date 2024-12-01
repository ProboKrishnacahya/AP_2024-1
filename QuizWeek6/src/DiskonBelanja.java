import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah pelanggan
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = scanner.nextInt();

        double totalPemasukan = 0; // Untuk menghitung total seluruh pemasukan

        // Loop untuk setiap pelanggan
        for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
            System.out.println("\nPelanggan ke-" + pelanggan);

            // Input level member dan hari belanja
            System.out.print("Masukkan level member (Gold/Silver/Bronze): ");
            String memberLevel = scanner.next();
            System.out.print("Masukkan hari belanja: ");
            String hari = scanner.next();

            // Input jumlah item
            System.out.print("Masukkan jumlah item yang dibeli: ");
            int jumlahItem = scanner.nextInt();

            double totalBelanja = 0; // Untuk menghitung total belanja per pelanggan

            // Loop untuk setiap item yang dibeli pelanggan
            for (int i = 1; i <= jumlahItem; i++) {
                System.out.print("Masukkan harga item ke-" + i + ": ");
                double hargaItem = scanner.nextDouble();
                totalBelanja += hargaItem;
            }

            // Tambahan diskon berdasarkan level member dan hari belanja
            double diskon = 0;

            // Gold member
            if (memberLevel.equalsIgnoreCase("Gold")) {
                if (hari.equalsIgnoreCase("Jumat")) {
                    if (totalBelanja >= 2000000) {
                        diskon = 250000;
                    } else {
                        diskon = 225000;
                    }
                } else {
                    diskon = 200000;
                }
            }
            // Silver member
            else if (memberLevel.equalsIgnoreCase("Silver")) {
                if (hari.equalsIgnoreCase("Jumat")) {
                    if (totalBelanja >= 1000000 && totalBelanja < 2000000) {
                        diskon = 150000;
                    } else {
                        diskon = 125000;
                    }
                } else {
                    diskon = 100000;
                }
            }
            // Bronze member
            else if (memberLevel.equalsIgnoreCase("Bronze")) {
                if (hari.equalsIgnoreCase("Jumat")) {
                    if (totalBelanja >= 500000 && totalBelanja < 1000000) {
                        diskon = 50000;
                    } else {
                        diskon = 25000;
                    }
                } else {
                    diskon = 10000;
                }
            }

            // Tampilkan nominal diskon yang didapatkan oleh pelanggan
            System.out.printf("Diskon untuk pelanggan %d = Rp%.2f%n", pelanggan, diskon);

            // Apply diskon to totalBelanja
            totalBelanja -= diskon;

            // Pastikan harga tidak negatif
            if (totalBelanja < 0) {
                totalBelanja = 0;
            }

            // Output total pembayaran setelah diskon untuk setiap pelanggan
            System.out.printf("Total pembayaran setelah diskon untuk pelanggan %d = Rp%.2f%n", pelanggan, totalBelanja);

            // Tambahkan total belanja pelanggan ke total pemasukan seluruh pelanggan
            totalPemasukan += totalBelanja;
        }

        // Output total pemasukan dari seluruh pelanggan
        System.out.printf("\n*** Total pemasukan toko dari seluruh pelanggan = Rp%.2f%n ***", totalPemasukan);

        scanner.close();
    }
}