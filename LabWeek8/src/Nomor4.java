import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] gol = new int[5][6]; // 5 pemain, 6 pertandingan

        // Input data gol
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan jumlah gol Pemain " + (i + 1) + " dalam 6 pertandingan:");
            for (int j = 0; j < 6; j++) {
                gol[i][j] = scanner.nextInt(); // gol pemain i pada pertandingan j
            }
        }

        // Hitung total gol untuk setiap pemain
        for (int i = 0; i < 5; i++) {
            int total = 0; // total gol pemain i
            for (int j = 0; j < 6; j++) {
                total += gol[i][j]; // tambahkan gol pemain i pada pertandingan j ke total
            }
            System.out.println("Total gol Pemain " + (i + 1) + ": " + total);
        }

        scanner.close();
    }
}