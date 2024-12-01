import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lanjut = 0;  // Inisialisasi dengan 0 agar loop bisa berjalan minimal sekali

        while (lanjut == 0) {  // Melanjutkan jika input adalah 0
            double ipk;
            String predikat = "";

            System.out.print("Masukkan IPK (0.00 - 4.00): ");
            ipk = scanner.nextDouble();

            if (ipk < 3.01) {
                System.out.println("IPK < 3.01, tidak termasuk predikat kelulusan.");
            } else if (ipk == 4.00) {
                predikat = "Maxima Cum Laude";
            } else if (ipk >= 3.71 && ipk <= 3.99) {
                predikat = "Summa Cum Laude";
            } else if (ipk >= 3.41 && ipk <= 3.70) {
                predikat = "Magna Cum Laude";
            } else if (ipk >= 3.01 && ipk <= 3.40) {
                predikat = "Cum Laude";
            } else {
                System.out.println("IPK hanya 0.00 - 4.00.");
            }

            if (!predikat.isEmpty()) {
                System.out.println("Predikat: " + predikat);
            }

            // Input 0 untuk melanjutkan, 1 untuk berhenti
            System.out.print("Masukkan 0 untuk melanjutkan atau 1 untuk berhenti: ");
            lanjut = scanner.nextInt();
        }

        System.out.println("Terima kasih.");
        scanner.close();
    }
}