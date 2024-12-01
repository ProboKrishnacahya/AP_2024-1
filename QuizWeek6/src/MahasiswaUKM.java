import java.util.Scanner;

public class MahasiswaUKM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Input jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline yang tersisa

        // Membuat array 2 dimensi untuk Nama Mahasiswa dan Nama UKM
        String[][] dataMahasiswa = new String[jumlahMahasiswa][2];

        // Mengisi array dengan input Nama Mahasiswa dan Nama UKM
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("=================================");
            System.out.print("Input Nama Mahasiswa ke-" + (i + 1) + ": ");
            dataMahasiswa[i][0] = scanner.nextLine();

            System.out.print("Input Nama UKM Mahasiswa ke-" + (i + 1) + ": ");
            dataMahasiswa[i][1] = scanner.nextLine();
        }

        // Menampilkan hasil input
        System.out.println("\nOutput:");
        System.out.println("NAMA MAHASISWA   | NAMA UKM");
        System.out.println("============================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(dataMahasiswa[i][0] + "    | " + dataMahasiswa[i][1]);
        }

        scanner.close();
    }
}
