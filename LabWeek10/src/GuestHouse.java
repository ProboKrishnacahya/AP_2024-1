import java.util.Scanner;

public class GuestHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] kamar = new int[3][3];
        
        System.out.println("Selamat Datang di Guest House Mini LINA");
        System.out.println("========================================");

        // Input nomor kamar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Masukkan nomor kamar lorong " + (i + 1) + " urutan ke-" + (j + 1) + ": ");
                    kamar[i][j] = scanner.nextInt();
                    
                    // Validasi input harus antara 1 hingga 99
                    if (kamar[i][j] >= 1 && kamar[i][j] <= 99) {
                        break;
                    } else {
                        System.out.println("Error: Nomor kamar harus antara 1 hingga 99. Silakan coba lagi.");
                    }
                }
            }
        }

        // Menampilkan Susunan Kamar
        System.out.println("\n==Susunan Kamar==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("-" + kamar[i][j] + "-\t");
            }
            System.out.println();
        }

        // Menampilkan Kamar yang Disukai Poppy
        System.out.println("\n==Poppy's Favorite Rooms==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isPrime(kamar[i][j])) {
                    System.out.print("-**-\t");
                } else {
                    System.out.print("-" + kamar[i][j] + "-\t");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan prima
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}