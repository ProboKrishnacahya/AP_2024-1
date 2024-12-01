import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] tiket = new int[4][5]; // 4 film, 5 hari

        // Input data penjualan tiket
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan jumlah tiket terjual untuk Film " + (i + 1) + " selama 5 hari:");
            for (int j = 0; j < 5; j++) {
                tiket[i][j] = scanner.nextInt(); // Jumlah tiket terjual untuk film i pada hari j
            }
        }

        // Cari hari dengan penjualan tertinggi untuk setiap film
        for (int i = 0; i < 4; i++) {
            int maxTiket = tiket[i][0]; // Jumlah tiket terjual tertinggi untuk film i
            int hariTerbaik = 1;
            // Cari jumlah tiket terjual tertinggi untuk film i
            for (int j = 1; j < 5; j++) {
                // Jika jumlah tiket terjual pada hari j lebih besar dari jumlah tiket terjual tertinggi sebelumnya
                if (tiket[i][j] > maxTiket) {
                    maxTiket = tiket[i][j]; // Jumlah tiket terjual tertinggi untuk film i
                    hariTerbaik = j + 1; // Hari dimulai dari 1
                }
            }
            System.out.println("Film " + (i + 1) + " memiliki penjualan tertinggi pada hari " + hariTerbaik + " dengan " + maxTiket + " tiket.");
        }

        scanner.close();
    }
}