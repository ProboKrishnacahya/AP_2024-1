import java.util.Scanner;

public class Nomor9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] poin = new int[4][5]; // 4 pemain, 5 pertandingan

        // Input data poin
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan poin Pemain " + (i + 1) + " untuk 5 pertandingan:");
            for (int j = 0; j < 5; j++) {
                poin[i][j] = scanner.nextInt(); // Input poin pertandingan ke-j untuk pemain ke-i
            }
        }

        // Hitung total poin untuk setiap pemain
        for (int i = 0; i < 4; i++) {
            int total = 0;
            // Tambahkan poin pertandingan ke-j untuk pemain ke-i ke total poin pemain ke-i
            for (int j = 0; j < 5; j++) {
                total += poin[i][j]; // Tambahkan poin pertandingan ke-j untuk pemain ke-i ke total poin pemain ke-i
            }
            System.out.println("Total poin Pemain " + (i + 1) + ": " + total);
        }

        scanner.close();
    }
}