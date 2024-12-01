import java.util.Scanner;

public class SeleksiAtletRenang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahAtlet;

        System.out.print("Masukkan jumlah atlet: ");
        jumlahAtlet = scanner.nextInt();
        scanner.nextLine();

        // Array untuk menyimpan nama dan waktu tempuh setiap atlet
        String[] namaAtlet = new String[jumlahAtlet];
        int[] waktuTempuh = new int[jumlahAtlet];

        // Menginput nama dan waktu tempuh dari setiap atlet
        for (int i = 0; i < jumlahAtlet; i++) {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            namaAtlet[i] = scanner.nextLine();
            System.out.print("Masukkan waktu tempuh " + namaAtlet[i] + " (dalam menit): ");
            waktuTempuh[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Variabel untuk mencari waktu tercepat dan terlambat
        int waktuTercepat = Integer.MAX_VALUE; // Inisialisasi dengan nilai maksimum
        int waktuTerlambat = -1; // Inisialisasi dengan nilai minimum
        String namaTercepat = "";
        String namaTerlambat = "";
        
        // Array untuk menandai atlet yang gagal seleksi
        boolean[] gagalSeleksi = new boolean[jumlahAtlet];

        // Loop untuk menghitung waktu tercepat, terlambat, dan menentukan seleksi
        for (int i = 0; i < waktuTempuh.length; i++) {
            // Cek waktu tercepat
            if (waktuTempuh[i] < waktuTercepat) {
                waktuTercepat = waktuTempuh[i];
                namaTercepat = namaAtlet[i]; // Simpan nama atlet tercepat
            }
            // Cek waktu terlambat
            if (waktuTempuh[i] > waktuTerlambat) {
                waktuTerlambat = waktuTempuh[i];
                namaTerlambat = namaAtlet[i]; // Simpan nama atlet terlambat
            }
            // Tandai atlet yang gagal seleksi
            if (waktuTempuh[i] > 15) {
                gagalSeleksi[i] = true; // Atlet gagal seleksi
            }
        }

        // Menampilkan hasil waktu masing-masing atlet
        System.out.println("\nWaktu tempuh masing-masing atlet:");
        for (int i = 0; i < jumlahAtlet; i++) {
            System.out.println(namaAtlet[i] + " = " + waktuTempuh[i] + " menit");
        }

        // Menampilkan atlet yang lolos seleksi
        System.out.println("\nAtlet yang lolos seleksi (waktu <= 15 menit):");
        boolean adaAtletLolos = false;
        for (int i = 0; i < waktuTempuh.length; i++) {
            if (!gagalSeleksi[i]) { // Jika atlet tidak gagal seleksi
                System.out.println(namaAtlet[i] + " dengan waktu " + waktuTempuh[i] + " menit");
                adaAtletLolos = true; // Menandai jika ada atlet yang lolos
            }
        }
        if (!adaAtletLolos) {
            System.out.println("Tidak ada atlet yang lolos.");
        }

        // Menampilkan waktu tercepat dan terlambat
        System.out.println("\nWaktu tercepat: " + waktuTercepat + " menit oleh " + namaTercepat);
        System.out.println("Waktu terlambat: " + waktuTerlambat + " menit oleh " + namaTerlambat);

        scanner.close();
    }
}